/*
LISTA NR 2
13.01.2018
Zad.1b
*/

public class Main {

	public static void main(String[] args) {
		double[] ciag = { -1, 3, 5, 7, -9, -11, -13, 15};
		
		System.out.println("Œrednia wynosi: " +srednia(ciag));
	}

	public static double srednia(double[] ciag) {

		int ile = 0;
		double suma = 0;
		for (int k=0; k < ciag.length; k++) {
			if (ciag[k] > 0) {
				ile++;
				suma += ciag[k];
			}
		}
		return suma/ile;
	}
}