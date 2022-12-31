import java.util.GregorianCalendar;



public class Impiegato extends Persona {
	protected float stipendio;


	public Impiegato(String n, GregorianCalendar d, float s) {
		super(n, d);
		stipendio = s;
	}

	public float getStipendio() {
		return stipendio;
	}
	public void setStipendio(float s) {
		stipendio = s;
	}
}