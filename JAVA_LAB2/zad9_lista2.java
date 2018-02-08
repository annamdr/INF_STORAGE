
/*
LISTA NR 2
13.01.2018
Zad.9
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	double rozw=1;
	System.out.println("Program obliczajacy x do potegi k:");

		Scanner sc = new Scanner(System.in);

		System.out.println("x= ");
		int x = sc.nextInt();
		System.out.println("k= ");
		int k = sc.nextInt();
		sc.close();

	do{
		rozw=rozw*x;
		k=k-1;
	}while(k>0);
	System.out.println(+rozw);
} //main
}