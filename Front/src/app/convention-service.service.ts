import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ConventionServiceService {

  constructor(private http: HttpClient) { }

  public addConvention(Convention){
   return this.http.post("http://localhost:8080/convention/addconv", Convention, {responseType: 'text' as 'json'});
  }
  public getConvention(){
    return this.http.get('http://localhost:8080/convention/getconv');
  }
  public delConvention(id: number){
    return this.http.delete('http://localhost:8080/convention/delconv/' + id);
  }
}
