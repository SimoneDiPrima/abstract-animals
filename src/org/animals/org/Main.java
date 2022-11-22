package org.animals.org;

public class Main {
	public static void main(String args[]) {
		Dog a = new Dog("Cane","Riso Patate e Cozze","no","labrador");
		Bird titti = new Bird("Passerotti","Grano","si","Canarino");
		Eagle WhiteEagle = new Eagle("Aquila","passerotti/animali piccoli","no","Aquila Bianca");
		Dolphin Flipper = new Dolphin("Delfino","muschi e licheni ma anche Simpson","si","Tursiope");
		
		System.out.print(a);
		System.out.println("\n--------------------------");
		System.out.print(titti);
		System.out.println("\n--------------------------");
		System.out.print(WhiteEagle);
		System.out.println("\n--------------------------");
		System.out.print(Flipper);
	}
}
