package wstep;

public class FiguraZlozona extends Figura {
	
	Figura[] fz;
	public FiguraZlozona(Figura[] f) {
		super();
		fz=f;
	}
	
	double pole() {
		double suma=0;
		for (int i=0; i<fz.length; i++) {
			suma += fz[i].pole();
		}
		return suma;
	}
}
