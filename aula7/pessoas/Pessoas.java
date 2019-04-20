class Pessoas{

    String nome;
    int idade;


    public void printPessoas(){

        System.out.println(nome);
        System.out.println(idade);

    }

    public void setNome(String input){
        this.nome = input;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int input){
        this.idade = input;
    }

    public int getIdade(){
        return idade;
    }

}