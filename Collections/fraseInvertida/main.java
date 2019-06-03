package fraseInvertida;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase para ser invertida: ");
		String frase = input.nextLine(); 
		String palavras[] = frase.split(" ");
		
		int i;
		for(i = palavras.length - 1; i >= 0; i--) {
			
			lista.add(palavras[i]);
			
		}
		
		for(String palavra : lista) System.out.println(palavra);
		
		input.close();
		
	}

}
