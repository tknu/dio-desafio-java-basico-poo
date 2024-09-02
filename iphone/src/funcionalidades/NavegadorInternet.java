package funcionalidades;

// Interface que define as funcionalidades de um navegador de intenet
public interface NavegadorInternet {

    // Exibir uma página na internet
    public void exibirPagina(String url);

    // Adiciona uma nova aba no navegador
    public void adicionarNovaAba();

    // Atualiza uma pagina atual do navegador
    public void atualizarPagina();
}
