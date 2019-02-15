public class CosCheck{
	public static double setGamma(double a, double b, double c) {
		double gamma =  Math.acos((a * a + b * b - c * c) / (2 * a * b));
		return gamma;	
	}
	
	public static boolean hatRechtenWinkel(double alpha, double beta, double gamma) {
			final double threshold = 0.0001;
			double rechts = 1.57;
			boolean equal = Math.abs(gamma - rechts) < 0.000001;
			return equal;
	}

	public static void main(String[] args) {
			double winkel = setGamma(3, 4, 5);
			System.out.printf("Winkel: %.2f%n", winkel/*Math.toDegrees(winkel)*/);
			double a = 3.0, b = 4.0;
			if(hatRechtenWinkel(a, b, winkel)) 
				System.out.printf("Recchter wonkel\n");
			else 
				System.out.printf("Kein rechter winkel\n");

	}	
}
