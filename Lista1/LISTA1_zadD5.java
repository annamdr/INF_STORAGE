/* 
Lista nr 1 zadanie D5
2.11.2017
*/


import java.util.Scanner;
import static java.lang.Math.*;

public class main {
private static double odl (double xa, double xb, double ya, double yb) {
	double dx= xa - xb;
	double dy= ya - yb;
return Math.sqrt(dx*dx+dy*dy); // odleglość każdego boku podanego trojkata (na osi wspolrzednych)
}

private static double poleWgHerona (double xp, double yp, 
		double xq, double yq, double xr, double yr) {
	double b1 = odl (xp, yp, xq, yq);
	double b2 = odl (xq, yq, xr, yr);
	double b3 = odl (xr, yr, xp, yp);
	
	double p = (b1+b2+b3)/2;
	return Math.sqrt(p*(p-b1)*(p-b2)*(p-b3));
	// pole trójkąta wg wzoru Herona 
}

private static boolean  nalezy (double x0, double y0, double x1, double y1, 
		double x2, double y2, double x3, double y3) {
	double S1 = poleWgHerona (x1, y1, x2, y2, x0, y0);
	double S2 = poleWgHerona (x2, y2, x3, y3, x0, y0);
	double S3 = poleWgHerona (x3, y3, x1, y1, x0, y0);
	double S = poleWgHerona (x1, y1, x2, y2, x3, y3);

	if (S1 +S2 +S3 -S <= 0.001)
	{return true;}
	
	else {return false;}
	}
  //punkt należy do obszaru wyznaczonego przez trójkąt


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Proszę podać współrzędną punktu P x0=: ");
		double x0 = sc.nextInt();
		System.out.println("Podano współrzędną x0 =" +x0);
		
		System.out.println("Proszę podać współrzędną punktu P y0=: ");
		double y0 = sc.nextInt();
		System.out.println("Podano współrzędną y0 =" +y0);
		
		// podane są współrzędne punktu P
		
		System.out.println("Proszę współrzędną wierzchołka A x1: ");
		double x1 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka A x1= " +x1);
		
		System.out.println("Proszę podać współrzędną wierzchołka A y1: ");
		double y1 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka A y1: " +y1);
		
		System.out.println("Proszę współrzędną wierzchołka B x2: ");
		double x2 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka B x2= " +x2);
		
		System.out.println("Proszę podać współrzędną wierzchołka B y2: ");
		double y2 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka B y2: " +y2);
		
		System.out.println("Proszę współrzędną wierzchołka C x3: ");
		double x3 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka C x3= " +x3);
		
		System.out.println("Proszę podać współrzędną wierzchołka C y3: ");
		double y3 = sc.nextInt();
		System.out.println("Podano współrzędną wierzchołka A y3: " +y3);
		
		if (nalezy(x0, y0, x1, y1, x2, y2, x3, y3))
		{System.out.println("Podany punkt P należy do obszaru trójkąta.");}
		
		else {System.out.println("Podany punkt nie nalezy do obszaru trójkąta.");
		}
	}

}