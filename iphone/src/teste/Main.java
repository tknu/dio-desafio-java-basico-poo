package teste;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import modelo.iPhone;

public class Main {
    public static void main(String[] args) {
        // Criando um iPhone com implementações básicas
        ReprodutorMusical repMusica = new ReprodutorMusical() {

            @Override
            public void tocar() {
                System.out.println("Tocar Música");
            }

            @Override
            public void pausar() {
                System.out.println("Música Pausada");
            }

            @Override
            public void selecionarMusica(String musica) {
                System.out.println("Selecionando música: " + musica);
            }
            
        };

        AparelhoTelefonico aparelhoTel = new AparelhoTelefonico() {

            @Override
            public void ligar(String numero) {
                System.out.println("Ligando para: " + numero);
            }

            @Override
            public void atender() {
                System.out.println("Atendendo chamda...");
            }

            @Override
            public void iniciarCorreioVoz() {
                System.out.println("Iniciando Correio de Voz...");
            }
            
        };

        NavegadorInternet navegador = new NavegadorInternet() {

            @Override
            public void exibirPagina(String url) {
                System.out.println("Exibindo página: " + url);
            }

            @Override
            public void adicionarNovaAba() {
                System.out.println("Adicionando Nova Aba...");
            }

            @Override
            public void atualizarPagina() {
               System.out.println("Atualizando página...");
            }
            
        };

        iPhone iphone14 = new iPhone("iPhone 14", "1234567890", repMusica, aparelhoTel, navegador);

        // Testando as funcionalidades do iPhone
        iphone14.ligar();
        iphone14.ligar("(16)99666-6666");
        iphone14.enviarMensagem("(16) 99666-6666", "Hello World");
        iphone14.selecionarMusica("Black - Pearl Jam");
        iphone14.exibirPagina("www.dio.me");
        iphone14.desligar();

    }
}
