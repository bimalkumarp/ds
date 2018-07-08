package Test;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

class Person {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}

public class StreamAPITester {

	public static void main(String[] args) {

		List<Person> personList=Arrays.asList(new Person("Bimal","Panigrahi"),new Person("Shradha","Samantaray"),
				new Person("Ganda","Go"),new Person("Guli","Panigrahi"));
		
		
		personList.stream()
		.filter(i->i.getLastName().startsWith("S") || i.getLastName().startsWith("P")
			
		)
		.forEach(j->{
			System.out.println(j);
		System.out.println(j.getLastName());
			
		});
	}

}
