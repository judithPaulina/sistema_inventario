import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-commodity',
  templateUrl: './list-commodity.component.html',
})
export class ListCommodityComponent implements OnInit {

  cols: any;
  viewsCreateEdit: boolean = false;

  constructor() { }

  ngOnInit(): void {

    this.cols = [
      { field: 'nombreProducto', header: 'Producto', class: 'view-text' },
      { field: 'cantidad', header: 'Cantidad', class: 'view-text' },
      { field: 'fechasIngresoMercancia', header: 'Fecha de ingreso', class: 'view-text' },
      { field: 'nombreUsuario', header: 'Nombre', class: 'view-text' },
    ]
  }

  show() {
    this.viewsCreateEdit = true;
  }

}
