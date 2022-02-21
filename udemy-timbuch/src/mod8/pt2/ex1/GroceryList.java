package mod8.pt2.ex1;

import java.util.ArrayList;

public class GroceryList {
	//private int[] myNum = new int[50];
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		//myNum[5]=4;
		groceryList.add(item);		
	}
	
	public void printGroceryList() {
		System.out.println("you have " + groceryList.size() + " items in list.");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1) + "- " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(String currentItem, String newItem) {
		int pos = findItem(currentItem);
		if(pos>=0) {
			modifyGroceryItem(pos, newItem);
		}
	}
	
	private void modifyGroceryItem(int pos, String newItem) {
		groceryList.set(pos, newItem);
		System.out.println("grocery item " + (pos+1) + " has been modified.");
	}
	
	public void removeGroceryItem(String item) {
		int pos = findItem(item);
		if(pos>=0) {
			removeGroceryItem(pos);
		}
	}
	
	private void removeGroceryItem(int pos) {
		String item = groceryList.get(pos);
		groceryList.remove(pos);
		System.out.println("Item removed from list= " + item);
	}
	
	private int findItem(String searchItem) {
		return groceryList.indexOf(searchItem);
	}
	
	public boolean onFile(String searchItem) {
		int pos = findItem(searchItem);
		if(pos>=0) {
			return true;
		}
		
		return false;
	}
	
	/*public String findItem(String searchItem) {
		//to check present in list
		//boolean exists = groceryList.contains(searchItem);
		
		//better method
		//returns index if present otherwise returns -1
		int pos = groceryList.indexOf(searchItem);
		if(pos>-1) {
			return groceryList.get(pos);
		}
		
		return null;
		
	}*/

}
