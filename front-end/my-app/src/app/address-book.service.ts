import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { catchError, retry } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({
    // 'Content-Type': 'application/json',
    'Content-type': 'application/json; charset=UTF-8'
  })
};

@Injectable({
  providedIn: 'root'
})
export class AddressBookService {

  constructor(private http: HttpClient) { }
  items = [];

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  }

  addItem(address) {
    this.items.push(address);
    return fetch('https://jsonplaceholder.typicode.com/users', {
      method: 'POST',
      body: JSON.stringify(address),
      headers: {
        'Content-type': 'application/json; charset=UTF-8'
      }
    })
      .then(response => response.json());
  }

  getItems() {
    return this.http.get('https://jsonplaceholder.typicode.com/users');
    // return this.items;
  }

  clearItems() {
    this.items = [];
    return this.items;
  }
}
