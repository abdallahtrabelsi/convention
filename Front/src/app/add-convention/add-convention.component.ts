import { Component, OnInit } from '@angular/core';
import { Convention } from '../convention';
import { ConventionServiceService } from '../convention-service.service';


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
  public addConvention(){
    let resp = this.service.addConvention(this.convention);
    resp.subscribe((data) => this.message = data);
    window.location.href= 'http://localhost:4200';
   }



  ngOnInit(): void {

    let resp = this.service.getType();
    resp.subscribe((data) => this.type = data);
  }

}
