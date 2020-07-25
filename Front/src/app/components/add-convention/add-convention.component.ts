import { Component, OnInit, SystemJsNgModuleLoader } from '@angular/core';
import { Convention } from 'src/app/convention';
import { ConventionServiceService } from 'src/app/convention-service.service';
//import { Convention } from './convention';
//import { ConventionServiceService } from '../convention-service.service';


@Component({
  selector: 'app-add-convention',
  templateUrl: './add-convention.component.html',
  styleUrls: ['./add-convention.component.css']
})
export class AddConventionComponent implements OnInit {

  x = new Date('2020-08-08');
  convention: Convention = new Convention('', this.x, this.x, this.x, 'n', 'n');

  constructor(private service : ConventionServiceService) { }
  type: any;
  message: any;
  sel: string;
  public addConvention(){
    this.convention.type=this.sel;
    let resp = this.service.addConvention(this.convention);
    resp.subscribe((data) => this.message = data);
    window.location.href= 'http://localhost:4200';
   }
   selectChangeHandler(event: any) {
    //update the ui


    this.sel = event.target.value;
    console.log(this.sel);
  }


  ngOnInit(): void {

    let resp = this.service.getType();
    resp.subscribe((data) => this.type = data);
  }

}
