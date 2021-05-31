import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListChargesComponent } from './views/charges/list-charges/list-charges.component';
import { ListCommodityComponent } from './views/commodity/list-commodity/list-commodity.component';
import { ContainerComponent } from './views/container/container.component';
import { ListUserComponent } from './views/user/list-user/list-user.component';

const routes: Routes = [
  { path: '', component: ContainerComponent,
    children: [
      { path: '', component: ListUserComponent },
      { path: 'cargos', component: ListChargesComponent },
      { path: 'mercancia', component: ListCommodityComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
