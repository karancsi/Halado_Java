package unicorn_console;

import java.util.Scanner;

import uni.unicorn.model.Calculator;
import uni.unicorn.service.CalculateSimple;

public class ConsoleApp {

	public static void main(String[] args) {
		CalculateSimple cs =new CalculateSimple();
		Calculator cal = new Calculator(); //maga a model
		double eredmeny=0;
		boolean jo_e = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg az operátort!");
		cal.setOperator(sc.nextLine());// operátor
		
		while(jo_e != true) {
			try 
		{
		System.out.println("Adja meg az első operandust!");
		cal.setOperandL(Double.parseDouble(sc.nextLine())); //1.operandus
		System.out.println("Adja meg a második operandust!");
		cal.setOperandR(Double.parseDouble(sc.nextLine())); //2.operandus
		jo_e = true;
		}
		catch(NumberFormatException nfe) {
		System.out.println("Nem számot adtál meg.");
		}
		}
		
		
		
		sc.close();
		System.out.println(cal.getOperandL() + " " + cal.getOperator() + " " + cal.getOperandR() );
		
		
		switch(cal.getOperator()) {
		  case "+":
		    eredmeny = cs.add(cal);
		    break;
		  case "-":
			eredmeny = cs.subtract(cal);
		    break;
		  case "*":
			eredmeny = cs.multiply(cal);
		    break;
		  case "/":
			eredmeny = cs.divide(cal);
		    break; 
		  default:
		    System.out.println("I love unicorns! \n You've got some error with operator. I don't know the reason why I turn into English.");
		}
		System.out.println("Eredmény: " + eredmeny);
	}

}
