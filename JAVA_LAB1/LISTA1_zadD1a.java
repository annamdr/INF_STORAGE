/* 
Lista nr 1 zadanie D1a
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
		
	
	if (xp>0 && yp>0) { //pierwszy warunek
	System.out.println("Podany punkt jest w obszarze 1 : 1,1.");	
	
	xq=1;
	yq=1; // srodek koła w obszarze 1: 1,1
	
	rp= Math.sqrt((xq-xp)*(xq-xp) + (yq-yp)*(yq-yp));
	System.out.println("Promień: "+rp); //policzony promień od punktu P do srodka koła
	if (rp<=1) {
		System.out.println("Punkt P należy do obszaru koła 1: 1,1.");
	}
	else 
	{
		System.out.println("Punkt P nie należy do obszaru koła 1: 1,1.");
	}
	}
	
	if (xp<0 && yp>0) { // drugi warunek
		System.out.println("Podany punkt jest w obszarze koła 2 : -1,1.");	
		xq=-1;
		yq=1; // srodek koła w obszarze 2: -1,1
		
		rp= Math.sqrt((xq-xp)*(xq-xp) + (yq-yp)*(yq-yp));
		System.out.println("Promień: "+rp); //policzony promień od punktu P do srodka koła
		if (rp<=1) {
			System.out.println("Punkt P należy do obszaru koła 2: -1,1.");
		}
		else 
		{
			System.out.println("Punkt P nie należy do obszaru koła 2: -1,1.");
		}
	}
	
	
	
	if (xp<0 && yp<0) {
		System.out.println("Podany punkt jest w obszarze koła 3 : -1,-1.");	
		xq=-1;
		yq=-1; // srodek koła w obszarze 3: -1,-1
		
		rp= Math.sqrt((xq-xp)*(xq-xp) + (yq-yp)*(yq-yp));
		System.out.println("Promień: "+rp); //policzony promień od punktu P do srodka koła
		if (rp<=1) {
			System.out.println("Punkt P należy do obszaru koła 3: -1,-1.");
		}
		else 
		{
			System.out.println("Punkt P nie należy do obszaru koła 3: -1,-1.");
		}	
	}
	
	
	
	if (xp>0 && yp<0) {
		System.out.println("Podany punkt jest w obszarze koła 4 : 1,-1.");	
		xq=1;
		yq=-1; // srodek koła w obszarze 4: 1,-1
		
		rp= Math.sqrt((xq-xp)*(xq-xp) + (yq-yp)*(yq-yp));
		System.out.println("Promień: "+rp); //policzony promień od punktu P do srodka koła
		if (rp<=1) {
			System.out.println("Punkt P należy do obszaru koła 4: 1,-1.");
		}
		else 
		{
			System.out.println("Punkt P nie należy do obszaru koła 4: 1,-1.");
		}
	}
	
	} // nawias metody main

} // glowny nawias - klasa Main

