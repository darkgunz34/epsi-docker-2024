import {Component, OnDestroy, OnInit} from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {DataService} from '../../service/data.service';
import {HttpClientModule} from '@angular/common/http';
import {User} from '../../entities/user';
import {Subscription} from 'rxjs';
import {AddUserComponent} from '../add-user/add-user.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule, AddUserComponent],
  providers: [DataService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit, OnDestroy {
  title = 'front';

  dataServiceSubscription!: Subscription;

  users: User[] | undefined;

  constructor(private dataService: DataService) {
  }

  ngOnInit() {
    this.refreshUsers();
  }

  ngOnDestroy() {
    this.dataServiceSubscription.unsubscribe();
  }

  deleteUser(id: number) {
    this.dataService.deleteUser(id).subscribe(() => {
      this.users = this.users?.filter(user => user.id !== id);
    });
  }

  refreshUsers() {
    this.dataServiceSubscription = this.dataService.getAllData().subscribe(users => {
      console.log(users);
      this.users = users;
    });
  }
}
