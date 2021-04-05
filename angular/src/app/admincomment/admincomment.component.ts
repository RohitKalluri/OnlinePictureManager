import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admincomment',
  templateUrl: './admincomment.component.html',
  styleUrls: ['./admincomment.component.css']
})
export class AdmincommentComponent implements OnInit {

  constructor() { }
  isVisible=true;
  commentsArray:any=[];
  ngOnInit(): void {
    if(localStorage.getItem('SessionUser')=='admin'){
      this.isVisible=false;
    }
  }

}
