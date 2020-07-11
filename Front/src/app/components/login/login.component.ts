import { LParticipantComponent } from './../lparticipant/lparticipant.component';
import { Users } from './../../user';
import { ParticipantService } from './../../participant.service';
import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';
import { Route } from '@angular/compiler/src/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = new Users();
  msg = '';
  // tslint:disable-next-line: variable-name
  constructor( private _service: ParticipantService , private _router: Router) { }

  // tslint:disable-next-line: typedef
  ngOnInit()  {
  }

  // tslint:disable-next-line: typedef
  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(

      data => {console.log('reponse recieved');
               this._router.navigate(['/LParticipantComponent'] );
         //      window.location.href = 'http://localhost:8080/registeruser';
    },
      erreur => {console.log('exception occured');
          // tslint:disable-next-line: align
          this.msg = 'Email or Password Incorrect !!, please try again';
    }

  );

  }

}
