package mypackage;

import java.util.Random;
import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		int db = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adja meg, hány tanárt/diakot hozzunk létre!");
		
		try {
			db = scanner.nextInt();

		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}
		
		scanner.close();

		Tanar [] tanarok = new Tanar[db];
		Diak [] diakok = new Diak[db];
		
		Random r = new Random();
		for (int i = 0; i < db; i++) {
			int ed = r.nextInt(10)+18;
			int p = r.nextInt(10);
			int et  = r.nextInt(30)+20;
			double já = 0 + (5)*r.nextInt(5);
			diakok[i] = new Diak("diak"+i+1, ed, p);
			tanarok[i] = new Tanar("tanar"+i+1, et, já);
		}
		
		System.out.println("Jó alanyok:");
		for (int i = 0; i < db; i++) {
			if (diakok[i].joAlanyE()) {
				System.out.println(diakok[i].toString());
			}
			if (tanarok[i].joAlanyE()) {
				System.out.println(tanarok[i].toString());
			}
			
		}
	}

}
