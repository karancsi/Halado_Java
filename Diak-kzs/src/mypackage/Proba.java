package mypackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Proba {
	
	public static void main(String[] args) {
		int db = 0;
		Diak[] diakok;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adja meg hány diákot akar létrehozni!");
		
		try {
			db = scanner.nextInt();

		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}

		scanner.close();
		
		diakok= new Diak[db];
		for (int i = 0; i < diakok.length; i++) {
			String name = "diák" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(7) + 18;
			int puska = r.nextInt(5);
			diakok[i] = new Diak(name, age, puska);
		}
		
		Arrays.sort(diakok);

		for (Diak a : diakok) {
			System.out.println(a);
		}
	}

}
