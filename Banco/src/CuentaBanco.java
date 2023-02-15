

public class CuentaBanco {
	
	private int saldo = 10000;
	
	
	public void retirar (int monto) {
		saldo = saldo - monto;
	}
	public void abonar (int valor) {
		saldo = saldo + valor;
	}
	
	public int getSaldo() {
		return saldo;
	}
}
