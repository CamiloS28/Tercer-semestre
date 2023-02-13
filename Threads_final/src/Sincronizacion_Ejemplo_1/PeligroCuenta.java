package Sincronizacion_Ejemplo_1;

public class PeligroCuenta implements Runnable{
	
	private CuentaBanco cb = new CuentaBanco();
	
	public void run() {
		for (int x = 0; x < 10; x++) {
			realizarRetiro(5000);
			if(cb.getSaldo() < 0) {
				System.out.println(Thread.currentThread().getName() + " Tiene cuenta sobregriada - Saldo actual: " + cb.getSaldo());
			}
		}
	}
	public synchronized void realizarRetiro(int valor) {
		if(cb.getSaldo() >= valor) {
			System.out.println(Thread.currentThread().getName() + " Tiene saldo Actual de: " + cb.getSaldo() + " y va a retirar: " + valor);
		
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ex) {
				
			}
			cb.retirar(valor);
			System.out.println(" ** " + Thread.currentThread().getName() + " hizp retiro exitoso de: " + valor + " ahora su saldo es: " + cb.getSaldo());
		}else {
			System.out.println("No hay saldo para " + Thread.currentThread().getName() + " para retirar " + cb.getSaldo());
		}
		System.out.println("Su saldo es: " + cb.getSaldo());
	}
}
