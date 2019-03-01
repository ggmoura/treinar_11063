package br.com.treinar.model;

public class Phone {

	private ContactType type;
	private String number;

	public Phone() {
	}

	public Phone(ContactType type, String number) {
		this.type = type;
		this.number = number;
	}

	public ContactType getType() {
		return type;
	}

	public void setType(ContactType type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	
}