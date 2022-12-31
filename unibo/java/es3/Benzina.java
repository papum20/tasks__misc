import javax.management.monitor.Monitor;

public class Benzina extends Motore {
	
	@Override
	public int potenza() {
		return (cilindrata / numero_cilindri) * 0.1;
	}
}
