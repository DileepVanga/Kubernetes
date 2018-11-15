import {Component, OnInit} from '@angular/core';
import {ApiService} from "./api.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  isEnabled: boolean;
  names: any;
   constructor (private apiService: ApiService) {
   }

  ngOnInit() {
     this.isEnabled = false;
  }

  getTvShowsList() {
     this.apiService.get("/tvShows")
       .subscribe(data => this.names = data);
    this.isEnabled = true;
  }

  clearNames() {
     this.isEnabled = false;
     this.names = [];
  }
}
