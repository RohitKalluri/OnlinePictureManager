import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminscreenComponent } from './adminscreen/adminscreen.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
<<<<<<< HEAD
  {path:"",component:LoginComponent},
  {path:"signup",component:SignupComponent},
  {path:"admin",component:AdminscreenComponent},
  {path:'home',component: HomeComponent }
=======
  {path:"",component:HomeComponent},
>>>>>>> 0956b9bb498f7595f1458ffdde8241757d4bbcda
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
   