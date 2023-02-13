package Sincronizacion_Ejemplo_1;

public class EjemploNoSincronizado {

	public static void main(String[] args) {
		
		PeligroCuenta pc = new PeligroCuenta();
		Thread one = new Thread(pc);
		Thread two = new Thread(pc);
		one.setName("Jaun");
		two.setName("Maria");
		one.start();
		two.start();
	}

}
