/*
LISTA NR 2
13.02.2018
Zad.5
*/

import java.util.*; 
					
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program sprawdza czy podana liczba K jest liczba pierwsza.");
		
		
		Scanner rk = new Scanner(System.in);
		double k = rk.nextDouble();
		double p=1;
		
		do{
			p++;
			System.out.println("Podana liczba K: "+k+" dziele przez P: "+p);
		}while((k%p)!=0); // dopóki podana liczba K dzielona przez liczbê P ma resztê z dzielenia ró¿n¹ od 0
		
		if(p==k) // liczba pierwsza = liczba podzielna przez 1 oraz sam¹ siebie
		{
			System.out.println("Podana liczba K to liczba pierwsza.");
		}
		else // liczba jest podzielna przez 1, sam¹ siebie oraz inn¹/inne liczby
		{
			if(k%p==0) // sprawdzam, czy podana liczba K dzielona przez naliczone P nie ma reszty z dzielenia
			{
				System.out.println("Podana liczba K nie jest liczb¹ pierwsz¹.");
			}
		};
	} 
} 