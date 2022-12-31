import Cittadinanza;

package esercizi.slide;
import esercizi.slide.Cittadinanza;

public class Persona {
	private String nome;
	private String cognome;
	private Cittadinanza cittadinanza;

	Persona(String nome, String cognome, Cittadinanza cittadinanza) {
		this.nome = nome;
		this.cognome = cognome;
		this.cittadinanza = cittadinanza;
	}

	public void getInfo() {
		System.out.println("Mi chiamo " + nome + " " + cognome + " e ho cittadinanza " + cittadinanza);
	}

}
