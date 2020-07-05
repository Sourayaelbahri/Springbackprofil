package com.contact.profil.service;

import com.contact.profil.model.Contact;
import com.contact.profil.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public Contact saveContact(Contact contact){
        return repository.save(contact);
    }
    public List<Contact> saveContacts (List<Contact> contacts){
        return repository.saveAll(contacts);
    }
    public List<Contact> getContacts() {
        return repository.findAll();
    }

    public Contact getContacteById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Contact getContactByEmail(String Email) {
        return repository.findByEmail(Email);
    }
    public Contact getContactByPhoneNumber(String phoneNumber) { return repository.findByPhoneNumber(phoneNumber);}
    public List<Contact> getContactByName(String name) {
        return repository.findByName(name);
    }

    public String deleteContact(int id) {
        repository.deleteById(id);
        return "Contact removed !! " + id;
    }
    public Contact updateContact(Contact contact) {
        Contact existingContact = repository.findById(contact.getId()).orElse(null);
        existingContact.setEmail(contact.getEmail());
        existingContact.setName(contact.getName());
        existingContact.setPhoneNumber(contact.getPhoneNumber());
        existingContact.setCompany(contact.getCompany());
        return repository.save(existingContact);
    }
}
