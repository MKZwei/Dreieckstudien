public class DreieckTest {
	public static void vergleich(Dreieck a, Dreieck b) {
		// Prueft auf gleiche Laenge
		if(a.gleich(b))
			System.out.printf("Die Dreiecke haben die gleiche Seitenlänge.%n");
		else
			System.out.printf("Die Dreiecke haben unterschiedliche Seitenlängen.%n");
		// Prueft auf gleiche winkel
		if(a.gleicheWinkel(b))
			System.out.printf("Die Dreiecke haben die gleichn Winkel.%n");
		else
			System.out.printf("Die Dreiecke haben ungleiche Winkel.%n");
				 
	
	}

	public static void main(String[] args) {
		Dreieck[] dreieck = new Dreieck[5];
		dreieck[0] = new Dreieck(5, 4, 5); 
		dreieck[1] = new Dreieck(3, 3, 3);
		dreieck[2] = new Dreieck(3, 4, 5);
		dreieck[3] = new Dreieck(3, 4, 2);
		dreieck[4] = new Dreieck(5, 4, 5);
		//Ausgabe der Dreiecke
		System.out.printf("Prüft die Dreiecke auf deren Eigenschaft.%n%n");
		for(Dreieck d : dreieck) {
			d.ausgeben();
			System.out.printf("\n");		
		}
		// Vergleicht zwei Dreiecken
		System.out.printf("%nVergleich von zwei Dreiecke%n");
		System.out.printf("Vergleich von Dreieck 1 und 5\n");
		vergleich(dreieck[0], dreieck[4]);
		System.out.printf("\nVergleich von Dreieck 2 und 4\n");
		vergleich(dreieck[1], dreieck[3]);
			
	}	
		
}
