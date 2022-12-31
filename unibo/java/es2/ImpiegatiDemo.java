import java.util.Calendar;
import java.util.GregorianCalendar;


public class ImpiegatiDemo {
	public static void main(String[] args) {
		Impiegato[] impiegati = new Impiegato[3];
		GregorianCalendar d1 = new GregorianCalendar(2000, 10, 12);
		GregorianCalendar d2 = new GregorianCalendar(1999, 1, 2);
		GregorianCalendar d3 = new GregorianCalendar(1970, 3, 10);
		impiegati[0] = new Impiegato("Giorgio", d1, 10);
		impiegati[1] = new Stagista("Franco", d2, 34, 0, 555);
		impiegati[2] = new Impiegato("Marta", d3, 100);

		Impiegato res = CercaGiovane(impiegati);
		System.out.println("Il piu giovane e " + res.getNome() + ", nato il "
			+ res.getData().get(Calendar.DAY_OF_MONTH) + "/" + res.getData().get(Calendar.MONTH) + "/" + res.getData().get(Calendar.YEAR)
			+ " con stipendio " + res.getStipendio());
	}	

	private static Impiegato CercaGiovane(Impiegato[] impiegati) {
		Impiegato mn = impiegati[0];
		for(Impiegato i : impiegati) {
			if(mn.getData().compareTo(i.getData()) == 1)
				mn = i;
		}
		return mn;
	}
}
