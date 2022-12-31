import java.util.GregorianCalendar;

public class Persona {
	protected String nome;
	protected GregorianCalendar data;


	public Persona(String n, GregorianCalendar d) {
		nome = n;
		data = d;
	}

	public String getNome() {
		return nome;
	}
	public GregorianCalendar getData() {
		return data;
	}
	public void setNome(String n) {
		nome = n;
	}
	public void setData(GregorianCalendar d) {
		data = d;
	}
}
