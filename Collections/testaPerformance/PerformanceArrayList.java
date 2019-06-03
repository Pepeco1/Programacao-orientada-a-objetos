package testaPerformance;

import java.util.ArrayList;
import java.util.Collection;

public class PerformanceArrayList {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		
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
