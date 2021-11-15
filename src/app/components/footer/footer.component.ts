import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  date = new Date().toDateString().toUpperCase();
  // day = this.date.getDate();
  // month = this.date.getMonth()+1;
  // year = this.date.getFullYear();
  
  // fullDate = `${this.day}-${this.month}-${this.year}.`;

  // to get the current year
  get todayDate() {
    return this.date;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
