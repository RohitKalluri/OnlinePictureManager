import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  images:String[]=['1','2','3','4','5','1','2','3','4','5'];
  constructor() { }

  ngOnInit(): void {
  }
  public icon = 'favorite_border'; 

public toggleIcon() {
    if (this.icon === 'favorite_border') {
        this.icon = 'favorite';
    } else {
        this.icon = 'favorite_border';
    }
}

}
