import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import {EmployeeAddComponent } from './employee/employee-add/employee-add.component';
import {ItemListComponent} from './item/item-list/item-list.component';

const routes: Routes = [
  { path: 'employee', component: EmployeeListComponent },
  { path: 'addemployee', component: EmployeeAddComponent},
  { path: 'itemdetail', component: ItemListComponent}
];

@NgModule({
  declarations: [],
  imports: [
   // CommonModule,
    RouterModule.forRoot(routes)
   ],
  exports: [RouterModule]
})
export class AppRouteModule { }
