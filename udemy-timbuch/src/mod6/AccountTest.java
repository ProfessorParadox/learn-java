package mod6;

public class AccountTest {

	public static void main(String[] args) {
		Account act = new Account();
		act.withdrawal(100.0);
		
		act.deposit(50.0);
		act.withdrawal(100.0);
		
		act.deposit(52.0);
		act.withdrawal(100.0);
		
		//using setter
		act.setAccBal(0.00);
		act.setAccNum("12345");
		act.setCustomerEmail("bob@bob.com");
		act.setCustomerName("bob brown");
		act.setCustomerPhone("9876543210");
		
		//using constructor
		Account banker = new Account("9876", 0.00, "job jones", "job@jones.com", "6879543210");
		
		
		
				
	}

}
