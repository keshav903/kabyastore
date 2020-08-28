import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import {EmployeeAddComponent } from './employee/employee-add/employee-add.component';
import {ItemListComponent} from './item/item-list/item-list.component';
import { ItemDisplayComponent } from './component/item-display/item-display.component';
import {PagenotfoundComponent} from './pagenotfound/pagenotfound.component';
import {SalesComponent} from './sales/sales.component';
import { ContactComponent } from './component/contact/contact.component';
import { EmployeeDetailComponent } from './employee/employee-detail/employee-detail.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home'},
  { path: 'home', component: HomeComponent},
  { path: 'employee', component: EmployeeListComponent },
  { path: 'employee/:id', component: EmployeeDetailComponent },
  { path: 'addemployee', component: EmployeeAddComponent},
  { path: 'itemdetail', component: ItemListComponent},
  { path: 'sales', component: SalesComponent},
  { path: 'contact', component: ContactComponent },
  { path: '404', component: PagenotfoundComponent},
  { path: '**', redirectTo: '/404'}
];
//
@NgModule({
  declarations: [],
  imports: [
   // CommonModule,
    RouterModule.forRoot(routes)
   ],
  exports: [RouterModule]
})
export class AppRouteModule { }
export const routingComponent = [HomeComponent, EmployeeListComponent , EmployeeAddComponent,
                            ItemListComponent,  ItemDisplayComponent, SalesComponent, ContactComponent,EmployeeDetailComponent,
                             PagenotfoundComponent];
