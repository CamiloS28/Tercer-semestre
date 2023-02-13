package Prioridades_Ejemplo_1;

public class EjecutaSubirBajar {

	public static void main(String[] args) {
		Thread tM = new SubirBajar("MMM");
		Thread tm = new SubirBajar("mmm");
		tm.setPriority(Thread.MAX_PRIORITY);
		tM.setPriority(Thread.MIN_PRIORITY);
		tm.start();
		tM.start();
	}

}
