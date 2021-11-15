import { Pipe, PipeTransform } from '@angular/core';
import { Product } from '../interface/product';

@Pipe({
  name: 'searchfilter'
})
export class SearchfilterPipe implements PipeTransform {

  transform(Products: Product[], searchValue:string): Product[] {

    if(!Products || !searchValue)
    {
      return Products;
    }

    return Products.filter(product => 
      product.productName.toLocaleLowerCase().includes(searchValue.toLocaleLowerCase()) ||
      product.category.toLocaleLowerCase().includes(searchValue.toLocaleLowerCase()) ||
      product.brand.toLocaleLowerCase().includes(searchValue.toLocaleLowerCase()) ||
      product.price.toPrecision().includes(searchValue.toLocaleLowerCase()) 
      );
      
  }

}
