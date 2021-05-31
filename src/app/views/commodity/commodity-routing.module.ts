import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListCommodityComponent } from './list-commodity/list-commodity.component';

const routes: Routes = [
  { path:'', component: ListCommodityComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CommodityRoutingModule { }
