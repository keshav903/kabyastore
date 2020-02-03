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
import { SalesComponent} from './sales/sales.component';
import { SalesService} from './sales/sales.service';
import { HomeComponent } from './home/home.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import {root} from 'rxjs/internal-compatibility';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeAddComponent,
    ItemListComponent,
    HomeComponent,
    PagenotfoundComponent,
    SalesComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRouteModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [EmployeeService, ItemdetailsService, SalesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
