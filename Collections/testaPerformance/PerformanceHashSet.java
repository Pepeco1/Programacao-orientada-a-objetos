package testaPerformance;


import java.util.Collection;
import java.util.HashSet;

public class PerformanceHashSet {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		for (int i = 0; i < total; i++)  teste.add(i); 
		long tempoAdicionando = System.currentTimeMillis() - inicio;
		
		for (int i = 0; i < total; i++)  teste.contains(i); 
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		long tempoBuscando = tempo - tempoAdicionando;
		
		System.out.println("Tempo gasto total: " + tempo);
		System.out.println("Tempo gasto adicionando: " + tempoAdicionando);
		System.out.println("Tempo gasto buscando: " + tempoBuscando);


		

	}

}
