package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;

public interface ContactServiceData {
	public Contact createContact(Contact contact);
	public boolean updateContact(String name, String email);
	public boolean deleteContact(String nombre);
	public Contact[] findById(String id);
	public Contact findByEmail(String email);
	public Contact[] findByContactType(ContactType contactType);
	public Contact[] findAll();

}
