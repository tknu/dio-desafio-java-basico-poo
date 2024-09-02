package modelo;

import dispositivo.Dispositivo;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

import java.io.Serializable;

// Classe que representa um iphone
public class iPhone extends Dispositivo implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String modelo;
    private String numeroSerie;

    private ReprodutorMusical repMusical;
    private AparelhoTelefonico aparelhoTel;
    private NavegadorInternet navegador;

    //Construtor da Classe iPhone
    public iPhone(String modelo, String numeroSerie, ReprodutorMusical repMusical,
                  AparelhoTelefonico aparelhoTel, NavegadorInternet navegador) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.repMusical = repMusical;
        this.aparelhoTel = aparelhoTel;
        this.navegador = navegador;
    }

    // Implementação dos métodos das interfaces
    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
