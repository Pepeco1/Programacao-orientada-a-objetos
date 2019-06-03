package ocorrenciasPalavras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mainMenu {

	public static void main(String[] args) {

		HashMap<String, Integer> lista = new HashMap<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase para checar ocorrencias: ");
		String frase = input.nextLine(); 
		String palavras[] = frase.split(" ");
		
		for(int i = 0; i < palavras.length; i++) {
			
			int repeticoes = lista.getOrDefault(palavras[i], 0);
			lista.put(palavras[i], repeticoes + 1);
			
		}
		
		Set<String> resp = new HashSet<>();
		resp = lista.keySet();
		
		for(String palavra : resp) {
			
			System.out.println(palavra + " " + lista.get(palavra));
			
		}
		
	}

}
