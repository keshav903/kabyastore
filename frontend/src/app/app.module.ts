import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {root} from 'rxjs/internal-compatibility';


import { AppComponent } from './app.component';
import { AppRouteModule, routingComponent } from './app-route.module';
import { HttpClientModule } from '@angular/common/http';
import {EmployeeService} from './employee/employee.service';
import { SalesService} from './sales/sales.service';
import { ItemdetailsService } from './item/itemdetails.service'
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    routingComponent
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
