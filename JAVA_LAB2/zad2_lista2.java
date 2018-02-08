/*
LISTA NR 2
13.01.2018
Zad. 2
*/

public class Main{

	public static void main(String[] args){
		
		int liczba;
		int kolejna_cyfra;
		int ile=0;
		liczba=1234567890; 
		int komunikatLiczba = liczba;
		
		
		while(liczba>0){
			kolejna_cyfra=liczba % 10; 
			System.out.println("Reszta z dzielenia przez 10:"+ kolejna_cyfra);
			liczba/=10;
			ile=ile+kolejna_cyfra;
		};
		
		
		System.out.println("Suma cyfr danej liczby ("+komunikatLiczba+") wynosi: "+ile);
		
	} 
} 