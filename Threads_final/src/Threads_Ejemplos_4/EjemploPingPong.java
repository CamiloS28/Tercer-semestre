package Threads_Ejemplos_4;

public class EjemploPingPong extends Thread{
	
	private String palabra; // variable a imprimir
	private int TiempoDeEspera; // tiempo entre impresiones
	
	public EjemploPingPong(String queImprimir, int cantidadSegundos) {
		palabra = queImprimir;
		TiempoDeEspera = cantidadSegundos;
	}
	public void run( ) { // sobreescritura del mètodo
		while(true) {
			System.out.println(palabra + "");
			try {
				Thread.sleep(TiempoDeEspera);
			}catch(InterruptedException e) {
				return;
			}
		}
		
	}

}
