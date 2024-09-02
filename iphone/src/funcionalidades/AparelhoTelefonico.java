package funcionalidades;

// Interface que define as funcionalidades de um aparelho telefonico
public interface AparelhoTelefonico {

    // Efetua uma ligação para um numero de telefone
    public void ligar(String numero);

    // Atende uma chamada telefonica
    public void atender();

    // Inicia o correio de voz
    public void iniciarCorreioVoz();
}
