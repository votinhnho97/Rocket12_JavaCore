package assignment4.Exercise6.Phone;

import java.util.ArrayList;

public abstract class Phone {
	private ArrayList<Contact> contacts;

	public Phone() {
		contacts = new ArrayList<Contact>();
	}

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}

	public abstract void insertContact(String name, String phone);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newPhone);

	public abstract void searchContact(String name);
}
