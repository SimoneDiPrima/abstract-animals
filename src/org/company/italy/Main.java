package org.company.italy;

import java.util.Arrays;
import java.time.LocalDate;

public class Main {
	public static void main(String args[]) {
		Employee e = new Employee("Ricky","Leroy",LocalDate.now(),1500,11);
		//System.out.print(e);
		System.out.println("\n--------------------------------------");
		Employee m = new Employee("Maurizio","Benedetta",LocalDate.now(),1000,12);
		//System.out.print(m);
		System.out.println("\n--------------------------------------");
		Employee t = new Employee("Tuglio","Brosio",LocalDate.now(),800,12);
		//System.out.print(t);
		System.out.println("\n--------------------------------------");
		Boss a = new Boss("Amedeo","Minghi",LocalDate.now(),5000,11000);
		//System.out.print(a);
		System.out.println("\n--------------------------------------");
		Boss old = new Boss("Lucio","Battisti",LocalDate.now(),7000,11000);
		//System.out.print(old);
		
		Person[] company = { old, a, t, m,e };
		
		
		int maxYearIncome = Integer.MIN_VALUE;
		int minYearIncome = Integer.MAX_VALUE;
		for(int i=0;i<company.length;i++) {
			Person p = company[i];
			
			int YearIncome = p.getYearIncome();
			if(maxYearIncome < YearIncome) {
				maxYearIncome = YearIncome;
				System.out.print(p);
			}
			else if(minYearIncome >= YearIncome) {
				minYearIncome = YearIncome;
				System.out.print(p);
			}
			
		}
	
	}
}
