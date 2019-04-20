import java.util.Scanner;

class aula5{

    public static void main(String[] args){

        int TAMANHO = 3;

        Pessoas[] pessoas = new Pessoas[TAMANHO];

        int h;
        for(h = 0; h < TAMANHO; h++) pessoas[h] = new Pessoas();


        int i;
        for(i = 0; i < TAMANHO; i++){

            System.out.println(i+1);
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite um nome: ");
            pessoas[i].setNome(teclado.nextLine());

            System.out.println("Digite uma idade: ");
            pessoas[i].setIdade(teclado.nextInt()); 
            teclado.nextLine();

            System.out.println();

        }
        
        int l;
        for(l = 0; l < TAMANHO; l++) pessoas[l].printPessoas();
        System.out.println();

        int j;

        System.out.println("Ordem alfabética: ");
        pessoas = ordenaNomes.alfabetica(pessoas, TAMANHO);
        for(j = 0; j < TAMANHO; j++) pessoas[j].printPessoas();

        System.out.println();

        pessoas = ordenaNomes.crescente(pessoas, TAMANHO);
        System.out.println("Ordem crescente de idade: ");
        for(j = 0; j < TAMANHO; j++) pessoas[j].printPessoas();

    }


}