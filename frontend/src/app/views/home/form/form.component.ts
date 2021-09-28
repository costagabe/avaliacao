import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  formGroup = new FormGroup({
    codigo: new FormControl('', [
      Validators.required
    ])
  });

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  async sendForm() {
    const codigo = this.formGroup.get("codigo")?.value;
    if (codigo.length) {
      await this.router.navigate(['/', codigo])
    }
  }

}
