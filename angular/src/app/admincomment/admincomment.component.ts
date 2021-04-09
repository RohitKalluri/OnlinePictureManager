import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admincomment',
  templateUrl: './admincomment.component.html',
  styleUrls: ['./admincomment.component.css']
})
export class AdmincommentComponent implements OnInit {

  constructor(private httpClient: HttpClient,private route:Router) { }
  isVisible=true;
  commentsArray:any=[];
  ngOnInit(): void {
    if(localStorage.getItem('SessionUser')=='admin'){
      this.isVisible=false;
    }
   this.httpClient.get('https://localhost:8080/comment/', { observe: 'response' })
      .subscribe((response) => {
        this.commentsArray=response.body
        console.log(this.commentsArray)
      }
      );

  }

}
