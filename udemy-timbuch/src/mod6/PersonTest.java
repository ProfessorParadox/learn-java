package mod6;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullname= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullname= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		
		person.setLastName("Smith");
		System.out.println("fullname= " + person.getFullName());

	}

}
