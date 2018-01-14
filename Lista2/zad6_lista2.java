/*
LISTA NR 2
13.01.2018
Zad.6
*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Proszê podaæ liczbê naturaln¹ M: ");
		int m = sc.nextInt();
		System.out.println("Proszê podaæ liczbê naturaln¹ N: ");
		int n = sc.nextInt();


		if (n > m) {
			int a = m;
			m = n;
			n = a;
		}
		int i=m;
		
		for (; m % i != 0 || n % i != 0; i--) {
		}
		
		System.out.println("Najwiêkszy wspólny dzielnik to " +i);

	}

}
