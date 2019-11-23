package staticArea;

public class Use {
	
	static {
		
	}
	
	
	public static class Example{
		static final int i=2;
		static int j=3;
		
		
		static {
			System.out.println("Moshe");
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(Example.j);
	}
}