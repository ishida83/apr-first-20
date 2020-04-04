import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-default-app',
  templateUrl: './default-app.component.html',
  styleUrls: ['./default-app.component.scss']
})
export class DefaultAppComponent implements OnInit {
  title = 'my-app';

  constructor() { }

  ngOnInit(): void {
  }

}
