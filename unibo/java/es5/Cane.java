import java.time.Year;


public class Cane implements IAnimale {
	String nome;
	int anno;

	public Cane(String n, int a) {
		nome = n;
		anno = a;
	}

	@Override
	public String getVerso() {
		return "abbaia";
	}
	@Override
	public int getZampe() {
		return 4;
	}
	public int getEta() {
		return Year.now().getValue() - anno;
	}

	@Override
	public String toString() {
		return nome + ", " + getEta() + " anni, " + getVerso() + ", " + getZampe() + " zampe";
	}

	public int confronta(IAnimale a) {
		if(a.getEta() > getEta()) return -1;
		else if(a.getEta() == getEta()) return 0;
		else return 1;
	}
}
