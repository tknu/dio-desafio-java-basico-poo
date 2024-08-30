```mermaid
classDiagram
    class Dispositivo {
        + ligar()
        + desligar()
    }

    class iPhone {
        - String modelo
        - String numeroSerie

        + fazerChamada(String numero)
        + enviarMensagem(String numero, String mensagem)
        + conectarWifi(String nomeRede, String senha)
    }

    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    Dispositivo <|-- iPhone
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
