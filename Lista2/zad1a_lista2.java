/*
LISTA NR 2
13.01.2018
Zad.1a
*/

public class Main {

	public static void main(String[] args) {
		int ciag[] = { 1, 3, 5, 7, 9, 11, 13, 15 };

		int suma = 0;
		for (int k = 0; k < ciag.length; k++)
			suma = suma + ciag[k];
		System.out.println("Suma wszystkich liczb ciągu wynosi " +suma);

	}
}