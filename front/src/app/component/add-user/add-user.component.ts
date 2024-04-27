import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators} from '@angular/forms';
import {DataService} from '../../service/data.service';
import {User} from '../../entities/user';

@Component({
  selector: 'app-add-user',
  standalone: true,
  imports: [
    ReactiveFormsModule
  ],
  templateUrl: './add-user.component.html',
  styleUrl: './add-user.component.css'
})
export class AddUserComponent implements OnInit{
  @Output() userAdded: EventEmitter<void> = new EventEmitter<void>();
  userForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private userService: DataService) { }

  ngOnInit(): void {
    this.userForm = this.formBuilder.group({
      name: ['', Validators.required],
      firstName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', Validators.required]
    });
  }

  onSubmit(): void {
    if (this.userForm.valid) {
      const user: User = {
        id: 0, // ou bien vous pouvez le laisser vide si l'API génère l'ID
        name: this.userForm.value.name,
        firstName: this.userForm.value.firstName,
        email: this.userForm.value.email,
        phone: this.userForm.value.phone
      };

      this.userService.addUser(user).subscribe(
        newUser => {
          this.userAdded.emit();
        },
        error => {
          console.error('Erreur lors de l\'ajout de l\'utilisateur : ', error);
          // Gérer l'erreur ici
        }
      );
    } else {
      // Afficher des messages d'erreur ou effectuer d'autres actions si le formulaire est invalide
    }
  }
}
