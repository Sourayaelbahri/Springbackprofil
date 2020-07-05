package com.contact.profil.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    @Column(name="name",  nullable = false, unique=true)
    private String name;
    @Column(name="email",  nullable = false , unique = true)
    private String email;
    @Column(name="phone_number",  nullable = false, unique = true)
    private int phoneNumber;
    @Column(name="company",  nullable = false , unique = true)
    private String company;
}
