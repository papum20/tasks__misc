package esercizi.slide;
public class CoppiaMista<T1,T2> {
	protected T1 first;
	protected T2 second;

	public CoppiaMista(T1 f, T2 s) {
		first = f;
		second = s;
	}

	public T1 getFirst() {
		return first;
	}
	public T2 getSecond() {
		return second;
	}

	public boolean CheckOmogenei() {
		return first.getClass() == second.getClass();
	}
}
