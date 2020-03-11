package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {
	
	public static void main(String[] args) {
		
		/*System.out.println("Adja meg a felhasználók számát:");
		Scanner scanner = new Scanner(System.in);
		int db = Integer.parseInt(scanner.nextLine());*/
		System.out.println("Adja meg a felhasznaló nevét: \n");
		List<User> users = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		User u = new User(sc.nextLine()) ;
		System.out.println(u.getName());
		sc.close();
		
		
		mentes(u, users);
		
		 for(User us : users) {
	            System.out.println("elmentve: " + us.getName());
	        }
		 
		
	}
	 public static void mentes( User u, List<User> users) {
		 if (u.getName().length() >= 6 || u.getName().contains(" ")) {
				users.add(u);
				System.out.println("elmentve: \n" + u.getName() );
			}
			else
			{ 	
			System.out.println("Túl rövid a név" );
			}
	 }

}
