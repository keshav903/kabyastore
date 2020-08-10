import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { ItemDetail } from './item-detail';
import { Observable, throwError, pipe} from 'rxjs';
import { catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ItemdetailsService {
  private itemdetailUrl: string;

  constructor(private http: HttpClient) {
    this.itemdetailUrl = 'http://localhost:8083/itemdetail';
  }
  public findAll() {
    return this.http.get<ItemDetail[]>( this.itemdetailUrl + '/all');
  }
  public getMessage(){
    return this.http.get(this.itemdetailUrl, {responseType: 'text'})
                                .pipe(catchError(this.errorHandler));
  }
  public findAllByName( name: string) {
    return this.http.get<ItemDetail[]>(this.itemdetailUrl + '/' + name)
                   .pipe(catchError(this.errorHandler));
  }
  public findById( id: string) {
    return this.http.get<ItemDetail>(this.itemdetailUrl + '/item/' + id);
  }
  public findAllByNameAndBrand(name: string, brand: string) {
    return this.http.get<ItemDetail[]>(this.itemdetailUrl + '/' + name + '/brand/' + brand);
  }
  errorHandler( error :HttpErrorResponse) {
     return throwError('The error occurred ' + error);
  }
}
