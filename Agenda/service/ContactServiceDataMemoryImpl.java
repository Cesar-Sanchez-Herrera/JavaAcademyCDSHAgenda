package com.softtek.java.academy.service;
import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.util.Util;

public class ContactServiceDataMemoryImpl implements ContactServiceData{
	
	private Contact[] contacts;
	private int currentIndex;
	private Util util;
	
	public ContactServiceDataMemoryImpl(){
		contacts = new Contact[100];
		currentIndex = 0;
		util = new Util();
	}
	
	@Override
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(
				util.generateId(),
				contact.getFirstName(),
				contact.getLastName(),
				contact.getMotherName(),
				contact.getEmail(),
				contact.getPhoneNumber(),
				contact.getContactType()
				);
		
		contacts[currentIndex] = newContact;
		currentIndex++;
		
		return newContact;
	}

	@Override
	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] findByContactType(ContactType contactType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] findAll() {
		Contact[] storedContacts = new Contact[currentIndex];
		
		for(int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];
			if(c != null) {
				storedContacts[i] = c;
			}else {
				break;
			}
		}
		return storedContacts;
	}
	
}
