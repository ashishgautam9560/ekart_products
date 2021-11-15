import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductService } from './services/product.service';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';



import { ErrorComponent } from './components/error/error.component';
import { FooterComponent } from './components/footer/footer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';



import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ProductComponent } from './components/product/product.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchfilterPipe } from './pipes/searchfilter.pipe';
import { ProductInfoComponent } from './components/product-info/product-info.component';
import { Router, RouterModule, Routes } from '@angular/router';

// const routes: Routes = [
//   {
//     path:"productinfo",
//     component:ProductInfoComponent,
//     pathMatch:"full"
//   }
//   ,
//   {
//     path:"",
//     component: AppComponent,
//     pathMatch:"full"
//   }
// ];


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ErrorComponent,
    FooterComponent,
    ProductComponent,
    SearchfilterPipe,
    ProductInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    NgbModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
