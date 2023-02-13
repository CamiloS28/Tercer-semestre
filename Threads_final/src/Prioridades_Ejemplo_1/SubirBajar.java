package Prioridades_Ejemplo_1;

public class SubirBajar extends Thread{
	private String palabra;
	
	public SubirBajar(String str) {
		palabra = str;
	}
	
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(palabra);
		}
	}
}
