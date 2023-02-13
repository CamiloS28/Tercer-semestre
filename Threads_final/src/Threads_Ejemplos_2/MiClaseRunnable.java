package Threads_Ejemplos_2;

public class MiClaseRunnable implements Runnable{
	
	private String descripcion;
	
	public MiClaseRunnable(String str) {
		descripcion = str;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(descripcion + ": Este es el Thread " + Thread.currentThread().getName());
		}
	}
}
