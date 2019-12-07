package com.softtek.java.academy.temporal;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataMemoryImpl;;

public class PlaceholderContacts {
	private Contact contact;
	private Contact friend;

	public static void main(String[] args) {
		PlaceholderContacts p = new PlaceholderContacts();
		p.crearContactos();

		ContactServiceData csd = new ContactServiceDataMemoryImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);

		Contact[] contacts = csd.findAll();
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
//		Contact[] contactsId = csd.findById("asjdalskdjas");
//		for (Contact c : contactsId) {
//			System.out.println(c);
//		}
//		
		
		Contact contactsEmail = csd.findByEmail("jose.amatitla@softtek.com");
		System.out.println(contactsEmail);
		
		System.out.println("El contacto Jose se actualizo: " +  csd.updateContact("Jose", "ernesto.rosas"));
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
		System.out.println("el contacto se elimino " +  csd.deleteContact("Jose"));
		
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
		
		
//		for (Contact c : contactsEmail) {
//			System.out.println(c);
//		}
		

	}

	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("Jose");
		contact.setLastName("Amatitla");
		contact.setMotherName("Dias");
		contact.setEmail("jose.amatitla@softtek.com");
		contact.setPhoneNumber("100020003");

		friend = new Contact("1", "Javier", "Juarez", "Rosas", "8115671361", "javier.rosas@softtek.com",
				ContactType.FRIEND);
	}

}
