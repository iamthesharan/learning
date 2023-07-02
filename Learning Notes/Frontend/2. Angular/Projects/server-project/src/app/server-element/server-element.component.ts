import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css']
})
export class ServerElementComponent implements OnInit, OnChanges {
  @Input('srvElement') element: {type:string, name:string, content:string} ={type:'', name:'', content:''}
  constructor() {
    console.log("Constructor Called");
  }

  ngOnInit(): void {
    console.log("New Component Created");
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log("ngOnChanges Executed");
    console.log(changes);
  }

}
