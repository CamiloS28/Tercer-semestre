package Sincronizacion_Ejemplo_1;

public class CuentaBanco {
	private int saldo = 100000;
	
	
	public void retirar (int monto) {
		saldo = saldo - monto;
	}
	
	public int getSaldo() {
		return saldo;
	}
}
