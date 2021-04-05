import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {
  images:String[]=['1','2','3','4'];
  data:any=[];
  constructor(private httpClient: HttpClient,private route:Router) { }
  isVisible=true;
  ngOnInit(): void {
    if(localStorage.getItem('SessionUser')=="null"){
      alert('Please login/signup to access our website services!!!')
      this.route.navigate([''])
    }
    if(localStorage.getItem('SessionUser')=='admin'){
      this.isVisible=false;
    }
    this.httpClient.get('https://8080-fcffcdaacacafeccbeefdaacddcadfaffe.examlyiopb.examly.io/image/',{observe:"response"})
     .subscribe(
       (response) => {
         this.data=response.body
         for(var i=0;i<this.data.length;i++){
           this.data[i].image='data:image/jpeg;base64,' + this.data[i].image;
         }
        // console.log(this.data)
       }
     )
  }
  public icon = 'favorite_border'; 
  public iconId!:any
  public iconic!:any
public toggleIcon(imageId:any) {
    if (this.icon === 'favorite_border') {
        this.iconic = 'favorite';
        this.iconId=imageId;
    } else {
        this.icon = 'favorite_border';
    }
}
public commentButtonClick(imageName:any,imageId:any){
   //this.route.navigate(['comments'])
   console.log(imageId)
   localStorage.setItem('imageId',imageId)
   this.route.navigate(['comments'],{
     state:{
       name:localStorage.getItem('SessionUser'),
       id:imageId
     }
   })
}

}
