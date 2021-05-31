import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-charges',
  templateUrl: './list-charges.component.html',
})
export class ListChargesComponent implements OnInit {

  cols: any;
  viewsCreateEdit: boolean = false;

  constructor() { }

  ngOnInit(): void {
    this.cols = [
      { field: 'nombreCargo', header: 'Cargo', class: 'view-text' },
    ]
  }

  show() {
    this.viewsCreateEdit = true;
  }

}
