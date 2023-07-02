import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Recipe } from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css'],
})
export class RecipeListComponent implements OnInit {
  @Output('recipeSelected') recipeSelected=new EventEmitter<Recipe>();
  recipes:Recipe[]= [
    new Recipe("Veg Burger",
    "This is Burger",
    "https://www.thespruceeats.com/thmb/SL8EAepb4eUPYGpLt3nrhll5xXw=/940x0/filters:no_upscale():max_bytes(150000):strip_icc()/indian-style-burger-1957599-hero-01-266103a4bb4e4ee7b5feb4da2d2e99da.jpg"),
    new Recipe("Veg Burger",
    "This is Burger",
    "https://www.thespruceeats.com/thmb/SL8EAepb4eUPYGpLt3nrhll5xXw=/940x0/filters:no_upscale():max_bytes(150000):strip_icc()/indian-style-burger-1957599-hero-01-266103a4bb4e4ee7b5feb4da2d2e99da.jpg"),
    new Recipe("Veg Burger",
    "This is Burger",
    "https://www.thespruceeats.com/thmb/SL8EAepb4eUPYGpLt3nrhll5xXw=/940x0/filters:no_upscale():max_bytes(150000):strip_icc()/indian-style-burger-1957599-hero-01-266103a4bb4e4ee7b5feb4da2d2e99da.jpg"),
    new Recipe("Veg Burger",
    "This is Burger",
    "https://www.thespruceeats.com/thmb/SL8EAepb4eUPYGpLt3nrhll5xXw=/940x0/filters:no_upscale():max_bytes(150000):strip_icc()/indian-style-burger-1957599-hero-01-266103a4bb4e4ee7b5feb4da2d2e99da.jpg")
    
  ];
  constructor() {}

  ngOnInit(): void {}

  onRecipeSelected(recipe:Recipe){
    this.recipeSelected.emit(recipe);
  }
}
