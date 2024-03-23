import {Component, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {DataService} from '../service/data.service';
import {HttpClientModule} from '@angular/common/http';
import {User} from '../entities/user';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule],
  providers: [DataService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'front';

  user: User | undefined;

  constructor(private dataService: DataService) {}

  ngOnInit() {
    this.dataService.getData().subscribe(user => {
      this.user = user;
    });
  }
}
