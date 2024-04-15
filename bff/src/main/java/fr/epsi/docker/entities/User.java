package fr.epsi.docker.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Long id;
    private String name;
    private String firstName;
    private String email;
    private String phone;
}
