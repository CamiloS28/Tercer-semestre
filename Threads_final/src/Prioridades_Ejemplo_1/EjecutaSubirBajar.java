package Prioridades_Ejemplo_1;

public class EjecutaSubirBajar {

	public static void main(String[] args) {
		Thread tM = new SubirBajar("Minima");
		Thread tm = new SubirBajar("Maxima");
		Thread k = new SubirBajar("7");
		tm.setPriority(Thread.MAX_PRIORITY);
		tM.setPriority(Thread.MIN_PRIORITY);
		k.setPriority(Thread.NORM_PRIORITY);
		tm.start();
		tM.start();
		k.start();
	}

}
