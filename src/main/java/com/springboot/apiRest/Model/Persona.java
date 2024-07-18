package com.springboot.apiRest.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String ubication;
    String position;
    String fullName;
    String image;
    String user;
    String password;

    public Persona(Long id, String ubication, String position, String fullName, String image, String user, String password) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
        this.user = user;
        this.password = password;
    }

    public Persona() {
    }
}
