package com.jpa.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;

    //la sigueinte line es para nombrar en la base de datos
    @Column(name = "last_name")
    private  String lastname;
    private  String age;
    private  String nationality;
}
