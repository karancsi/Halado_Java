package usercontrollerdemo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Logger;

import mypac.App;

public class ConsoleReader {
	
	private ConsoleReader() {
		
	}
	private static Logger log = Logger.getLogger(App.class.toString());
	//will read and Integer value
	public static int readInt() {
		int number = 0;
		boolean ok = false;
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		
		do {
			try {
				number = Integer.valueOf(reader.readLine());
				ok = true;
			} catch (Exception e) {
				
				log.config("Invalid input, input was not an Integer");
			}
		} while (!ok);
		return number;
	}
	
	/*will read an Integer value greater or equal than the floor 
	and less or equal than the ceiling given*/
	public static int readIntInRange(int floor, int ceiling) { 
		
		int number = 0;
		boolean ok = false;
		
		do {
			
				number = readInt();
				if(number <= ceiling && number >= floor)
					ok = true;
				else log.config("Invalid input, Integer was not in the required range");
				
		} while (!ok);
		return number;
	}
	
	//will read a line and return it as a String value
	public static String readString() {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		
		String returnValue = "";
		try {
			returnValue = reader.readLine();
		} catch (IOException e) {

			log.config("Error");
		}
		return returnValue;
	}
	
	//will read a line and check if it's below or equal to the required maximum length
	public static String readStringWithMaxLength(int maxLength) {
		String returnValue = "";
		boolean ok = false;
		
		do {
			returnValue = readString();
			
			if(returnValue.length() <= maxLength) {
				ok = true;
			}
			else {
				log.config("Input is longer than what is required");
			}
				
		} while (!ok);
		
		return returnValue;
	}
	
	public static String readStringWithMinLength(int minLength) {
		String returnValue = "";
		boolean ok = false;
		
		do {
			returnValue = readString();
			
			if(returnValue.length() >= minLength) {
				ok = true;
			}
			else {
				log.config("Input is shorter than what is required");
			}
				
		} while (!ok);
		
		return returnValue;
	}
	
	public static String readStringBetweenLength(int minlength, int maxLength) {
		String returnValue = "";
		boolean ok = false;
		
		do {
			returnValue = readString();
			
			if(returnValue.length() <= maxLength && returnValue.length() >= minlength) {
				ok = true;
			}
			else {
				String s = "Input has to be between " + (minlength + 1) + " and " + (maxLength + 1) + "in length.";
				log.config(s);
			}
				
		} while (!ok);
		
		return returnValue;
	}
	
	//reads date in the yyyy.MM.dd format
	public static Date readSQLDate() {
		boolean ok = false;
		Date ret = null;
		do {
			try {	
				log.config("Dátum formátum: yyyy.mm.dd\n");
				String toConvert = readString();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
				LocalDate date = LocalDate.parse(toConvert, formatter);
				ret = new Date(date.atStartOfDay().toInstant(ZoneOffset.MIN).toEpochMilli());
				ok = true;
				
			} catch(DateTimeParseException e) {
				log.config("A beírt dátum nem megfelelõ formátumú!");
			}
		}while(!ok);
		return ret;
	}
}
