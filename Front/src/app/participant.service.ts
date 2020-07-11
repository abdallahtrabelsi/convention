import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from './user';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ParticipantService {

  // tslint:disable-next-line: variable-name
  constructor( private _http: HttpClient ) { }
  public loginUserFromRemote(user: Users): Observable<any>
  {
    return this._http.post<any>('http://localhost:8080/login', user,{responseType: 'text' as 'json'});
  }

}
