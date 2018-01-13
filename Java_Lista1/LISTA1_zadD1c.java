/* Anna Mądrecka
wiz-6665
Studia podyplomowe
Lista nr 1 zadanie D1c
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
		
		if (xp>0 && yp>0 && yp<=(-xp+1)) { //pierwszy kwadrat + funkcja y=-x+1
			System.out.println("Podany punkt jest w obszarze trójkąta 1 : 1,1.");
		}
		
		if (xp<0 && yp>0 && yp<=(-xp)) { // drugi kwadrat + funkcja y=-x
			System.out.println("Podany punkt jest w obszarze trójkąta 2 : -1,1.");	
		}
		
		if (xp<0 && yp<0 && yp<=(-xp-1)) { // trzeci kwadrat + funkcja y= -x-1
			System.out.println("Podany punkt jest w obszarze trójkąta 3 : -1,-1.");	
		}
		if (xp>0 && yp<0 && yp<=(-xp)) { // czwarty kwadrat + funkcja y=-x
		System.out.println("Podany punkt jest w obszarze trójkąta 4 : 1,-1.");	
		}	
	
		// else // dodac inne else if
		// System.out.println("Podany punkt nie jest w obszarze trójkąta.");
	
	}
}
