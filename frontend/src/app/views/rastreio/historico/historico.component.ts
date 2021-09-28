import {Component, Input, OnInit} from '@angular/core';
import {Historico} from "../../../models/historico";

@Component({
  selector: 'app-historico',
  templateUrl: './historico.component.html',
  styleUrls: ['./historico.component.css']
})
export class HistoricoComponent implements OnInit {

  constructor() {
  }

  @Input() historicos!: Historico[];

  ngOnInit(): void {
  }

}
