import { User } from './../../models/user';
import { UserService } from './../../services/user.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent implements OnInit {
  loginFormGropup!: FormGroup;
  constructor(private fb: FormBuilder, private userService: UserService, private router: Router) {}

  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.loginFormGropup = this.fb.group({
      username: [''],
      password: [''],
    });
  }

  onSubmit() {
    this.userService
      .login(
        this.loginFormGropup.controls['username'].value,
        this.loginFormGropup.controls['password'].value
      )
      .subscribe(
        (data: User) => {
          localStorage.setItem('user', JSON.stringify(data));
          if (data?.role === 'ROLE_CUSTOMER') {
            this.router.navigate(['layout', 'customer']);
          }
          if (data?.role === 'ROLE_FARMER') {
            this.router.navigate(['layout', 'farmer']);
          }
          if (data?.role === 'ROLE_SELLER') {
            this.router.navigate(['layout', 'seller']);
          }
          if (data?.role === 'ROLE_TRANSPOTER') {
            this.router.navigate(['layout', 'transpoter']);
          }
        },
        (error) => {
          console.log('error');
        }
      );
  }
}
