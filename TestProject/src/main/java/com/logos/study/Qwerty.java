package com.logos.study;

public class Qwerty {
	private String LastName;
	private String FirstName;
	public Qwerty(String lastName, String firstName) {
		super();
		LastName = lastName;
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	@Override
	public String toString() {
		return "Qwerty [LastName=" + LastName + ", FirstName=" + FirstName + "]";
	}
	
}
