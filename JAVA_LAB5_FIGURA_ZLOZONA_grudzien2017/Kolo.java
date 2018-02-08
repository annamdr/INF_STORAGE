package wstep;

public class Kolo extends Figura {
double r;
	
	Kolo(double r) {
		super();
		this.r=r;
		
	}
	
	double pole() {
		return Math.PI*r*r;
	}
}
