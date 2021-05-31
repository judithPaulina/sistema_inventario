import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpOptions = { headers: new HttpHeaders({}) };
  readonly url = environment.url;


  constructor(private http: HttpClient) { }

  get() {
    return this.http.get(this.url+'usuario', this.httpOptions);
  }

  // save(card){
  //   return this.http.post(this.url+'/card/', card, this.httpOptions );
  // }

  // update(card){
  //   let id = card.id;
  //   return this.http.put(this.url+`/card/${id}/`, card, this.httpOptions );
  // }

  // delete(id){
  //   return this.http.post(this.url+'/card/delete_list/', id,  this.httpOptions);
  // }

  // getFormaPago() {
  //   return this.http.get(this.url+'/payment_type/', this.httpOptions);
  // }

}
