package understandingTheHashCode;

public class Test {

	public static void main(String[] args) {
		String s1 = "FB";
		String s2 = "Ea";
		
		System.out.println("s1 == s2                       -> "+(s1==s2));		
		System.out.println("s1.hashCode() == s1.hashCode() -> "+(s1.hashCode() == s2.hashCode()));

		System.out.println("**************************************************************************");
		String s3 = new String("FB");
		String s4 = new String("Ea");
		
		
		System.out.println("s3 == s4                       -> "+(s3==s4));		
		System.out.println("s3.hashCode() == s4.hashCode() -> "+(s3.hashCode() == s4.hashCode()));
		System.out.println("**************************************************************************");
		
		String s5 = new String("FB");
		System.out.println("s3 == s5                       -> "+(s3==s5));		
		System.out.println("s3.hashCode() == s5.hashCode() -> "+(s3.hashCode() == s5.hashCode()));
		

	}

}