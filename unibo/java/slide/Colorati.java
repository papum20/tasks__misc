package esercizi.slide;
public class Colorati<A1 extends A, B1 extends B> extends CoppiaMista<A, B> {
	private Color c;

	public Colorati(A f, B s, Color c) {
		super(f, s);
		this.c = c;
	}
}
