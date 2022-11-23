package org.animals.org;

public class Main {
	public static void main(String args[]) {
		Dog a = new Dog("Cane","Riso Patate e Cozze","no","labrador");
		Bird titti = new Bird("Passerotti","Grano","si","Canarino");
		Eagle WhiteEagle = new Eagle("Aquila","passerotti/animali piccoli","no","Aquila Bianca");
		Dolphin Flipper = new Dolphin("Delfino","muschi e licheni ma anche Simpson","si","Tursiope");
		
		System.out.print(a);
		System.out.println("\n--------------------------");
		faiNuotare(a);
		System.out.println("\n--------------------------");
		System.out.print(titti);
		System.out.println("\n--------------------------");
		faiVolare(titti);
		System.out.println("\n--------------------------");
		System.out.print(WhiteEagle);
		System.out.println("\n--------------------------");
		faiVolare(WhiteEagle);
		System.out.println("\n--------------------------");
		System.out.print(Flipper);
		System.out.println("\n--------------------------");
		faiNuotare(Flipper);
		
	}
		private static void faiVolare(IVolante AnimalIVolante) {
		
			AnimalIVolante.vola();
		System.out.print(AnimalIVolante);
	}
		
		private static void faiNuotare(INuotante animalINuotante) {
		
		animalINuotante.nuota();
		System.out.print(animalINuotante);
	}
}
