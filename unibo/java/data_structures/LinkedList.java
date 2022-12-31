//import java.lang.ArithmeticException;


public class LinkedList<E> {
	
	protected Elem<E> head;


	public LinkedList() {
		head = null;
	}

	public void headInsert(E n) {
		head = new Elem<E>(n, head);
	}
	public void tailDelete() {
		if(head == null) return;
		else if(head.next == null) head = null;
		else {
			Elem<E> p = head;
			while(p.next.next != null) p = p.next;
			p.next = null;
		}
	}
	public E getVal() {
		return head.val;
	}
	public void goNext() {
		head = head.next;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public Elem<E> getHead() {
		return head;
	}



	public Object kButLeast(int k) {
		if(head == null) return null;
		else {
			Elem<E> x = head;
			Elem<E> y = x;

			while(y != null && k > 0) {
				y = y.next;
				k--;
			}
			if(y == null) return null;
			else {
				while(y != null) {
					x = x.next;
					y = y.next;
				}
				return x.val;
			}
		}
	}




	public final class Elem<E1> {
		public E1 val;
		public Elem<E1> next;
		public Elem(E1 val, Elem<E1> next) {
			this.val = val;
			this.next = next;
		}
	}

}
