package esercizi.slide;
class Rettangolo {
	private int l;
	private int h;
	public Rettangolo (int l, int h) {
		this.h = h;
		this.l = l;
	}
	public int getPerimetro() {
		return (l+h)*2;
	}
	public int getArea() {
		return this.l*this.h;
	}
}