import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  public getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>('http://localhost:8080/api/auth');
  }

  public login(userName: string, password: string): Observable<User> {
    return this.httpClient.get<User>('http://localhost:8080/api/auth/login/' + userName + '/' + password);
  }
}
