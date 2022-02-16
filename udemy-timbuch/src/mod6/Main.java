package mod6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new object of class template car
		Car porsche = new Car();
		Car holden = new Car();
		
		//porsche.model = "Carrera";
		//this only works if model is public 
		//but ideally use private fields and then 
		//use methods to access them
		
		//setting model name using setter method
		//porsche.setModel("Carrera");
		
		//now if setter has validation check 
		//we cant specify aventador as model
		//and it will show unknown even if we try to
		porsche.setModel("aventador");
		
		//printing model name using getter method
		System.out.println("Model is " + porsche.getModel());
		//if we try to use getter before setting
		//the data field it will show field's
		//default state that is - "null"!
		
	}

}
