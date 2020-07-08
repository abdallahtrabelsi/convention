import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConventionComponent } from './convention/convention.component';
import { ConventionServiceService } from './convention-service.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AddConventionComponent } from './add-convention/add-convention.component';


@NgModule({
  declarations: [
    AppComponent,
    ConventionComponent,
    AddConventionComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,

  ],
  providers: [ConventionServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
