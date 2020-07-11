import { LParticipantComponent } from './components/lparticipant/lparticipant.component';

import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {
    path : '' , component: LoginComponent,
  },
  {
    path : 'LParticipantComponent' , component : LParticipantComponent,

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
