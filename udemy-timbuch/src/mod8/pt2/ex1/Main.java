package mod8.pt2.ex1;

import java.util.ArrayList;
import java.util.Scanner;

//import javax.naming.directory.ModificationItem;

//list and arraylist intro

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static GroceryList gl = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("enter choice: ");
			choice = s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				gl.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4: 
				removeItem();
				break;
			case 5: 
				searchForItem();
				break;
			case 6: 
				
				break;				
			case 7: default:
				quit = true;
				break;
				
			}
		}			
	}
	
	public static void printInstructions()	{
		System.out.println("0-help,1-print,2-add,3-modify,4-remove,5-search,6-quit\n");
	}
	
	public static void addItem() {
		System.out.println("enter item: ");
		gl.addGroceryItem(s.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("enter current item: ");
		String itemno = s.nextLine();
		System.out.println("enter replacement item: ");
		String newItem = s.nextLine();
		gl.modifyGroceryItem(itemno, newItem);		
	}
	
	public static void removeItem() {
		System.out.println("enter current item: ");
		String itemno = s.nextLine();
		gl.removeGroceryItem(itemno);
	}
	
	public static void searchForItem() {
		System.out.println("enter search item: ");
		String searchItem = s.nextLine();
		if(gl.onFile(searchItem)) {
			System.out.println("found " + searchItem + " in list!");
		} else {
			System.out.println(searchItem + " is not in list!");
		}
	}
/*	
public static void processArrayList() {
	ArrayList<String> newArray = new ArrayList<String>();
	newArray.addAll(gl.getClass());
	
	ArrayList<String> nextArray = new ArrayList<String>(gl.getGroceryList());
}
*/
}
