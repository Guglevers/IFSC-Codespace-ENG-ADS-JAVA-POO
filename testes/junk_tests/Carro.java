package junk_tests;

public class Carro {
    // Atributos do carro
    String marca;
    String modelo;
    int velocidade;

    // Método que retorna a velocidade atual do carro
    public int obterVelocidade() {
        return velocidade;
    }

    // Método para mostrar os detalhes do carro
    public void mostrarDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Velocidade: " + obterVelocidade() + " km/h");
    }

    // Método para aumentar a velocidade
    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("A velocidade do " + marca + " " + modelo + " aumentou para " + obterVelocidade() + " km/h");
    }

    // Método para diminuir a velocidade
    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0; // A velocidade não pode ser negativa
        }
        System.out.println("A velocidade do " + marca + " " + modelo + " diminuiu para " + obterVelocidade() + " km/h");
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Mustang";
        meuCarro.velocidade = 50; // Velocidade inicial

        // Mostrando os detalhes iniciais do carro
        meuCarro.mostrarDetalhes();

        // Aumentando a velocidade
        meuCarro.acelerar(30); // Aumenta em 30 km/h
        meuCarro.acelerar(20); // Aumenta em mais 20 km/h

        // Diminuindo a velocidade
        meuCarro.frear(60); // Diminui em 60 km/h
        meuCarro.frear(20); // Diminui em mais 20 km/h

        // Mostrando os detalhes finais do carro
        meuCarro.mostrarDetalhes();
    }
}


