import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListChargesComponent } from './list-charges/list-charges.component';

const routes: Routes = [
  { path: '', component: ListChargesComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChargesRoutingModule { }
