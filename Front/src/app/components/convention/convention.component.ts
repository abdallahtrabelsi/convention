import { Component, OnInit } from '@angular/core';
import { ConventionServiceService } from 'src/app/convention-service.service';
import { Convention } from 'src/app/convention';
//import { Convention } from '../convention';
//import { ConventionServiceService } from '../convention-service.service';

@Component({
  selector: 'app-convention',
  templateUrl: './convention.component.html',
  styleUrls: ['./convention.component.css']
})
export class ConventionComponent implements OnInit {
  x = new Date('2020-08-08');
 convention: Convention = new Convention('', this.x, this.x, this.x, 'n', 'n');
  variable: string;
  constructor(private service: ConventionServiceService) { }
  conventionn: any;

   public delConvention (id: number){
    let resp = this.service.delConvention(id);
    resp.subscribe((data) => this.conventionn = data);

   }
   public searchConvention(variable: string){
    let resp = this.service.searchConvention(variable);
    resp.subscribe((data) => this.conventionn = data);

   }
  ngOnInit(): void {
    let resp = this.service.getConvention();
    resp.subscribe((data) => this.conventionn = data);
  }

}
