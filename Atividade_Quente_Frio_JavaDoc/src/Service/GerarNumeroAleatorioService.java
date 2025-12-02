package Service;

import java.util.Random;

public class GerarNumeroAleatorioService {
    Random random = new Random();

    public int valorGerado = random. nextInt(100);
    int tentativas;

    public void verificadorDaTentativa(int numeroEscolhido) {
        tentativas++;

        if(numeroEscolhido == valorGerado) {
            System.out.println("\nPARABÉNS VOCÊ GANHOU!!!");
            System.out.println("\nQuantidade de tentativas: "+ tentativas);

        }else if(numeroEscolhido > valorGerado) {
            System.out.println("\nChute um valor menor!");

        }else if(numeroEscolhido < valorGerado) {
            System.out.println("\nChute um valor maior!");

        }else if (numeroEscolhido < 0 || numeroEscolhido > 100){
            System.out.println("\nVocê digitou um valor menor que 0 ou maior que 100!");
        }

    }
}
