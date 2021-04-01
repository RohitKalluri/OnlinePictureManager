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
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import {MatCardModule} from '@angular/material/card';
import { UploadImageComponent } from './upload-image/upload-image.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AuthguardServiceService } from "./authguard-service.service";
import { ProfileComponent } from './profile/profile.component';
import {MatGridListModule} from '@angular/material/grid-list';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    AdminscreenComponent,
    HomeComponent,
    UploadImageComponent,
    ProfileComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatIconModule,
    HttpClientModule,
    MatCardModule,
    ReactiveFormsModule,
    MatGridListModule

  ],
  providers: [
    AuthguardServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
