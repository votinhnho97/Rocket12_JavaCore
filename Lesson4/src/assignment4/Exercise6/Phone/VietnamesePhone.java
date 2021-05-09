package assignment4.Exercise6.Phone;

public class VietnamesePhone extends Phone {
	@Override
	public void insertContact(String name, String phone) {
		System.out.printf("Insert contact [Name, Phone] = [%s, %s]\n\n", name, phone);
	}

	@Override
	public void removeContact(String name) {
		System.out.printf("Remove contact [Name = %s]\n\n", name);
	}

	@Override
	public void updateContact(String name, String newPhone) {
		System.out.printf("Update contact [Name, Phone] = [%s, %s]\n\n", name, newPhone);
	}

	@Override
	public void searchContact(String name) {
		System.out.printf("Search contact [Name = %s]\n\n", name);
	}

}
