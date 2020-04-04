import { Component, OnInit } from '@angular/core';

import { AddressBookService } from '../address-book.service';
import { Sorter } from './sorter';

@Component({
  selector: 'app-address-book',
  templateUrl: './address-book.component.html',
  styleUrls: ['./address-book.component.scss']
})
export class AddressBookComponent implements OnInit {

  items;
  total;
  isLoading: boolean;
  sorter = new Sorter();

  constructor(private addressBookService: AddressBookService) { }

  sort(key) {
    this.sorter.sort(key, this.items);
  }

  onEdit(event, row) {
    row.isEditing = true;
    row.selected = !(row.selected);
  }

  toggleSelect(event) {
    this.total = event.target.checked;
    this.items.forEach((item) => {
      item.selected = event.target.checked;
    });
  }
  applyFilter() {
    this.items = this.items.filter((data) => !data.selected);
  }
  addNew() {
    this.addressBookService.addItem({
      name: '',
      email: '',
      phone: '',
      address: {
        city: '',
        street: ''
      }
    }).then(item => {
      this.items.push(item)
    });
  }
  updateSelected() {
    const toBeUpdate = this.items.filter(data => data.selected);
    if (toBeUpdate.length > 0) {
      this.items.forEach(item => { item.isEditing = false; item.selected = false; });
      setTimeout(() => {
        window.alert('Selected Rows:\n\r' + JSON.stringify(toBeUpdate));
      }, 1000);
    }
  }
  ngOnInit(): void {
    this.isLoading = true;
    this.addressBookService.getItems().subscribe(data => {
      this.items = data;
      this.isLoading = false;
    });
  }

}
