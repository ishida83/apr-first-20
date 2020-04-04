export class Sorter {

  direction: number;
  key: string;

  constructor() {
    this.direction = 1;
  }

  sort(key: string, data: any[]) {

    if (this.key === key) {
      this.direction = -this.direction;
    }
    else {
      this.direction = 1;
    }

    this.key = key;

    data.sort((a, b) => {
      let aKey;
      let bKey;
      aKey = key.indexOf('.') === -1 ? a[key] : a[key.split('.')[0]][key.split('.')[1]];
      bKey = key.indexOf('.') === -1 ? b[key] : b[key.split('.')[0]][key.split('.')[1]];
      if (aKey === bKey) {
        return 0;
      }
      else if (aKey > bKey) {
        return this.direction;
      }
      else {
        return -this.direction;
      }
    });
  }

}
