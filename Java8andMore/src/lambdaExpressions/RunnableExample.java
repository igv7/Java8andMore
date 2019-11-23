package lambdaExpressions;

//Lambda with Runnable
public class RunnableExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi");				
			}
		});
		
		t1.run();
		
		Thread t2 = new Thread(()->System.out.println("Hi2"));
		t2.start();
	}

}