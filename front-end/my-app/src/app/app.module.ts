import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddressBookComponent } from './address-book/address-book.component';
import { DefaultAppComponent } from './default-app/default-app.component';
import { HttpClientModule } from '@angular/common/http';

import { registerLocaleData } from '@angular/common';
import localeZh from '@angular/common/locales/zh-Hans';
import localeZhExtra from '@angular/common/locales/extra/zh-Hans';

// registerLocaleData(localeZh, 'zh-CN');
registerLocaleData(localeZh, 'zh-Hans', localeZhExtra);

@NgModule({
  declarations: [
    AppComponent,
    AddressBookComponent,
    DefaultAppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
