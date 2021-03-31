import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AdminscreenComponent } from './adminscreen/adminscreen.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
<<<<<<< HEAD
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component'
=======
import { HomeComponent } from './home/home.component';
import {MatCardModule} from '@angular/material/card';

>>>>>>> 0956b9bb498f7595f1458ffdde8241757d4bbcda
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    AdminscreenComponent,
    HomeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatIconModule,
<<<<<<< HEAD
    HttpClientModule
=======
    MatCardModule

>>>>>>> 0956b9bb498f7595f1458ffdde8241757d4bbcda
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
