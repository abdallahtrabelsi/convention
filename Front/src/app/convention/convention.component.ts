import { Component, OnInit } from '@angular/core';
import { Convention } from '../convention';
import { ConventionServiceService } from '../convention-service.service';

@Component({
  selector: 'app-convention',
  templateUrl: './convention.component.html',
  styleUrls: ['./convention.component.css']
})
export class ConventionComponent implements OnInit {
  x = new Date('2020-08-08');
 convention: Convention = new Convention('', this.x, this.x, this.x, 'n', 'n');
  email: string;
  constructor(private service: ConventionServiceService) { }
  conventionn: any;

   public delConvention(id: number){
    let resp = this.service.delConvention(id);
    resp.subscribe((data) => this.conventionn = data);

   }
  ngOnInit(): void {
    let resp = this.service.getConvention();
    resp.subscribe((data) => this.conventionn = data);
  }

}
