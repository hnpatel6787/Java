package threading;

public class MainClass {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Thread th1 = new Thread(d1);
		Thread th2 = new Thread(d2);
		
		th1.start();
		th2.start();
	}

}
