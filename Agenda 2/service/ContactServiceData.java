package com.softtek.java.academy.service;
import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;

public interface ContactServiceData {
	public Contact createContact(Contact contact);
	public Contact updateContact(String id, Contact contact);
	public boolean deleteContact(String id);
	public Contact [] findAll();
	public Contact findById(String id);
	public Contact findByEmail(String email);
	public Contact [] findByContactType(ContactType contactType);
}
