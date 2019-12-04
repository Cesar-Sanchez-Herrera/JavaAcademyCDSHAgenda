package com.softtek.java.academy.temporal;
import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataMemoryImpl;

public class PlaceholderContacts {
	private Contact contact;
	private Contact friend;
	private Contact anotherFriend;
	
	public static void main(String[]args) {
		PlaceholderContacts p = new PlaceholderContacts();
		p.crearContactos();
		
		ContactServiceData cad = new ContactServiceDataMemoryImpl();
		Contact myContact = cad.createContact(p.contact);
		Contact myFriendContact = cad.createContact(p.friend);
		Contact myOtherFriendContact = cad.createContact(p.anotherFriend);
		
		Contact[] contacts = cad.findByContactType(ContactType.FRIEND);
		if(contacts != null) {
			for(Contact c : contacts) {
				System.out.println(c);
			}
		}else {
			System.out.println("No se encontraron contactos del tipo " + ContactType.WORK);
		}
		
	}
	
	
	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("Cesar");
		contact.setLastName("Sanchez");
		contact.setMotherName("Herrera");
		contact.setEmail("cesar_zit@live.com.mx");
		contact.setPhoneNumber("8132636139");
		
		friend = new Contact("1", "Daniel", "Sanchez", "Herrera",
				"tony_lokio@outlook.es", "8123227726", ContactType.FRIEND);
		
		anotherFriend = new Contact("1", "Juan", "Sanchez", "Herrera",
				"tony_lokio@outlook.es", "8123227726", ContactType.FRIEND); 
	}
}
