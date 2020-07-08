import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Convention } from './convention';
import { AddConventionComponent } from './add-convention/add-convention.component';
import { ConventionComponent } from './convention/convention.component';

const routes: Routes = [
  { path: '', component: ConventionComponent },
  { path: 'add', component: AddConventionComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
