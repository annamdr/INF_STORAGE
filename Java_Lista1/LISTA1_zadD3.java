/* Anna Mądrecka
wiz-6665
Studia podyplomowe
Lista nr 1 zadanie D3
29.10.2017
*/


import java.util.*;
public class main {

	public static void main(String[] args) { // drugi nawias
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Proszę podać pierwszą liczbę: ");
		int a = sc.nextInt();
		System.out.println("Podano pierwszą liczbę =" +a);
		
		System.out.println("Proszę podać drugą liczbę: ");
		int b = sc.nextInt();
		System.out.println("Podano drugą liczbę =" +b);
		
		System.out.println("Proszę podać trzecią liczbę: ");
		int c = sc.nextInt();
		System.out.println("Podano trzecią liczbę =" +c);

		// System.out.println("Podano: "+x+", "+y+", "+z);

		
		if (a<=b && a<=c) { //1
			if (b<c) { //2
				// System.out.println("Liczby rosnąco: " +a + "," +b +"," +c);
					} //2
			else { 
			// System.out.println("Liczby rosnąco: " +a + "," +c +"," +b);
			int k =b;
			b=c;
			c=k;
			}
		} //1
		
		if (b<=a && b<=c) { //1
			if (c<a) { //2
				// System.out.println("Liczby rosnąco: " +b + "," +c +"," +a);
				int k=a;
				a=b;
				b=c;
				c=k;		;
			
					} //2
			else { 
			// System.out.println("Liczby rosnąco: " +b + "," +a +"," +c);
				int k=a;
				a=b;
				b=k;
			}
		} //1
		
		if (c<=b && c<=a) { //1
			if (b<a) { //2
				// System.out.println("Liczby rosnąco: " +c + "," +b +"," +a);
				int k=c;
				c=a;
				a=k;
					} //2
			else { 
			// System.out.println("Liczby rosnąco: " +c + "," +a +"," +b);
				int k=b;
				int d=a;
				a=c;
				b=d;
				c=k;
			}
		} //1
		
		
		
		System.out.println("Podane liczby w kolejności a, b, c:" +a+","+b+","+c);
		
		} // drugi nawias

	
		}//main
	
