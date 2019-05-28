package exer_7;

public class pepecoUtils{

	static public double toCelsius(double F) throws FahrenheitException{
		
		if(F < -459.67) {
			
			throw new FahrenheitException();
			
		}
		
		double C = (5*(F-32))/9;
		
		return C;
		
	}

}
