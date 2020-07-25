import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//<<<<<<< HEAD
import { LoginComponent } from './components/login/login.component';
import { ParticipantComponent } from './components/participant/participant.component';
import { FormsModule } from '@angular/forms';
import { LParticipantComponent } from './components/lparticipant/lparticipant.component';
//=======
import { ConventionComponent } from './components/convention/convention.component';
import { ConventionServiceService } from './convention-service.service';
//import { HttpClientModule } from '@angular/common/http';
//import { FormsModule } from '@angular/forms';
import { AddConventionComponent } from './components/add-convention/add-convention.component';
//>>>>>>> branch 'master' of https://github.com/abdallahtrabelsi/convention


@NgModule({
  declarations: [
    AppComponent,
//<<<<<<< HEAD
    LoginComponent,
    ParticipantComponent,
    LParticipantComponent,
//=======
    ConventionComponent,
    AddConventionComponent,
//>>>>>>> branch 'master' of https://github.com/abdallahtrabelsi/convention
  ],
  imports: [
    BrowserModule,
//<<<<<<< HEAD
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
//=======
    AppRoutingModule,
    HttpClientModule,
    FormsModule,

//>>>>>>> branch 'master' of https://github.com/abdallahtrabelsi/convention
  ],
  providers: [ConventionServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
