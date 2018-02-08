/*
LISTA NR 2
13.01.2018
Zad.1c
*/

public class Main {

	public static void main(String[] args) {
		double[] ciag = { -1, 3, 5, 7, -9, -11, -13, 15};
		
		System.out.println("Średnia wynosi: " +srednia(ciag));
	}
	// średnia arytmetyczna liczb występujących bezpośrednio po dodatniej

	public static double srednia(double[] ciag) {
		int i = 0;
		int ile = 0;
		double suma = 0;
		for (i = 1; i < ciag.length; i++) {
			if (ciag[i - 1] > 0) {
				ile++;
				suma = suma + ciag[i];
			}
		}

		return suma / ile;
	}
}