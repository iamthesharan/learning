import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css'],
})
export class ServersComponent implements OnInit {
  allowNewServers = false;
  serverCreated = false;
  serverCreationStatus = 'No Server was Created';
  serverName = '';
  servers=['Test Server 1','Test Server 2'];
  constructor() {
    setTimeout(() => {
      this.allowNewServers = true;
    }, 2000);
  }

  ngOnInit(): void {}

  onCreateServer() {
    this.serverCreated = true;
    this.servers.push(this.serverName);
    this.serverCreationStatus = this.serverName + ' was Created!';
  }
  onUpdateServerName(event: any) {
    this.serverName = event.target.value;
  }
}
