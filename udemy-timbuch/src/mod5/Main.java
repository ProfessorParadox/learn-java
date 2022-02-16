package mod5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter year: ");
		boolean hasNextInt = scanner.hasNextInt();
		
		if(hasNextInt) {
			int year = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("enter name: ");
			String name = scanner.nextLine();
			int age = 2022 - year;
			
			if(age>=0 && age<=100) {
				System.out.println("your name is " + name + " & you are " + age + " yrs old.");
			}
			else {
				System.out.println("invalid year of birth!");
			}
		}
		else {
			System.out.println("unable to parse year!");
		}
		
		scanner.close();				
	}

}
