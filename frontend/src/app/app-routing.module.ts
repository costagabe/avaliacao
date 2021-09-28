import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./views/home/home.component";
import {RastreioComponent} from "./views/rastreio/rastreio.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: ':codigo', component: RastreioComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
