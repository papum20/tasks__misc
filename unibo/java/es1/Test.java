//package esercizi.es1;
//import esercizi.es1.Valuta;



public class Test {
	public static void main(String[] args) {
		ContoCorrenteE cEuro = new ContoCorrenteE(10, Valuta.euro);
		ContoCorrenteE dEuro = new ContoCorrenteE(10, Valuta.dollar);
		ContoCorrenteE pEuro = new ContoCorrenteE(10, Valuta.pound);

		cEuro.printSaldo();
		dEuro.printSaldo();
		pEuro.printSaldo();
	}
}
