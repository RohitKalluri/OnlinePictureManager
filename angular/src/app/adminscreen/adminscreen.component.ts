import { Component, OnInit } from '@angular/core';
import { User } from 'app/user.model';

@Component({
  selector: 'app-adminscreen',
  templateUrl: './adminscreen.component.html',
  styleUrls: ['./adminscreen.component.css']
})
export class AdminscreenComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  u=new User("abc@gmail.com","abc","abcdef","123456789");
  //Users: User[];
   
  /*constructor(
  private httpClientService: UserserviceService,
  ) { }

  ngOnInit() {
  }
  /*getAllUsers(User){
    this.httpClientService.getUsers().subscribe(
      response =>{this.Users = response;}
     );
  }

  deleteEmployee(user: User): void {
    this.httpClientService.deleteUser(user)
      .subscribe( data => {
        this.Users = this.Users.filter(u => u !== user);
      })
  };*/

}
