package exer_4;
import java.lang.Math;

public class Circulo implements FormaGeometrica {

	double raio;
	
	public Circulo(double raio) {
		
		this.raio = raio;
		
	}

	@Override
	public double calculaPerimetro() {
		
		double perimetro =  2 * Math.PI * this.raio;
		
		return perimetro;
		
	}

	@Override
	public double calculaArea() {
		
		double area = Math.PI * Math.pow(this.raio, 2.0);
		
		return area;
		
	}

}
