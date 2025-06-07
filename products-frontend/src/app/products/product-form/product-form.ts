import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';

@Component({
  selector: 'app-product-form',
  imports: [MatFormFieldModule, MatInputModule, MatButtonModule],
  templateUrl: './product-form.html',
  styleUrl: './product-form.scss'
})
export class ProductForm {

  onButtonClick() {
    alert("Agregar producto")
  }

}
