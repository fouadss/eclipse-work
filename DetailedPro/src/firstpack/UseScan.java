package firstpack;

import java.util.Scanner;

public class UseScan {
     
	
	static String occupation;
	static String country;
	static String name;
	static int age;
	static double salary;
	
	
	public static void main(String[] args) {
		
		Scanner myScanner= new Scanner(System.in);
		
		System.out.println("what is your name ?");
		name = myScanner.next();
		System.out.println("how old are you ?");
		age = myScanner.nextInt();
		System.out.println("what is your salary ?");
		salary = myScanner.nextDouble();
		System.out.println("--------------------------------------");
		System.out.println("my name is "+name);
		System.out.println("how old are you "+age);
		System.out.println("what is your salary");
		
		System.out.println("-------------------------------------------");
		System.out.println("my name is " +name+ " and i am "+age+" years old"+" , i get paid "+"$"+salary);
	
	
	}
	
	
}
