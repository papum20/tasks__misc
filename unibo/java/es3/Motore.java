public abstract class Motore {
	protected int cilindrata;
	protected int numero_cilindri;


	public Motore(int c, int nc) {
		cilindrata = c;
		numero_cilindri = nc;
	}

	public int potenza() {
		return 0;
	}
}
