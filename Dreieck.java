public class Dreieck {
	private double a;
	private double b;
	private double c;
	private double alpha;
	private double beta;
	private double gamma;
	//Getter und Setter
	public double getA() {
		return a;	
	}
	
	public void setA(double a) {
		this.a = a;	
	}
	
	public double getB() {
		return b;	
	}
	
	public void setB(double b) {
		this.b = b;	
	}
	
	public double getC() {
		return c;	
	}
	
	public void setC(double c) {
		this.c = c;	
	}

	public double getAlpha() {
		return alpha;	
	}
	
	public void setAlpha(double a, double b, double c) {
		// acos gibt die Zahl als Radiant aus
		this.alpha = Math.acos(((b * b + c * c - a * a) / (2 * b * c)));	
	}
	
	public double getBeta() {
		return beta;	
	}
	
	public void setBeta(double a, double b, double c) {
		this.beta = Math.acos(((a * a + c * c - b * b) / (2 * a * c)));	
	}

	public double getGamma() {
		return gamma;	
	}
	
	public void setGamma(double a, double b, double c) {
		this.gamma =  Math.acos(((a * a + b * b - c * c) / (2 * a * b)));
			
	}

	public Dreieck(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
		setAlpha(a, b, c);
		setBeta(a, b, c); 
		setGamma(a, b, c);
	}

	/**
	* Testet auf Gleichschenkligkeit
	* @return true wenn zwei Seiten Gleich sind
	*/
	public boolean istGleichschenklig() {
		if(this.a == this.b && this.b == this.c && this.a == this.c) return false;
		else if(this.a == this.b || this.a == this.c || this.b == this.c) return true;
		else return false;
	}
	
	/**
	* Testet auf einen rechten Winkel
	* @return true wenn ein Winkel rechts ist
	*/
	public boolean hatRechtenWinkel() {
		double threshold = 0.0009;
		double rechts = Math.PI / 2;
		if(Math.abs(this.alpha - rechts) < threshold) return true;
		else if(Math.abs(this.beta - rechts) < threshold) return true;
		else if (Math.abs(this.gamma - rechts) < threshold) return true;
		else return false;
	} 

	/**
	* Testet auf Gleichseitigkeit
	* @return true wenn alle Seiten
	* gleich 
	*/
	public boolean istGleichseitig() {
		if(this.a == this.b && this.b == this.c && this.a == this.c) return true;
		else return false;	
	}

	/**
	* Ausgabe vom Objekt Dreieck
	*/ 
	public void ausgeben() {
		if(this.istGleichschenklig())
			System.out.printf("Das Dreieck ist gleichschenklig.%n");
		else if(this.hatRechtenWinkel())
			System.out.printf("Das Dreieck ist rechtwinklig.%n");
		else if(this.istGleichseitig())
			System.out.printf("Das Dreieck ist gleichseitig.%n");
		else
			System.out.printf("Das Dreieck hat keines der drei Eigenschaften%n");
		
		System.out.printf("Seiten: a %.2f, b %.2f, c %.2f%n Winkel: alpha %.2f beta %.2f gamma %.2f%n"
				  , this.a, this.b, this.c, Math.toDegrees(alpha), Math.toDegrees(beta)
				  , Math.toDegrees(gamma));
	}
	
	/**
	* Vergleich der Seitenlaengen
	* mit dem uebergebenen Objekt Dreieck
	* @param Dreieck d uebergebenes Dreieck
	* @return boolean true bei Gleichheit
	*/
	public boolean gleich(Dreieck d) {
		if(this.a == d.a && this.b == d.b && this.c == d.c)
			return true;
		else
			return false;	
	}
	
	/**
	* Vergleich der Winkel
	* mit dem uebergebenen Objekt Dreieck
	* @param Dreieck d uebergebenes Dreieck
	* @return boolean true bei Gleichheit
	*/
	public boolean gleicheWinkel(Dreieck d) {
		if(this.alpha == d.alpha && this.beta == d.beta && this.gamma == d.gamma)
			return true;
		else
			return false;	
	}
}
