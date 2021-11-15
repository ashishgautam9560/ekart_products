import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/interface/product';
import { ProductService } from 'src/app/services/product.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  product!: Product[];
  searchValue!: string;

  // product: any;
  // title: string = "asus"
  temp: string="hello"
  isVisible: boolean = false;
  

  constructor(private productService: ProductService) { }

  ngOnInit():any {
    this.productService.getAllProducts().subscribe( (result) =>
      {this.product=result}
    );
  }

  hideList(){
    this.isVisible = true;
  }



  // this.http.get<Product[]>('http://localhost:8080/products/getAll').subscribe( (result) =>
    //   {this.product=result}
    // );

    // let response = this.productService.findByTitle(this.title);
    // response.subscribe((data)=>this.product=data);

  // get(){
  //   let response = this.productService.getProductOnDeals();
  //   response.subscribe((data)=>this.product=data);
  // }

  // getProductsbyTitle(title:string){
  //   let response = this.productService.findByTitle(this.title);
  //   response.subscribe((data)=>this.product=data);
  // }


}
