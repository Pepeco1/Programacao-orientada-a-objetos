/**
 * 
 */
package exer_7;

import java.util.Scanner;

public class MainClass {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Fahrenheit");
		double F = teclado.nextDouble();
		
		try {
			
			double C = pepecoUtils.toCelsius(F);
			System.out.println(C);
			
		}
		
		catch(TemperatureException e) {
			
			System.out.println("Erro1");
			
		}
		
		/*catch(FahrenheitException e) {
			
			System.out.println("Erro2");
			
		}*/
		
		finally{
			
			teclado.close();
			
		}
		
		

	}

}
