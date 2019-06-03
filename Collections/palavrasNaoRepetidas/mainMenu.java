package palavrasNaoRepetidas;


import java.util.HashSet;
import java.util.Scanner;

public class mainMenu {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Digite uma frase:");
		
		String frase = input.nextLine(); 
		String palavras[] = frase.split(" ");
		
		for(int i = 0; i < palavras.length; i++) {
			
			set.add(palavras[i]);
			
		}
		
		System.out.println(set.size());
		
		input.close();

	}

}
