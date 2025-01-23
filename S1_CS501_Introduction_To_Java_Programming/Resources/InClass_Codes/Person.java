package Resources.InClass_Codes;

import java.util.Calendar;

public class Person {
	
	private String name;
	private String address;
	private int yearOfBirth;
	
	public Person() {
		this.name = "";
		this.address = "";
		this.yearOfBirth = 0;
	}

	public Person(String name, String address, int yearOfBirth) {
		this.name = name;
		this.address = address;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public boolean canVote() {
		Calendar now = Calendar.getInstance();
		int nowYear = now.get(Calendar.YEAR);
		return (nowYear - yearOfBirth) >= 18;
	}

}
