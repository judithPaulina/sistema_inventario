import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
})
export class ListUserComponent implements OnInit {

  cols: any;
  viewsCreateEdit: boolean = false;

  // user: user;
  // formCreateEdit: FormGroup;


  constructor(
    private userService: UserService,
  ) { }

  ngOnInit(): void {
    this.getTable();
    this.cols = [
      { field: 'nombreUsuario', header: 'Nombre', class: 'view-text' },
      { field: 'edad', header: 'Edad', class: 'view-text' },
      { field: 'fechasIngresoUsuario', header: 'Fecha de ingreso', class: 'view-text' },
      { field: 'nombreCargo', header: 'Cargo', class: 'view-text' },
    ]
  }

  getTable(){
    this.userService.get().subscribe(
      res => {
        console.log(res);
      }
    )
  }

  show() {
    this.viewsCreateEdit = true;
  }

  saveOrEdit() {

  }

}
