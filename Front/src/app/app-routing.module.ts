import { LParticipantComponent } from './components/lparticipant/lparticipant.component';

import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
import { LoginComponent } from './components/login/login.component';
=======
import { Convention } from './convention';
import { AddConventionComponent } from './add-convention/add-convention.component';
import { ConventionComponent } from './convention/convention.component';
>>>>>>> branch 'master' of https://github.com/abdallahtrabelsi/convention

const routes: Routes = [
<<<<<<< HEAD
  {
    path : '' , component: LoginComponent,
  },
  {
    path : 'LParticipantComponent' , component : LParticipantComponent,

  }
=======
  { path: '', component: ConventionComponent },
  { path: 'add', component: AddConventionComponent },
>>>>>>> branch 'master' of https://github.com/abdallahtrabelsi/convention
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
