package basic;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		t.setName("This is main thread...");
		t.setPriority(10);
		System.out.println("Now thread will sleep for 5 seconds...");
		met();
		System.out.println("Start the class");
		System.out.println(t);
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	
	static void met() throws Exception {
		System.out.println("Method called...");
		Thread.sleep(5000);
	}

}
