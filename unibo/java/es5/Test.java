


public class Test {
	public static void main(String[] args) {
		IAnimale cat = new Gatto("plutp", 1970);
		IAnimale dog = new Cane("pipp", 1999);
		IAnimale turkey = new Tacchino("miao", 1888);

		System.out.println(cat);
		System.out.println(dog);
		System.out.println(turkey);

		System.out.println(cat.confronta(dog));
		System.out.println(dog.confronta(turkey));
		System.out.println(dog.confronta(dog));
	}	
}
