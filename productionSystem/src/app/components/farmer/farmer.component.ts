import { User } from './../../models/user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-farmer',
  templateUrl: './farmer.component.html',
  styleUrls: ['./farmer.component.scss']
})
export class FarmerComponent implements OnInit {
  user!: User;
  constructor() { }

  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user') || '');
  }

}
