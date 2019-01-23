package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
	
		Cat Barsik = new Cat("Barsik", "Black", 5, 3, 'm', 18, 20);
		Cat Belka = new Cat ("Belka", "White", 4, 2, 'f', 17, 10.0);
		
		Barsik.print();
		Barsik.may();
		
		Belka.print();
		
		Barsik.FeedCat("meat", 4);
		Barsik.FeedCat("milk", 3);
		Barsik.printNew();
				
		Belka.FeedCat("meat", 2);
		Belka.FeedCat("milk", 1);
		Belka.printNew();
		
	}

}
