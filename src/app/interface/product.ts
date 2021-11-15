import { Seller } from "./sellers";

export interface Product {
    productName : string,
    description : string,
    category : string,
    brand : string,
    price : number,
    recommendation : boolean,
    discount:number
    allSellersofProductList: Seller[]
}
