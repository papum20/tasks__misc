public class Cane extends Animale {
	
	public Cane(String n, int a) {
		super(n, a);
	}

	@Override
	public String getVerso() {
		return "abbaia";
	}
	@Override
	public int getZampe() {
		return 4;
	}
}
