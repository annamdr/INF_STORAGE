/* Anna Mądrecka
wiz-6665
Studia podyplomowe
Lista nr 1 zadanie D4a
30.10.2017
*/


import java.util.Scanner;
public class main { //pierwszy nawias
	public static void main(String[] args) { // drugi nawias
		// TODO Auto-generated method stub
		
		// trójkąt - liczby całkowite (int)
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
		
		// Czy można zbudować trójkąt z danych odcinków:
		
		if (((a+b)>c) && ((a+c)>b) && ((b+c)>a))
		{System.out.println("Z danych odcinków a, b, c można zbudować trójkąt.");} 
		
		
	{
		if ((a==b)&& (b==c))
		{System.out.println("Z danych odcinków a, b, c można zbudować trójkąt równoboczny.");}
		
			
		else if (((a==b) && (a!=c) && (b!=c)) || ((b==c) && (a!=b) && (a!=c)) || 
		((c==a) && (c!=b) && (a!=b)))
		{System.out.println("Z danych odcinków a, b, c można zbudować trójkąt równoramienny.");}
		
	
		else if ((a!=0 && b!=0 && c!=0) && ((a!=b) && (b!=c) && (c!=a)))
		
		{System.out.println("Z danych odcinków a, b, c można zbudować trójkąt różnoboczny.");}
	
	
		else if (a<=0 || b<=0 || c<=0)
		{System.out.println("Z danych odcinków a, b, c nie można zbudować trójkąta.");}
	}
 }// drugi nawias
} //glowny nawias

	
	