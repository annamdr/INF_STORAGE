
/*
LISTA NR 2
13.01.2018
Zad.7
*/


public class Main {

	public static int nwd(int a,int b) {
		int c;                  
		while(b!=0)               
		{ 
			c=a%b;                
			a=b;             
			b=c;             
		}
		return a;                    	        
	}//nwd

	public static void main(String[] args) {
		System.out.println(nwd(45,60));
	}
}