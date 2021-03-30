import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminscreenComponent } from './adminscreen/adminscreen.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {path:"",component:AdminscreenComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
