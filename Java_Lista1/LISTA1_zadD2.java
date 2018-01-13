/* Anna Mądrecka
wiz-6665
Studia podyplomowe
Lista nr 1 zadanie D2
29.10.2017
*/


import java.util.*;
public class main { //glowny nawias

	public static void main(String[] args) { //drugi nawias
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Proszę podać liczbę a: ");
		int a = sc.nextInt();
		System.out.println("Podano liczbę a=" +a);
		
		System.out.println("Proszę podać liczbę b: ");
		int b = sc.nextInt();
		System.out.println("Podano liczbę b=" +b);
		
		System.out.println("Proszę podać liczbę c: ");
		int c = sc.nextInt();
		System.out.println("Podano liczbę c=" +c);
		
		if (a<=b && a<=c) { //1
			if (b<c) { //2
				System.out.println("Liczby rosnąco: " +a + "," +b +"," +c);
					} //2
			else { 
			System.out.println("Liczby rosnąco: " +a + "," +c +"," +b);
			}
		} //1
		
		if (b<=a && b<=c) { //1
			if (c<a) { //2
				System.out.println("Liczby rosnąco: " +b + "," +c +"," +a);
					} //2
			else { 
			System.out.println("Liczby rosnąco: " +b + "," +a +"," +c);
			}
		} //1
		
		if (c<=b && c<=a) { //1
			if (b<a) { //2
				System.out.println("Liczby rosnąco: " +c + "," +b +"," +a);
					} //2
			else { 
			System.out.println("Liczby rosnąco: " +c + "," +a +"," +b);
			}
		} //1
	
	} //drugi nawias

} // glowny nawias