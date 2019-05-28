
public class Retangulo extends Quadrilateros implements FormaGeometrica {

	
	public Retangulo(double base, double altura) {
		
		super(base, altura);
		
	}

	@Override
	public double calculaArea() {
		
		double area = super.lado1 * super.lado2;
		
		return area;
		
	}

}
