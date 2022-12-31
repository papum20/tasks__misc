
public class Es {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println(ll.kButLeast(3));
		ll.headInsert(1);
		ll.headInsert(2);
		ll.headInsert(3);
		ll.headInsert(4);
		ll.headInsert(5);
		ll.headInsert(6);
		ll.headInsert(7);
		/*
		while(!ll.isEmpty()) {
			System.out.println(ll.getVal());
			ll.goNext();
		}
		*/
		System.out.println(ll.kButLeast(3));
		System.out.println(ll.getVal());
		System.out.println(ll.kButLeast(10));
	}



}
