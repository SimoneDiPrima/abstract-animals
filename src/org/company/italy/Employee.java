package org.company.italy;

import java.time.LocalDate;

public class Employee extends Person {
	private int salary;
	private int monthly;

	public Employee(String name , String surname ,LocalDate dateofbirth,int salary, int monthly) {
		super(name,surname,dateofbirth);
		setSalary(salary);
		setMonthly(monthly);
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}
	public int getYearIncome() {
		return getSalary() * getMonthly();
	}
	@Override public String toString(){
		return super.toString() + "\nsalario:" + getSalary() + "€" + "\nmensilita complessive:" + getMonthly()+
		"\nStipendio Annuale" + getYearIncome() + "€";
	}
}