//package esercizi.es1;

public class ContoCorrenteE extends ContoCorrente {
	private Valuta valuta;

	public ContoCorrenteE(float s, Valuta v) {
		super(s);
		valuta = v;
	}
	public void printSaldo() {
		switch(valuta){
			case euro:
				System.out.println("saldo in " + valuta + ": " + saldo);
				break;
				case dollar:
				System.out.println("saldo in " + valuta + ": " + saldo / 1.09);
				break;
				case pound:
				System.out.println("saldo in " + valuta + ": " + saldo * 0.89);
				break;
		}
	}
}
