
class ordenaNomes{

    public static Pessoas[] alfabetica(Pessoas[] vet, int TAMANHO){

        /*Pessoas[] organizado = new Pessoas[TAMANHO];

        int h;
        for(h = 0; h < TAMANHO; h++) organizado[h] = new Pessoas();*/

        int i;
        for(i = 0; i < TAMANHO; i++){

            int menor = i;

            int j;
            for(j = i; j < TAMANHO; j++){

                int compara = vet[menor].getNome().compareTo(vet[j].getNome());
                if(compara > 0) menor = j;

            }

            Pessoas aux = vet[menor];
            vet[menor] = vet[i];
            vet[i] = aux;

        }

        return vet;

    }

    
    public static Pessoas[] crescente(Pessoas[] vet, int TAMANHO){

        int i;
        for(i = 0; i < TAMANHO; i++){

            int menor = i;

            int j;
            for(j = i; j < TAMANHO; j++){

                if(vet[menor].idade > vet[j].idade) menor = j;

            }
 
            Pessoas aux = vet[menor];
            vet[menor] = vet[i];
            vet[i] = aux;

        }

        return vet;
    }



}