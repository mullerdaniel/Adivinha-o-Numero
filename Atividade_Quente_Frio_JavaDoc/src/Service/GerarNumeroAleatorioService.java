package Service;

/**
 * Gerar um valor aleatorio e verificar a tentativa.
 * @author Daniel Müller.
 * @version 1.0.
 * */
import java.util.Random;

public class GerarNumeroAleatorioService {
    Random random = new Random();

    /**
     * Variavel valorGerado publica do tipo int que vai receber random.
     * Variavel tentativas do tipo int para contar a tentativas do jogador.
     * */
    public int valorGerado = random.nextInt(100);
    int tentativas;

    /**
     * Metodo para verificar a tentativa do jogador aonde vai analisar se o valor escolhi é igual o valor Gerado ou se é maior ou menor.
     * @param numeroEscolhido vai puxar a variavel numeroEscolhido do tipo int. Aonde vai ser usado para fazer as verificações.
     * */
    public void verificadorDaTentativa(int numeroEscolhido) {
        tentativas++;

        /**
         * Vai verificar se o numero escolhido é igual ao numero gerado = VITORIA.
         * */
        if(numeroEscolhido == valorGerado) {
            System.out.println("\nPARABÉNS VOCÊ GANHOU!!!");
            System.out.println("\nQuantidade de tentativas: "+ tentativas);

            /**
             * Vai verificar se o numero escolhido é maior que o numero gerado = Chute um valor menor.
             * */
        }else if(numeroEscolhido > valorGerado) {
            System.out.println("\nChute um valor menor!");

            /**
             * Vai verificar se o numero escolhido é menor que numero gerado = Chute um valor maior.
             * */
        }else if(numeroEscolhido < valorGerado) {
            System.out.println("\nChute um valor maior!");

            /**
             * Vai verificar se o numero escolhido é menor que - ou o numero escolhido é maior que 100 = ERRO.
             * */
        }else if (numeroEscolhido < 0 || numeroEscolhido > 100){
            System.out.println("\nVocê digitou um valor menor que 0 ou maior que 100!");
        }

    }
}
