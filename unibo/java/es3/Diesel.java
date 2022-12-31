import javax.management.monitor.Monitor;

public class Diesel extends Monitor {
	
	@Override
	public int potenza() {
		return (cilindrata / numero_cilindri) * 0.2;
	}
}
