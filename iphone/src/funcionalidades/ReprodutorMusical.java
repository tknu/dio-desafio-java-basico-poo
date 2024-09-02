package funcionalidades;

// Interface que define as funcionalidades de um reprodutor musical
public interface ReprodutorMusical {

    // Inicia a reprodução da música selecionada
    public void tocar();

    // Pausa a reprodução da música
    public void pausar();

    // Seleciona uma música para reprodução
    public void selecionarMusica(String musica);
}
