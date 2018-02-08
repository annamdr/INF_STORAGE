/* 
Lista nr 1 zadanie D6
3.11.2017
*/


import java.util.Scanner;
public class Main {
	public static void main(String[] args) { // drugi nawias
		

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Proszę podać pierwszą liczbę (dzień): ");
		int d = sc.nextInt();
		System.out.println("Podano pierwszą liczbę =" +d);
		
		System.out.println("Proszę podać drugą liczbę (miesiąc): ");
		int m = sc.nextInt();
		System.out.println("Podano drugą liczbę =" +m);
		
		System.out.println("Proszę podać trzecią liczbę (rok): ");
		int r = sc.nextInt();
		System.out.println("Podano trzecią liczbę =" +r);
		
		// kalendarz gregoriański, rok n.e. (od 0)
		
		boolean poprawna = d>0 && m>0 && m<=12 && r>0;
		if (poprawna) {
			int maxD=31; 
			if (m==4 || m==6 || m==9 || m==11) maxD=30;
			
			else if (m==2)
				if ((r%4==0) && (r%100!=0) || (r%400==0)) maxD=29;
				else maxD=28;
			poprawna = d <= maxD;
			
			System.out.println ("Podana data " +d+ "." +m+ "." +r+ "jest");
			if (poprawna) System.out.println ("poprawna.");
			else System.out.println ("niepoprawna.");
				}
		
		// JUTRO BĘDZIE
		System.out.println("Dziś jest " +d+ "." +m+ "."+r+".");
		// dla miesięcy 1,3,5,7,8,10,12
	
		if(((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))&&((d>0)&&(d<=30))) {
		int d1;
		d1=d+1;
		System.out.println("Jutro będzie " +d1+ "." +m+ "." +r+ ".");
		}
		
		else if(((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10))&&(d==31)) {
		int m2; int d2;
		m2=m+1;
		d2=31-30;
		System.out.println("Jutro będzie " +d2+ "." +m2+ "." +r+ ".");
		}
		
		else if((m==12)&&(d==31)) {
		int m3; int d3; int r3;
		m3=m-11;
		d3=31-30;
		r3=r+1;
		System.out.println("Jutro będzie " +d3+ "." +m3+ "." +r3+ ".");
		}
		
		// dla miesięcy 4, 6, 9, 11
		else if(((m==4)||(m==6)||(m==9)||(m==11))&&((d>0)&&(d<=29))) {
		int d1;
		d1=d+1;
		System.out.println("Jutro będzie " +d1+ "." +m+ "." +r+ ".");
		}
		
		else if(((m==4)||(m==6)||(m==9)||(m==11))&&(d==30)) {
		int m2; int d2;
		m2=m+1;
		d2=30-29;
		System.out.println("Jutro będzie " +d2+ "." +m2+ "." +r+ ".");
		}
		
		// luty
		else if((m==2) && ((d>0) && (d<=27))) {
		int d1;
		d1=d+1;
		System.out.println("Jutro będzie " +d1+ "." +m+ "." +r+ ".");
		}
		
		else if(((m==2) && (d==28)) && ((r%4==0) && (r%100!=0) || (r%400==0))) { //gl
		int d1;
		d1=d+1;
		System.out.println("Jutro będzie " +d1+ "." +m+ "." +r+ ".");
		}
		
		else if(((m==2) && (d==28)) && ((r%4!=0))) {
		int d2; int m2;
		d2=28-27;
		m2=m+1;
		System.out.println("Jutro będzie " +d2+ "." +m2+ "." +r+ ".");
		}
	
		// WCZORAJ BYŁ
		
		if(((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))&&(d>1)&&(d<=31)) {
		int d1;
		d1=d-1;
		System.out.println("Wczoraj był " +d1+ "." +m+ "." +r+ ".");
		}
		
		if(((m==5)||(m==7)||(m==10)||(m==12))&&(d==1)) {
		int d1; int m1;
		d1=d+29; m1=m-1;
		System.out.println("Wczoraj był " +d1+ "." +m1+ "." +r+ ".");
			}
		
		if(((m==3))&&(d==1) && ((r%4==0) && (r%100!=0) || (r%400==0))) {
			int d2; int m2;
			d2=d+28; m2=m-1;
			System.out.println("Wczoraj był " +d2+ "." +m2+ "." +r+ ".");
			}
		
		if(((m==3))&&(d==1) && (r%4!=0)) {
			int d3; int m3;
			d3=d+27; m3=m-1;
			System.out.println("Wczoraj był " +d3+ "." +m3+ "." +r+ ".");
			}
		
		if((m==2)&&(d>1) && (d<=29)) {
			int d1; 
			d1=d-1; 
			System.out.println("Wczoraj był " +d1+ "." +m+ "." +r+ ".");
			}
		
		if((m==2)||(m==8)&&(d==1)) {
			int d2; int m2;
			d2=d+30; m2=m-1;
			System.out.println("Wczoraj był " +d2+ "." +m2+ "." +r+ ".");
			}
		
		if((m==1)&&(d==1)) {
			int d4; int m4; int r4;
			d4=d+30; m4=m+11; r4=r-1;
			System.out.println("Wczoraj był " +d4+ "." +m4+ "." +r4+ ".");
			}
} // drugi nawias 
}// glowny nawias