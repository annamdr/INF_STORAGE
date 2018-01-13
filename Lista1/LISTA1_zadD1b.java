/* 
Lista nr 1 zadanie D1b
2.11.2017
*/


import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		double xq; double yq; 
		double rp;

		System.out.println("Podaj współrzędną punktu P x= ");
		double xp= sc.nextDouble();
		System.out.println("Podano współrzędną x.");

		System.out.println("Podaj współrzędną punktu P y= ");
		double yp= sc.nextDouble();
		System.out.println("Podano współrzędną y.");	
		
		xq=0;
		yq=0;
		rp= Math.sqrt((xq-xp)*(xq-xp) + (yq-yp)*(yq-yp)); // obliczenie promienia koła
		System.out.println("Promień: " +rp);
		
		
		if(rp<=2) 
		{System.out.println("Punkt znajduje się w wewnętrznym kole: 0,2.");}
		
		else if ((rp>2) && (rp<=3)) 
		{System.out.println("Punkt znajduje się w środkowym kole: 2,3.");}
		
		else if ((rp>3) && (rp<=4)) 
		{System.out.println("Punkt znajduje się w zewnętrznym kole: 3,4.");}
		
		else 
		{System.out.println("Punkt znajduje się poza kołami.");}
		
	} // nawias metody main

} // glowny nawias klasy Main
