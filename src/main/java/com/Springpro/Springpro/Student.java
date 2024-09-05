package com.Springpro.Springpro;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IDADE")
    private int age;


}
