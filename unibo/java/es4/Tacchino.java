public class Tacchino extends Animale {
	
	public Tacchino(String n, int a) {
		super(n, a);
	}

	@Override
	public String getVerso() {
		return "goglotta";
	}
	@Override
	public int getZampe() {
		return 2;
	}
}
