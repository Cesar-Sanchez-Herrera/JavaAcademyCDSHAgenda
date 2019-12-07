package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.util.Util;

public class ContactServiceDataMemoryImpl implements ContactServiceData {

	private Contact[] contacts;
	private int currentIndex;
	private Util util;

	public ContactServiceDataMemoryImpl() {
		contacts = new Contact[100];
		currentIndex = 0;
		util = new Util();
	}

	@Override
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(util.generateId(), contact.getFirstName(), contact.getLastName(),
				contact.getMotherName(), contact.getEmail(), contact.getPhoneNumber(), contact.getContactType());
		contacts[currentIndex] = newContact;
		currentIndex++;
		return newContact;
	}

	@Override
	public boolean updateContact(String name, String email) {
		Contact[] updateContacts = new Contact[currentIndex];
		boolean actualizo = false;

		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];

			if (c.getFirstName() == name) {
				c.setEmail(email);
				actualizo = true;
				break;
			}
		}

		return actualizo;
	}

	@Override
	public boolean deleteContact(String nombre) {
		Contact[] updateContacts = new Contact[currentIndex];
		boolean actualizo = false;

		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];

			if (c.getFirstName() == nombre) {
				c.setEmail("null");
				c.setContactType(ContactType.UNKNOWN);
				c.setFirstName("null");
				c.setLastName("null");
				c.setMotherName("null");
				c.setPhoneNumber("null");
				actualizo = true;
				break;
			}
		}

		return actualizo;
	}

	@Override
	public Contact[] findById(String id) {
		Contact[] storedContacts = new Contact[currentIndex];
		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];

			if (c.getId() == id) {
				storedContacts[i] = c;
			}
		}
		return storedContacts;
	}

	@Override
	public Contact findByEmail(String email) {
		Contact[] storedContacts = new Contact[currentIndex];
		Contact contactoEmail = new Contact();

		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];

			if (c != null) {
				if (c.getEmail() == email) {
					contactoEmail = c;
				}
			}

		}
		return contactoEmail;
	}

	@Override
	public Contact[] findByContactType(ContactType contactType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] findAll() {

		Contact[] storedContacts = new Contact[currentIndex];
		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];
			if (c != null) {
				storedContacts[i] = c;
			} else {
				break;
			}
		}
		return storedContacts;
	}
}
