import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ParticipantComponent } from './components/participant/participant.component';
import { FormsModule } from '@angular/forms';
import { LParticipantComponent } from './components/lparticipant/lparticipant.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ParticipantComponent,
    LParticipantComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
