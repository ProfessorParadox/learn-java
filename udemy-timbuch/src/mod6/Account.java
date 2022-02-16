package mod6;

public class Account {
	//members
	private String accNum;
	private double accBal;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	//constructor
	public Account() {
		this("12345", 0.00, "Default Name", "Default Email", "Default Phone");
		System.out.println("empty constructor called!");
	}
	
	public Account(String accNum, double accBal, String customerName, String customerEmail, String customerPhone) {
		System.out.println("constructor with parameters called!");
		this.accNum = accNum;
		this.accBal = accBal;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;		
	}
	
	//user methods
	public void deposit(double depositAmount) {
		this.accBal += depositAmount;
		System.out.println("deposit of " + depositAmount + 
					" processed. New balance= " + this.accBal);
	}
	
	public void withdrawal(double withdrawalAmount) {
		//check condition
		if((this.accBal - withdrawalAmount) <0) {
			System.out.println("Only " + this.accBal + " available. withdrawal failed!");
		} else {
			this.accBal -= withdrawalAmount;
			System.out.println("wihtdrawal of " + withdrawalAmount + 
					" processed. Remaining balance= " + this.accBal);
		}
	}
	
	//getters setters auto created by source menu
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	

}
