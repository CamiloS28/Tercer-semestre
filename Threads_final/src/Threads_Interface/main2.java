package Threads_Interface;

public class main2 {

	public static void main(String[] args) {
		
		Thread t = new Thread (new Mio2oThread());
		t.start();
	}

}
