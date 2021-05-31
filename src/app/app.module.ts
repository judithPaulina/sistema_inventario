import { NgModule } from '@angular/core';
import { MessageService } from 'primeng/api';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { ListChargesComponent } from './views/charges/list-charges/list-charges.component';
import { ListCommodityComponent } from './views/commodity/list-commodity/list-commodity.component';
import { ContainerComponent } from './views/container/container.component';
import { ListUserComponent } from './views/user/list-user/list-user.component';

import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { ToolbarModule } from 'primeng/toolbar';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { DialogModule } from 'primeng/dialog';
import { DividerModule } from 'primeng/divider';
import { DropdownModule } from 'primeng/dropdown';
import { ToastModule } from 'primeng/toast';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    ContainerComponent,
    ListUserComponent,
    ListChargesComponent,
    ListCommodityComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    AppRoutingModule,
    ToolbarModule,
    TableModule,
    ButtonModule,
    DialogModule,
    DividerModule,
    DropdownModule,
    ToastModule,
    ReactiveFormsModule,

  ],
  providers: [ MessageService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
