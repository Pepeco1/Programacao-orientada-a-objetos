
public class Quadrado extends Quadrilateros implements FormaGeometrica {

	public Quadrado(double lado) {
		
		super(lado, lado);
		
	}

	@Override
	public double calculaArea() {
		
		double area = super.lado1 * super.lado2;
		
		return area;
		
	}

}
