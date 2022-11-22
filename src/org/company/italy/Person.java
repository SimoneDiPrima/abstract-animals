package org.company.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {
	
	private String name;
	private String surname;
	private LocalDate dateofbirth;
	
	public Person(String name,String surname , LocalDate dateofbirth) {
		setName(name);
		setSurname(surname);
		dateofbirth = LocalDate.now();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public static String getidCode() {
	    Random rnd = new Random();
	    int number = rnd.nextInt(99999);
	    return String.format("\nIdCode:%05d", number);
	}
	public String getFullName(){
		String fullName = name + " " + surname +" " + getidCode();
		return fullName;
		
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public abstract int getYearIncome();
	public String toString(){
		return getFullName();
	}


}
