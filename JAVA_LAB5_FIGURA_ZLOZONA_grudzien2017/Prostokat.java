package wstep;

public class Prostokat extends Figura {
	
	double a, b;
	
	Prostokat(double a, double b) {
		super();
		this.a=a; this.b=b;
		
	}
	
	double pole() {
		return a*b;
	}
	
}
