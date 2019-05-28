
public abstract class Quadrilateros implements FormaGeometrica {

	double lado1;
	double lado2;
	
	public Quadrilateros(double base, double altura) {
		
		this.lado1 = base;
		this.lado2 = altura;
		
	}
	
	@Override
	public double calculaPerimetro() {
		
		double perimetro = this.lado1 *2 + this.lado2 * 2;
		
		return perimetro;
		
	}
	
}
