
/*
LISTA NR 2
13.01.2018
Zad.3
*/


public class Main{

	public static void main(String[] args){
		
		
		int liczba;
		int kolejna_cyfra;
		int ile=0;
		liczba=123; 
		
		System.out.print("Kolejne cyfry liczby K to: ");
		while(liczba>0){
			kolejna_cyfra=liczba % 10; 
			System.out.print(kolejna_cyfra+", ");
			liczba/=10;
			ile++;
		};
		
		
		System.out.println();
		System.out.println("Cyfr znaczacych: "+ile);
	} 
}