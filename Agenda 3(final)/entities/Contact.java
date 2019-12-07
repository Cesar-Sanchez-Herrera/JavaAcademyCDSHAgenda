package com.softtek.java.academy.entities;

public class Contact {
	private String id;
	private String firstName;
	private String name;
	private String lastName;
	private String motherName;
	private String email;
	private String phoneNumber;
	private ContactType contactType;

	public Contact() {
		/* this = de esta propiedad [clase] asigna este valor */
		this.contactType = ContactType.UNKNOWN;
	}

	public Contact(String id, String firstName,  String lastName, String motherName, String email,
			String phoneNumber, ContactType contactType) {
		super();
		this.id = id;
		this.firstName = firstName;
		
		this.lastName = lastName;
		this.motherName = motherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.contactType = contactType;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return this.id;
		/* Solo es de lectura */
	}

	/*
	 * GENERATE- GETTER & SETTERS a esto se le llama ENCAPSULAMIENTO
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String toString() {
		// TODO meter los datos que faltan
		StringBuilder sb = new StringBuilder();
		sb.append("Contact.Id = " + this.getId() + "\n");
		sb.append("Contact.FirstName = " + this.getFirstName() + "\n");
		sb.append("Contact.email = " + this.getEmail() + "\n");
		sb.append("Contact.phoneNumber = " + this.getPhoneNumber() + "\n");

		return sb.toString();
	}
}
