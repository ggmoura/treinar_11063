package br.com.treinar.model;

public class Email {

	private ContactType type;
	private String address;

	public Email() {
	}

	public Email(ContactType type, String address) {
		this.type = type;
		this.address = address;
	}

	public ContactType getType() {
		return type;
	}

	public void setType(ContactType type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}