import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ItemDetail } from './item-detail';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItemdetailsService {
  private itemdetailUrl: string;

  constructor(private http: HttpClient) {
    this.itemdetailUrl = 'http://localhost:8080/itemdetail';
  }
  public findAll() {
    return this.http.get<ItemDetail[]>( this.itemdetailUrl + '/all');
  }
  public findAllByName( name: string) {
    return this.http.get<ItemDetail[]>(this.itemdetailUrl + '/' + name);
  }
  public findById( id: string) {
    return this.http.get<ItemDetail>(this.itemdetailUrl + '/item/' + id);
  }
  public findAllByNameAndBrand(name: string, brand: string) {
    return this.http.get<ItemDetail[]>(this.itemdetailUrl + '/' + name + '/brand/' + brand);
  }
}
