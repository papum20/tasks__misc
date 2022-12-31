import java.time.Year;



public abstract class Animale {
	String nome;
	int anno;


		public Animale(String n, int a) {
			nome = n;
			anno = a;
		}

	public String getVerso() {
		return "";
	}
	public int getZampe() {
		return 0;
	}
	public int getEta() {
		return Year.now().getValue() - anno;
	}

	@Override
	public String toString() {
		return nome + ", " + getEta() + " anni, " + getVerso() + ", " + getZampe() + " zampe";
	}

	public int confronta(Animale a) {
		if(a.getEta() > getEta()) return -1;
		else if(a.getEta() == getEta()) return 0;
		else return 1;
	}
}
