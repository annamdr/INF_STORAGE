/* Anna Mądrecka
wiz-6665
Studia podyplomowe
Lista nr 1 zadanie D4b
30.10.2017
*/

import java.util.Scanner;
public class main { //pierwszy nawias
	public static void main(String[] args) { // drugi nawias
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Proszę podać długość odcinka a: ");
		int a = sc.nextInt();
		System.out.println("Podano długość odcinka =" +a);
		
		System.out.println("Proszę podać długość odcinka b: ");
		int b = sc.nextInt();
		System.out.println("Podano długość odcinka b =" +b);
		
		System.out.println("Proszę podać długość odcinka c: ");
		int c = sc.nextInt();
		System.out.println("Podano długość odcinka c=" +c);


		


		if (((a+b)>c) && ((a+c)>b) && ((b+c)>a))
		{System.out.println("Z danych odcinków a, b, c można zbudować trójkąt.");}

		{
		if (((a*a + b*b) == c*c) || ((a*a + c*c) == b*b) || ((b*b + c*c) == a*a))
		{System.out.println("Z podanych odcinków można zbudować trójkąt prostokątny.");}


		else if (((a*a + b*b)>c*c) || ((a*a + c*c)>b*b) || ((b*b + c*c)>a*a))
		{System.out.println("Z podanych odcinków można zbudować trójkąt ostrokątny.");}



		else if (((a*a + b*b)<c*c) || ((a*a + c*c)<b*b) || ((b*b + c*c)<a*a))
		{System.out.println("Z podanych odcinków można zbudować trójkąt rozwartokątny.");}	
		
		
		else 
		{System.out.println("Z podanych odcinków nie można zbudować trójkąta.");};
		}
	}
}