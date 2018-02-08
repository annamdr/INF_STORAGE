/*
LISTA NR 2
13.01.2018
Zad.8
*/


public class Main {

	public static int nwd(int a,int b) {
		int c;				  
		while(a!=b)                
		{ 
			if(a>b)
			{
				a=a-b;
			}else{
				b=b-a;
			};                    
		}//while

		return a;                          
	}//nwd

	public static void main(String[] args) {
		System.out.println(nwd(20,30));
	} //main
}