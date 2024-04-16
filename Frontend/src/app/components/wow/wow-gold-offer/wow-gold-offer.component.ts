import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-wow-gold-offer',
  templateUrl: './wow-gold-offer.component.html',
  styleUrls: ['./wow-gold-offer.component.scss']
})
export class WowGoldOfferComponent implements OnInit {
  servers: string[] = ["EU", "US"];
  fractions: string[] = ["Alliance", "Horde"]

  constructor() { }

  ngOnInit(): void {
  }

}
