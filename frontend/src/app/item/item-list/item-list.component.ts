import { Component, OnInit } from '@angular/core';
import { ItemDetail } from '../item-detail';
import { ItemdetailsService } from '../itemdetails.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {
  private itemdetail: ItemDetail[];
  public message;
  public errorMessage;

  constructor( private itemdetailService: ItemdetailsService ) { }

  ngOnInit() {
    this.itemdetailService.findAll().subscribe(
     data =>this.itemdetail = data,
     error => this.errorMessage = error);
  }
  getMessage() {
    this.itemdetailService.getMessage().subscribe(
      data => this.message = data,
      error => this.errorMessage = error );
  };

}
