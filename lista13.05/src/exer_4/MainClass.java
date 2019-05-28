package exer_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		List<Object> formas = new ArrayList<>();
		//List<Retangulo> retangulos = new ArrayList<>();
		//List<Circulo> circulos = new ArrayList<>();
		
		System.out.println("Digite a quantidade de formas: ");
		int qtdFormas = teclado.nextInt();
		
		for(int i = 0; i < qtdFormas; i++) {
			
			System.out.printf("Qual é a %d° forma?\n", i + 1);
			System.out.println("1 - QUADRADO");
			System.out.println("2 - RETANGULO");
			System.out.println("3 - CIRCULO");
			
			int forma = teclado.nextInt();
			
			switch(forma) {
			
			case 1:
				
				System.out.println("Digite o lado do quadrado:");
				double lado = teclado.nextDouble();
				
				formas.add(new Quadrado(lado));
				
				break;
		
			
			case 2:
				
				System.out.println("Digite a base do retangulo:");
				double base = teclado.nextDouble();
				System.out.println("Digite a altura do retangulo: ");
				double altura = teclado.nextDouble();
				
				formas.add(new Retangulo(base, altura));
				
				break;
			
				
			case 3:
				
				System.out.println("Digite o raio do circulo:");
				double raio = teclado.nextDouble();
				
				formas.add(new Circulo(raio));
				
				break;
				
			
			default:
				
				System.out.println("Número inválido");
				i--;
				break;
				
			}
			
		}
		
		teclado.close();
		
		int j = 0;
		for(Object objeto: formas) {
			
			j++;
			System.out.println(j);
			if(objeto instanceof Quadrado) {
				
				Quadrado aux = (Quadrado) objeto;
				System.out.printf("O %d° objeto é um quadrado de lado %.2f\n", j, aux.lado1);
				System.out.printf("Seu perimetro: %.2f\n", aux.calculaPerimetro());
				System.out.printf("Sua área: %.2f\n", aux.calculaArea());
				
			}
			
			if(objeto instanceof Retangulo) {
				
				Retangulo aux = (Retangulo) objeto;
				System.out.printf("\nO %d objeto é um Retangulo\n", j);
				System.out.printf("Sua base: %.2f e sua altura: %.2f\n", aux.lado1, aux.lado2);
				System.out.printf("Seu perimetro: %.2f\n", aux.calculaPerimetro());
				System.out.printf("Sua área: %.2f\n", aux.calculaArea());
				
			}
			
			if(objeto instanceof Circulo) {
				
				Circulo aux = (Circulo) objeto;
				System.out.printf("\nO %d objeto é um Circulo de raio %.2f\n", j, aux.raio);
				System.out.printf("Seu perimetro: %.2f\n", aux.calculaPerimetro());
				System.out.printf("Sua área: %.2f\n", aux.calculaArea());
				
			}
			
			
		}
		
		
	}
}
