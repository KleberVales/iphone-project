package main.java.com.exemplo.iphone.model;

public abstract class Dispositivo {
    private String modelo;
    private int armazenamento;

    public Dispositivo(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("Dispositivo ligado");
    }

    public void desligar() {
        System.out.println("Dispositivo desligado");
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
}
