import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  images : String[]=['e','f','g','h','i','j','k','l','m','a','b','c','d','e','f','g','h','i','j','k','l','m'];
  constructor() { }

  ngOnInit(): void {
  }

}
