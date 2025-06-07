import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import { ProductForm } from "./products/product-form/product-form";
import { ProductList } from "./products/product-list/product-list";

//Decorador- agregar componentes
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, MatToolbarModule, MatButtonModule, ProductForm, ProductList],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
  protected title = 'My Products';
  page = 0;
}
