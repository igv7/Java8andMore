package scope;

//Understanding Stack, Heap, Types & Variables

//TYPES 
//Primitive data type
//Class type

//VARIABLES
//Local Variable
//Instance Variable
//Reference Variable

public class Scope {
	private int i = 9;
	public void first() {
		int j=3,i;
		i=5;
		this.i = i+j;
		second(j);
	}
	public void second(int i) {
		int j=1;
		this.i = i + j;
	}
	public static void main(String[] args) {
		Scope s = new Scope();
		s.first();
		System.out.println(s.i);
	}
}