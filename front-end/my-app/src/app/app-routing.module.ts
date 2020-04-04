import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddressBookComponent } from './address-book/address-book.component';
import { DefaultAppComponent } from './default-app/default-app.component';

const routes: Routes = [
  { path: 'address-book', component: AddressBookComponent },
  { path: '', component: DefaultAppComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
