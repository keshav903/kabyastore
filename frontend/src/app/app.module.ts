import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AppRouteModule } from './app-route.module';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import {EmployeeService} from './employee/employee.service';
import { EmployeeAddComponent } from './employee/employee-add/employee-add.component';
import { ItemListComponent } from './item/item-list/item-list.component';
import {ItemdetailsService} from './item/itemdetails.service';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeAddComponent,
    ItemListComponent
  ],
  imports: [
    BrowserModule,
    AppRouteModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [EmployeeService, ItemdetailsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
