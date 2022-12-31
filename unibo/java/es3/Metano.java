public class Metano extends Motore {
	
	@Override
	public int potenza() {
		return ((cilindrata * 0.8) / numero_cilindri) * 0.25;
	}
}
