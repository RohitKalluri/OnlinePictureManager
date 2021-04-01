import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {HttpClient} from '@angular/common/http'
import { stringify } from '@angular/compiler/src/util';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  name!:string
  pass!:string
  constructor(private route:Router,private httpClient:HttpClient) { }

  ngOnInit(): void {
    localStorage.setItem('SessionUser',this.name);
  }

  public postData(){

      if(this.name==='admin'&&this.pass==='admin')
        this.route.navigate(['admin'])

      else{
        this.httpClient.post('http://localhost:8080/login',{
          email:this.name,
          password:this.pass
        },{ observe: 'response' })
        .subscribe((response) => {
          if(response.body==true)
            this.route.navigate(['home']);
          else
            alert('Invalid Credentials!! ')
        })
      }
  }
}
