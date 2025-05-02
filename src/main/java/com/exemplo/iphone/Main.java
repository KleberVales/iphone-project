package main.java.com.exemplo.iphone;

import main.java.com.exemplo.iphone.model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone 15", 256);

        // Testando Reprodutor Musical
        System.out.println("=== Reprodutor Musical ===");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");

        // Testando Aparelho Telefônico
        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        System.out.println("\n=== Navegador Internet ===");
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Funcionalidades do Dispositivo
        System.out.println("\n=== Dispositivo ===");
        System.out.println("Modelo: " + meuIphone.getModelo());
        System.out.println("Armazenamento: " + meuIphone.getArmazenamento() + "GB");
        meuIphone.ligar();
        meuIphone.desligar();
    }
}
