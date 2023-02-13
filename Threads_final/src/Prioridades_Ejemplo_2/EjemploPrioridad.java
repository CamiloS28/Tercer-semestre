package Prioridades_Ejemplo_2;

public class EjemploPrioridad implements Runnable{
	
	public void run() {
		for(int i = 0; i <= 5; i++) 
			System.out.println(i + " " + Thread.currentThread().getName());
		
		System.out.println("Termina Thread " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		EjemploPrioridad ep1 = new EjemploPrioridad();
		Thread ej1T = new Thread (ep1, "Golpe uno");
		
		ej1T.setPriority(Thread.MIN_PRIORITY);
		
		EjemploPrioridad ep2 = new EjemploPrioridad();
		Thread ej2T = new Thread (ep2, "Golpe dos.");
		
		ej1T.setPriority(Thread.MAX_PRIORITY);
		
		ej1T.start();
		ej2T.start();
		
		System.out.println("Termina el hilo prinicipal");
		
	}

}
