package View;

/**
 * Menu principal aonde tudo vai centralizar.
 * @author Daniel Müller.
 * @version 1.0.
 * */
import Service.GerarNumeroAleatorioService;
import java.util.Scanner;

public class MenuPrincipalView {
    Scanner input = new Scanner(System.in);
    GerarNumeroAleatorioService gerarNumeroAleatorioService = new GerarNumeroAleatorioService();

    /**
     * Metodo para iniciar o jogo
     * */
    public void inicioDoJogo() {
        System.out.println("________________________________________");
        System.out.println("|----- Jogo de Adivinhar o Numero -----|");
        System.out.println("|                                      |");
        System.out.println("|Você terá 15 tentativas para acertar! |");
        System.out.println("|______________________________________|");

        /**
         * Fazendo um loop usando o FOR aonde ele vai criar a variavel i do tipo int e vai fazer o loop 15 vezes que é a quantidade de tentativas do jogador.
         * */
        for (int i = 0 ; i < 15 ; i++) {
            System.out.println("\n\nDigite um valor de 1 á 100: ");
            int numeroEscolhido = input.nextInt();
            gerarNumeroAleatorioService.verificadorDaTentativa(numeroEscolhido);

            /**
             * * Vai verificar caso o jogador tenha ganhado o jogo e vai parar o jogo.
             * */
            if (numeroEscolhido == gerarNumeroAleatorioService.valorGerado) {
                break;
            }
        }

        /**
         * Vai verificar se o jogador.
         * */
        System.out.println("\nVocê não conseguiu acertar o numero em 15 tentativas!");

    }
        }