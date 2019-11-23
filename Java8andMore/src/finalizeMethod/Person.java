package finalizeMethod;

public class Person implements Comparable<Person> {

	private int id;
	private String lastName;
	private String firstName;
	private float age;

	public Person(int id, String lastName, String firstName, float age) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (!(o instanceof Person)) {
			throw new ClassCastException();
		}
		return (this.getId() - o.getId());
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Any last words?");
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Any last words??");
	}
	
	
	

}