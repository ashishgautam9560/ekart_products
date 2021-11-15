import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/interface/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-info',
  templateUrl: './product-info.component.html',
  styleUrls: ['./product-info.component.css']
})
export class ProductInfoComponent implements OnInit {

  product!: Product[];
  isVisible: boolean = false;
  searchValue!: string;

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getDealsProduct().subscribe( (result) =>
      {this.product=result}
    );
  }

  hideList(){
    this.isVisible = true;
  }

}
