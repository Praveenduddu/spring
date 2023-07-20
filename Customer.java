package de.zeroco.springjdbc;

public class Customer {

	private int id;
	private String email;
	private String name;
	private int contact;
	private String dateOfBirth;
	private int age;

	public Customer(String email, String name, int contact, String dateOfBirth, int age) {
		this.email = email;
		this.name = name;
		this.contact = contact;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public Customer(int id, String email, String name, int contact, String dateOfBirth, int age) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.contact = contact;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int salary) {
		this.contact = salary;
	}
}
