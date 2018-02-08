/*LISTA NR 2
13.01.2018
Zad.10a
*/

import static java.lang.Math.*;
public class Main {
	        
public static void main(String[] args) {
	double a=1;
	double f=a;
	int k=0;
	double x=3;
	double epsilon=0.1;
		do{
			k++;
			a*=(x/k);
			f+=a;	
		}while(a>epsilon);
	System.out.println("e^("+x+")="+f);
} //main
}