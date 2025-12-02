package View;

import Service.GerarNumeroAleatorioService;

import java.util.Scanner;

public class MenuPrincipalView {
    Scanner input = new Scanner(System.in);
    GerarNumeroAleatorioService gerarNumeroAleatorioService = new GerarNumeroAleatorioService();

    public void inicioDoJogo() {
        System.out.println("________________________________________");
        System.out.println("|----- Jogo de Adivinhar o Numero -----|");
        System.out.println("|                                      |");
        System.out.println("|Você terá 15 tentativas para acertar! |");
        System.out.println("|______________________________________|");


        for (int i = 0 ; i < 15 ; i++) {
        System.out.println("\n\nDigite um valor de 1 á 100: ");
        int numeroEscolhido = input.nextInt();
        gerarNumeroAleatorioService.verificadorDaTentativa(numeroEscolhido);

        if (numeroEscolhido == gerarNumeroAleatorioService.valorGerado) {
            break;
        }

        if (i >= 15) {
            System.out.println("\nVocê não conseguiu acertar o numero em 15 tentativas!");
        }
    }
        }
}
