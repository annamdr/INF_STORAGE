package wstep;

public class Trojkat extends Figura {
	
	double a; double h;
	
	Trojkat(double a, double h){
		super();
		this.a=a; this.h=h;
	}
	double pole() {
		return 0.5*(a*h);
	}
}
