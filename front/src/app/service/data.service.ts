import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {User} from '../entities/user';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

  getData(): Observable<User> {
    return this.http.get<User>('http://localhost:8080/bff/user/1');
  }

  getAllData(): Observable<User[]> {
    return this.http.get<User[]>('http://localhost:8080/bff/users');
  }

  deleteUser(id: number) {
    return this.http.delete(`http://localhost:8080/bff/user/${id}`);
  }
}
