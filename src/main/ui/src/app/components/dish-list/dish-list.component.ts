import { Component, OnInit } from '@angular/core';
import {Dish} from "../../shared/models/dish.model";
import {DishService} from "../../shared/services/dish.service";

@Component({
  selector: 'app-dish-list',
  templateUrl: './dish-list.component.html',
  styleUrls: ['./dish-list.component.sass']
})
export class DishListComponent implements OnInit {

  dishesList: Dish[];

  constructor(private dishService: DishService) { }

  ngOnInit() {
    this.dishService.getDishes().subscribe(data => this.dishesList = data );
  }

}
