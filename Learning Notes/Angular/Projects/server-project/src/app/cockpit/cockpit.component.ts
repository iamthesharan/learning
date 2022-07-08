import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrls: ['./cockpit.component.css'],
})
export class CockpitComponent implements OnInit {
  @Output() serverCreated = new EventEmitter<{
    serverName: string,
    serverContent: string
  }>();
  @Output() blueprintCreated = new EventEmitter<{
    serverName: string,
    serverContent: string
  }>();
  newServerName = '';
  // newServerContent = '';
  @ViewChild('serverContentInput') serverContentInput!:ElementRef;
  constructor() {}

  ngOnInit(): void {}
  onAddServer() {
    this.serverCreated.emit({
      serverName: this.newServerName,
      serverContent: this.serverContentInput.nativeElement.value
    });
  }
  onAddBlueprint() {
    console.log(this.serverContentInput.nativeElement.value)
    this.blueprintCreated.emit({
      serverName: this.newServerName,
      serverContent: this.serverContentInput.nativeElement.value
    });
  }
}
