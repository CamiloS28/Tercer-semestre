

public class EjemploNoSincronizado {

	public static void main(String[] args) {
		
		PeligroCuenta pc = new PeligroCuenta();
		
		Thread one = new Thread(pc);
		Thread two = new Thread(pc);
		
		one.setName("Juan");
		two.setName("Maria");

		one.start();
		two.start();


	}

}
