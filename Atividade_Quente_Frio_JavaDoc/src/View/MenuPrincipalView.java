package View;

import Service.GerarNumeroAleatorioService;

public class MenuPrincipalView {

    GerarNumeroAleatorioService gerarNumeroAleatorioService = new GerarNumeroAleatorioService();

    public void inicioDoJogo() {
        System.out.println("________________________________________");
        System.out.println("|----- Jogo de Adivinhar o Numero -----|");
        System.out.println("|______________________________________|");


        System.out.println("\n\nDigite um valor de 1 á 100: ");
        gerarNumeroAleatorioService.verificadorDaTentativa();
    }
}
