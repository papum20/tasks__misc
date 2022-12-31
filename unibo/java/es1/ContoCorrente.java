//package esercizi.es1;


public class ContoCorrente {
	protected float saldo;

	public ContoCorrente(float s) {
		saldo = s;
	}
	public void newContoVuoto() {
		saldo = 0;
	}
	public void newContoX(float X) {
		saldo = X;
	}
	public void versa(float X) {
		saldo += X;
	}
	public boolean preleva(float X) {
		if(saldo >= X) {
			saldo -= X;
			return true;
		}
		else
			return false;
	}
	public void printSaldo() {
		System.out.println("saldo: " + saldo);
	}
}
