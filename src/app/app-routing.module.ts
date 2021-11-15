import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ErrorComponent } from './components/error/error.component';
import { ProductInfoComponent } from './components/product-info/product-info.component';
import { ProductComponent } from './components/product/product.component';

const routes: Routes = [
  {
    path:"todaydeals",
    component: ProductInfoComponent,
    pathMatch:"full"
  },
  {
    path:"",
    component: ProductComponent,
    pathMatch:"full"
  },
  {
    path:"home",
    component: ProductComponent,
    pathMatch:"full"
  },
  {
    path:"**",
    component:ErrorComponent
  }
  // {
  //   path:"productinfo",
  //   component:ProductInfoComponent,
  //   pathMatch:"full"
  // }
  // ,
  // {
  //   path:"",
  //   component: AppComponent,
  //   pathMatch:"full"
  // }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
