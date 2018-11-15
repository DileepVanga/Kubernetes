import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs/Rx';
import 'rxjs/operator/map';
import 'rxjs/operator/catch';

@Injectable()
export class ApiService {
  constructor( private http:HttpClient
  ) {}

  private formatErrors(error: any) {
    return Observable.throw(error.json());
  }

  get(path: string): Observable<any> {
    return this.http.get(`${environment.api_url}${path}`)
      .catch(this.formatErrors);
  }

}
