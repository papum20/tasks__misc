import java.util.GregorianCalendar;

import javax.imageio.stream.ImageInputStreamImpl;

public class Stagista extends Impiegato {
	private float numeroPresenze;
	private int numeroIdentificativoStage;


	public Stagista(String n, GregorianCalendar d, float s, float np, int nis) {
		super(n, d, s);
		numeroPresenze = np;
		numeroIdentificativoStage = nis;
	}

	public float getNumeroPresenze() {
		return numeroPresenze;
	}
	public int getNumeroIdentificativoStage() {
		return numeroIdentificativoStage;
	}
	public void setNumeroPresenze(float np) {
		numeroPresenze = np;
	}
	public void getNumeroPresenze(int nis) {
		numeroIdentificativoStage = nis;
	}
}
