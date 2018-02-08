/*
LISTA NR 2
13.01.2018
Zad.4
*/


public class Main {
	
	public static void main(String[] args){
		
		
		int liczba;
		int kolejna_cyfra;
		int max_a=0;
		liczba=1239876088; 
		
		
		System.out.println("Dana liczba naturalna K: " +liczba);
		System.out.print("Kolejne cyfry liczby K: ");
		
		while(liczba>0){
			kolejna_cyfra=liczba % 10;
			if(kolejna_cyfra>max_a)
			{
				max_a=kolejna_cyfra;
			};

			System.out.print(kolejna_cyfra+", ");
			liczba/=10;
		};
		
		
		System.out.println();
		System.out.println("Najwieksza cyfra liczby naturalnej K to: " +max_a);
		
	} 
} 