import java.util.Scanner;

public class Calculadora{

    static double valorMemoria = 0;

    static public void menu(){

        System.out.println("\n");

        System.out.println("Estado da memória: " + valorMemoria + "\n");
        
        System.out.println("Opções:\n"
        +"(1) Somar\n"
        +"(2) Subtrair\n"
        +"(3) Multiplicar\n"
        +"(4) Dividir\n"
        +"(5) Limpar memoria\n"
        +"(6) Sair do programa\n"
        +"Qual opção você deseja?\n");

        Scanner input = new Scanner(System.in);
        int seletor = input.nextInt();
        input.nextLine();
        
        switch(seletor){

            case 1:
            soma();
            break;

            case 2:
            subtrai();
            break;

            case 3:
            multiplica();
            break;

            case 4:
            divide();
            break;

            case 5:
            limpa();
            break;

            case 6:
            System.out.println("Você optou por sair!");
            break;
        }   
    
    }


    static public void soma(){

        System.out.println("Digite o valor que você quer somar com o estado atual: ");

        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        input.nextLine();

        valorMemoria += valor;

        menu();

    }

    static public void subtrai(){

        System.out.println("Digite o valor que você quer subtrair do estado atual: ");

        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        input.nextLine();

        valorMemoria -= valor;

        menu();

    }

    static public void multiplica(){

        System.out.println("Digite o valor que você quer multiplicar com o estado atual: ");

        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        input.nextLine();

        valorMemoria *= valor;

        menu();

    }

    static public void divide(){

        System.out.println("Digite o número que você quer dividir do estado atual: ");

        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        input.nextLine();

        valorMemoria /= valor;

        menu();

    }

    static public void limpa(){

        System.out.println("Memória limpa!");
        
        valorMemoria = 0;

        menu();

    }

}