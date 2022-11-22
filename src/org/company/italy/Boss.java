package org.company.italy;

import java.time.LocalDate;

public class Boss extends Person{
 private int salary;
private int bonus;
 public Boss(String name , String surname ,LocalDate dateofbirth,int salary, int bonus) {
	 super(name, surname, dateofbirth);
	 setSalary(salary);
	 setBonus(bonus);
	 
 }
 public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

 
@Override
public int getYearIncome() {
	return getSalary()*12 + getBonus();
}
@Override public String toString(){
	return super.toString() + "\nsalario:" + getSalary() + "\nPremio annuale:" + getBonus()+ "€"+
			"\nStipendio Annuale(compresi bonus)" + getYearIncome() + "€";
}
}
