import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpEventType } from '@angular/common/http';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {
  images:String[]=['1','2','3','4'];
  data:any=[];
  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void {
    this.httpClient.get('http://localhost:8080/image/',{observe:"response"})
     .subscribe(
       (response) => {
         this.data=response.body
         for(var i=0;i<this.data.length;i++){
           this.data[i].image='data:image/jpeg;base64,' + this.data[i].image;
         }
        // console.log(this.data)
       }
     )
     //console.log(localStorage.getItem('SessionUser'));
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
