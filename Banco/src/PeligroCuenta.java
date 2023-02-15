import java.util.Scanner;

public class PeligroCuenta implements Runnable{
	private CuentaBanco cb;
	private int min;
	private int max;
	
	
	public PeligroCuenta() { //Inicializar variables
		min = 5000;
		max = 100000;
		cb = new CuentaBanco();
	}	
	
	
	public int generarCantidadAleatoria() {		//Valor aleatorio para retirar o abonar un número random:3
		return(int)(Math.random() * (max - min +1) + min);
		
	}
	public void run() {		//Lo uso paraaa sincronizar los metodos y elegir opcion de retirar o abonar mor
		while(cb.getSaldo() >= 0 ) {
        	synchronized (cb) {										/*El uso de la palabra clave "synchronized" se utiliza para garantizar 
            															que solo un hilo a la vez pueda acceder a un método o bloque de código*/

                System.out.println("Elige uno de las siguientes: " + "\n" + "-1- para abonar." + "\n" + "-2- para retirar.");
                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        AbonarDinero();
                        break;
                    case 2:
                        realizarRetiro();
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }




	public synchronized void AbonarDinero() {
		int cantidadAleatoria = generarCantidadAleatoria();

		System.out.println(Thread.currentThread().getName() + " va a abonar: " + "$" + cantidadAleatoria);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cb.abonar(cantidadAleatoria); //metodo de la clase cuenta banco con el parametro del numero random
        System.out.println(" ------ " + Thread.currentThread().getName() + " hizo un abono exitoso de: " + "$" + cantidadAleatoria + " ahora su saldo es: " + "$" + cb.getSaldo() + " ------ " );
    }

	
	public synchronized void realizarRetiro() {
		int cantidadAleatoria = generarCantidadAleatoria();

		if (cb.getSaldo() >= cantidadAleatoria) {
            System.out.println(Thread.currentThread().getName() + " va a retirar: " + "$" + cantidadAleatoria);

            try {
            	Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            cb.retirar(cantidadAleatoria); //metodo de la clase cuenta banco con el parametro del numero random
			System.out.println(" ** " + Thread.currentThread().getName() + " hizo retiro exitoso de: " + "$" + cantidadAleatoria + " ahora su saldo es: " + "$" + cb.getSaldo());
		}else {
			System.out.println("No hay saldo para " + Thread.currentThread().getName() + " para retirar maldito pobre " + "$" + cb.getSaldo());
		}
		System.out.println("Su saldo es: " + "$" + cb.getSaldo());
	}
	
}