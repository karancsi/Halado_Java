package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vasarlas {

	public static void main(String[] args) {
		List<Tanulo> deakok  = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			deakok.add(new Tanulo("diak"+i+1,6969 ));
		}
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int �sszespenz=0;
			for (int j = 0; j < deakok.size(); j++) {
				int rand = r.nextInt(1500) + 1500;
				if (deakok.get(j).Fogyasztas(rand)) {
					deakok.remove(j);
					j -=1;
				}else {
					�sszespenz += deakok.get(j).getPenz();
				}
				
			}
			if (deakok.size() == 0) {
				System.out.println("M�r nincs p�nze egy di�knak sem");
			} else {
				System.out.println("�tlag p�nz �rt�ke: " +�sszespenz/deakok.size());
			}
			
		}
		
		System.out.println("Megmaradt tanul�k sz�ma: "+deakok.size()+"db");
		for (int i = 0; i < deakok.size(); i++) {
			System.out.println(deakok.get(i).toString());
		}
	}
	
	

}
