import {Situacao} from "../enums/situacao";
import {Historico} from "./historico";

export interface Rastreio {
  codigo: string;
  situacao: Situacao,
  historicos: Array<Historico>
}
