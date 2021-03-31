import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminscreenComponent } from './adminscreen/adminscreen.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UploadImageComponent } from './upload-image/upload-image.component';

const routes: Routes = [
  {path:"",component:HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
   