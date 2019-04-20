import java.lang.Math;
import java.util.Scanner;

public class algoritmoGenetico {
    

    public static void main(String[] args){

        // variavel de input
        Scanner input = new Scanner(System.in);
        
        // escreve na tela e pega o input
        System.out.println("Digite a primeira sequencia de genes: ");
        String S1 = input.nextLine();
        
        //escreve na tela e pega o input
        System.out.println("Digite a segunda sequencia de genes: ");
        String S2 = input.nextLine();
        
        if(S1.length() == S2.length()){

            recombinacao(S1, S2);

        }
        else  System.out.println("As sequencias de genes devem ser do mesmo tamanho!");
  

    }  
    
    
    // funcao com 4 param de entrada. Os dois primeiros são strings de entrada,
    // e os próximos são o resultado da recombinacao das anteriores
    public static void  recombinacao(String str1, String str2){
        
        int randInt;
        do{
        // obtendo um numero pseudoaleatorio entre 0 e o tamanho da string - 1
        randInt = (int) Math.floor( str1.length() * Math.random());
        }
        // o loop se repete até que randInt seja diferente de 0
        while(randInt == 0);
        
        // criei quatro variaveis auxiliares para guardar as substrings
        // aux1 recebe o inicio de str1 ate o local de corte
        // aux2 recebe o resto de str1
        String aux1 = str1.substring(0, randInt);
        String aux2 = str1.substring(randInt, str1.length());
                
        // aux3 recebe o inicio de str2 ate o local de corte
        // aux4 recebe o resto de str2
        String aux3 = str2.substring(0, randInt);
        String aux4 = str2.substring(randInt, str2.length());
        
        // str3 recebeu o inicio de str1 com o fim de str2
        // str4 recebeu inicio de str2 e o fim de str1
        String str3 = aux1.concat(aux4);
        String str4 = aux3.concat(aux2);
        
        // chama a funcao de mutacao sobre str4
        str4 = mutacao(str4);
        
        // escreve os genes de cada sujeito
        
        System.out.print("Sujeito 1: ");
        System.out.println(str1);
        
        System.out.print("Sujeito 2: ");
        System.out.println(str2);
        
        System.out.print("Sujeito 3: ");
        System.out.println(str3);
        
        
        System.out.print("Sujeito 4: ");
        System.out.println(str4);
        
    }


    public static String mutacao(String str1){
    
        // cria um inteiro pseudoaleatorio que varia entre 0 até o tamanho da string -1
        int randPos = (int) Math.floor(str1.length() * Math.random());
        
        // transforma a string em um array de caractestes
        char[] charArray = str1.toCharArray();
        
        // guarda o caractere atual da posicao
        char novoGene = charArray[randPos];
        
        // cria um array com os novos genes
        char[] genesArray = new char[4];
        genesArray[0] = 'A';
        genesArray[1] = 'G';
        genesArray[2] = 'T';
        genesArray[3] = 'C';
        
        int randInt;
        do{
            
        // cria um inteiro pseudoaleatorio que varia de 0 até 3 para escolher um novo gene            
        randInt = (int) Math.floor(4 * Math.random());
        
        }
        // repete o loop ate que o gene correspondente no array seja diferente do gene atual
        while(novoGene == genesArray[randInt]);
        
        // entao quando for diferente, a variavel recebe o novo gene
        novoGene = genesArray[randInt];
        
        // muda o caractere no array para o novo caractere
        charArray[randPos] = novoGene;
        
        // cria uma nova string com o array de caracteres atual
        String newString = new String(charArray);

        return newString;
        
    }
}
