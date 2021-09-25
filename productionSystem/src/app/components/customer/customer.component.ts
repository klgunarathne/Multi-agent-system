import { User } from './../../models/user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {
  user!: User;
  constructor() { }

  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user') || '');
  }

}
