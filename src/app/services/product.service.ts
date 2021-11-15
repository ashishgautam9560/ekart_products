import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../interface/product';
import { Seller } from '../interface/sellers';



@Injectable({
  providedIn: 'root'
})
export class ProductService {


  searchOption=[]
  public postsData?: Product[] 

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:8080/products/getAll");
  }

  getAllSelers(prodName: string): Observable<Seller[]>{
    return this.http.get<Seller[]>("http://localhost:8080/products/getPricefromAllSellers?prodName=" + `${prodName}`);
  }

  getDealsProduct(): Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:8080/products/getDealProducts");
  }

  // findByTitle(prodName: string): Observable<any> {
  //   return this.http.get("http://localhost:8080/products/get?prodName=" + `${prodName}`)
    
  // }

  // getProductOnDeals(){
  //   return this.http.get("http://localhost:8080/products/getDealProducts")
  // }

  // getRecommendedProducts(){
  //   return this.http.get("http://localhost:8080/products/getReccomendedProducts")
  // }

}
