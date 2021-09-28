import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Rastreio} from "../../models/rastreio";
import {RastreioService} from "../../services/rastreio.service";

@Component({
  selector: 'app-rastreio',
  templateUrl: './rastreio.component.html',
  styleUrls: ['./rastreio.component.css']
})
export class RastreioComponent implements OnInit {

  constructor(private route: ActivatedRoute, private rastreioService: RastreioService) {
  }

  codigo!: string;
  imagem!: string;
  titulo!: string;
  rastreio = {} as Rastreio;
  notFound = false;

  situacaoMap = {
    EXTRAVIADO: {
      titulo: 'Pedido extraviado',
      imagem: 'extraviado.jpg'
    },
    RECEBIDO: {
      titulo: 'Pedido recebido pela transportadora',
      imagem: 'recebido.jpg'
    },
    EM_PERCURSO: {
      titulo: 'Pedido a caminho do destinatário',
      imagem: 'em_percurso.jpg'
    },
    ENTREGUE: {
      titulo: 'Pedido entregue ao destinatário',
      imagem: 'entregue.jpg'
    }
  }

  ngOnInit(): void {
    this.codigo = this.route.snapshot.params['codigo'];
    this.rastreioService.getRastreioByCodigo(this.codigo)
      .subscribe((rastreio: Rastreio) => {
        this.rastreio = rastreio
        this.imagem = this.situacaoMap[rastreio.situacao].imagem;
        this.titulo = this.situacaoMap[rastreio.situacao].titulo;
      }, (e) => {
        console.log(e)
        if(e.status === 404) {
          this.notFound = true;
        }
      });
  }

}
