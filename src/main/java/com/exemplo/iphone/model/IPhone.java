package main.java.com.exemplo.iphone.model;

import main.java.com.exemplo.iphone.interfaces.AparelhoTelefonico;
import main.java.com.exemplo.iphone.interfaces.ReprodutorMusical;
import main.java.com.exemplo.iphone.interfaces.NavegadorInternet;

public class IPhone extends Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public IPhone(String modelo, int armazenamento) {
        super(modelo, armazenamento);
    }

    // Implementações de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementações de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    // Implementações de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
