public class Gatto extends Animale {

	public Gatto(String n, int a) {
		super(n, a);
	}

	@Override
	public String getVerso() {
		return "miagola";
	}
	@Override
	public int getZampe() {
		return 4;
	}
}
