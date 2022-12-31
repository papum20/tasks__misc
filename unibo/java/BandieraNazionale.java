import java.lang.Math;


public class BandieraNazionale {
	private static Flag[] choice = {Flag.GREEN, Flag.WHITE, Flag.RED};

	public static void main(String[] args) {
		Flag[] A = new Flag[3];

		for(int i = 0; i < A.length; i++) {
			int r = (int)(Math.random() * 3);
			A[i] = choice[r];
		}

		printFlagArray(A);		
		problem(A);
		printFlagArray(A);		

	}



	private static void problem(Flag[] A) {
		int start = 0, end = A.length - 1, c = 0;

		while(end > start && end > c) {
			//printFlagArray(A);
			//System.out.println(start + " " + end + " " + c);

			while(end > start && (A[start] == Flag.GREEN || A[end] == Flag.RED)) {
				if(A[start] == Flag.GREEN) start++;
				if(A[end] == Flag.RED) end--;
			}
			if(end > start) {
				if(A[start] == Flag.RED) {			//A[start]==RED, A[end]!=RED
					swapArray(A, start, end);
					end--;
				}
				else if(A[end] == Flag.GREEN) {		//A[start]==WHITE, A[end]==GREEN
					swapArray(A, start, end);
					start++;
				}
				else {								//A[start]==A[end]==WHITE
					do {
						c = Math.max(c+1, start+1);
					} while(end > c && A[c] == Flag.WHITE);
					if(end > c) {
						if(A[c] == Flag.GREEN) {
							swapArray(A, start, c);
							start++;
						}
						else if(A[c] == Flag.RED) {
							swapArray(A, end, c);
							end--;
						}
					}
				}
			}

		}

		//solve(A, 0, A.length, 0);
	}
	
/*	private void solve(Flag[] A, int s, int e, int c) {
		if(s == e || c == e) return;
		else if(A[s] != Flag.WHITE || A[s] != Flag.WHITE)
		switch(A[s]){
		case GREEN:
			solve(A, s+1, e, Math.max(c, s+1));
			break;
		case RED:
			swapArray(A, s, e);
			solve(A, s, e-1, c);
			break;
		case WHITE:
		//	switch(A[e]);
			break;
		}
	}*/

	private static void swapArray(Object[] A, int x, int y) {
		Object tmp = A[x];
		A[x] = A[y];
		A[y] = tmp;
	}

	private static void printFlagArray(Flag[] A) {
		String out = "";
		for(Flag f : A) {
			if(f == Flag.GREEN) out += "G";
			else if(f == Flag.WHITE) out += "W";
			else if(f == Flag.RED) out += "R";
		}
		System.out.println(out);
	}
}
