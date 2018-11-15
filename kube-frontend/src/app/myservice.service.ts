import { Injectable } from '@angular/core';

@Injectable()
export class MyserviceService {

  coins= [
    {id: 1, name: 'BTC'},
    {id: 2, name: 'XRP'}
  ];

  constructor() { }

  getMyItems()
  {
    return this.coins;
  }


}
