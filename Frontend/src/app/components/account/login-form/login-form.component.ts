import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.scss']
})
export class LoginFormComponent implements OnInit {

  // @Output Moves Content in the parent elements
  @Output() onSubmitLoginEvent = new EventEmitter();
  @Output() onSubmitRegisterEvent = new EventEmitter();

  active: string = "login";
  firstName: string = "";
  lastName: string = "";
  userName: string = "";
  password: string = "";

  // Method to switch between the forms
  onLoginTab(): void {
    this.active = "login";
  }

  onRegisterTab(): void {
    this.active = "register";
  }

  onSubmitLogin(): void {
    this.onSubmitLoginEvent.emit({"login": this.userName, "password": this.password})
  }

  onSubmitRegister(): void {
    this.onSubmitRegisterEvent.emit({
      "firstName": this.firstName,
      "lastName": this.lastName,
      "userName": this.userName,
      "password": this.password
    })
  }

  constructor() { }

  ngOnInit(): void {
  }

}
