package lamdas.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Person jack = new Person("Jack", "Hill", 32);
		Person chris = new Person("Chris", "Nolan", 32);
		Person nick = new Person("Nick", "Halden", 32);
		Person rachel = new Person("Rachel", "Zane", 32);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(jack);
		people.add(chris);
		people.add(nick);
		people.add(rachel);
		
		ArrayList<Person> group = new ArrayList<Person>();
		people.add(jack);
		people.add(chris);
		
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastname().compareTo(p2.getLastname());
			}
		});
		
		List<Integer>  temp =  new ArrayList<Integer>();
		
		temp.add(1);
		temp.add(2);
		temp.add(3);
		temp.add(4);
		
		Collections.sort(temp);
		
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastname().compareTo(p2.getLastname()));
		
		//System.out.println((Person p) -> p.getLastname().startsWith("H"));
		
		List<Person> filteredPeople =  new ArrayList<Person>();
		filteredPeople = people.stream().
				filter(p -> p.getFirstname().equals("Chris")).collect(Collectors.toList());
		
		filteredPeople.stream();
		
		Stream.of(filteredPeople);
		
		
		Stream.builder();
	}

}
