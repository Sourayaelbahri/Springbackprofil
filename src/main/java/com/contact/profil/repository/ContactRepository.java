package com.contact.profil.repository;

import com.contact.profil.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
    Contact findByEmail(String email);
    List<Contact> findByName(String nme);
    Contact findByPhoneNumber(String phoneNumber);
}
