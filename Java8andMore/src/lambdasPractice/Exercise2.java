package lambdasPractice;

//Solution With Lambda functions API
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person(10, "Kobi", 31), 
											new Person(20, "Yoav", 28),
											new Person(30, "Einat", 32));
		
		System.out.println("Origin list");
		System.out.println(people);
		
		//Step 1: Sort list by name - Old School
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1 .getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("Old School Sort by name");
		printList(people);
		//Step 1: Sort list by name - With Lambda
		Collections.sort(people, (p1,p2)->p1.getName().compareTo(p2.getName()));
		
		System.out.println("Lambda Sort by name");
		printList(people);
		
		//Step 2: Create a method that prints all elements in list
		printCondition(people,p->true,p->System.out.println(p));
		
		
		System.out.println("People name begin with Y");
		printCondition(people,p->p.getName().startsWith("Y"),p->System.out.println(p));
		
	}
	
	public static void printList(List<Person> list) {
		
		System.out.println(list);
	}
	//Step 3: Create a method that prints all people that have name beginning with 'Y'
	public static void printListBeginWithChar(List<Person> list,String begin) {
		for(Person p: list) {
			if(p.getName().startsWith(begin)) {
				System.out.print(p+" , ");
			}
		}
		
	}
	
	//Step 3: WithLambda
		public static void printCondition(List<Person> list,Predicate<Person> predicate,Consumer<Person> consumer) {
			for(Person p: list) {
				if(predicate.test(p)) {
					consumer.accept(p);
				}
			}
			
		}
	
	interface Condition{
		boolean check(Person p);
	}

}