package com.contact.profil.controller;

import com.contact.profil.model.Contact;
import com.contact.profil.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService service;


    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }

    @PostMapping("/addContacts")
    public List<Contact> addContacts(@RequestBody List<Contact> contacts) {
        return service.saveContacts(contacts);
    }

    @GetMapping("/Contacts")
    public List<Contact> findAllContacts() {
        return service.getContacts();
    }

    @GetMapping("/contactById/{id}")
    public Contact findAContactById(@PathVariable int id) {
        return service.getContacteById(id);
    }

    @GetMapping("/Contact/{email}")
    public Contact findContactByEmail(@PathVariable String email) {
        return service.getContactByEmail(email);
    }

    @GetMapping("/ContactName/{name}")
    public List<Contact> findContactByName(@PathVariable String name) {
        return service.getContactByName(name);
    }
    @GetMapping("/ContactPhoneNumber/{phoneNumber}")
    public Contact findContactByPhoneNumber(@PathVariable String phoneNumber) {
        return service.getContactByPhoneNumber(phoneNumber);
    }

    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {
        return service.updateContact(contact);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id) {
        return service.deleteContact(id);
    }
}
