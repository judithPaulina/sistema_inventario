import { Component, OnInit } from '@angular/core';
import { PrimeNGConfig } from 'primeng/api';
import { UtilitiesService } from './utilities/utilities.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent implements OnInit {
  constructor(private primengConfig: PrimeNGConfig, public utilitiesService: UtilitiesService) {}
  title = 'nexo';

  ngOnInit(): void {
    /* localStorage.setItem('token', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9'); */
    this.primengConfig.ripple = true;
}
}
