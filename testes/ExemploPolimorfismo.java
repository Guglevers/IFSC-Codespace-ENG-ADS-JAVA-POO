class Animal { // aqui é criado a classe animal
    private String nome; // aqui definimos um atributo privado, eventualmente sera criado um setter, para
                         // garatir os principios do encapsulamento

    public Animal(String nome) { // método publico para definir o atributo nome da classe animal, garantindo que
                                 // estamos seguindo os principios do encapsulamento
        this.nome = nome;
    }

    public String getNome() { // getter, mais uma convenção que segue o encapsulamento
        return nome;
    }

    void emitirSom() {
        System.out.println(this.getNome() + " faz um som genérico.");
    }
}

class Cachorro extends Animal { // aqui temos um exemplo de herança onde cachorro herda os atributos e metodos
                                // de animal, de modo que possamos criar a partir de animal um cachorro

    public Cachorro(String nome) {
        super(nome); // aqui cachorro chama o construtor de nome da superclasse para iniciar
                     // corretamente o nome de dog um exemplo claro de herança
    }

    @Override // aqui temos um exemplo de polimorfismo, onde o metodo emitir som é
              // sobreescrito na classe cachorro
    void emitirSom() {
        System.out.println(this.getNome() + " late.");
    }
}

class Gato extends Animal { // tal qual o cachorro criamos o gato
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(this.getNome() + " mia.");
    }
}

public class ExemploPolimorfismo { // execução do código
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Nala"); // criamos um cachorro chamdo nala, passando o argumento a ele
        cachorro.emitirSom(); // aqui chamamos o método fazer som, que foi sobrescrito para classe cachorro
                              // fazendo assim um latido

        Gato gato = new Gato("Tom");
        gato.emitirSom(); // aqui chamamos o método fazer som, que foi sobrescrito para classe gato
                          // fazendo assim um miado

        Animal animal1 = new Cachorro("Marie");
        animal1.emitirSom();// fara um som generico, pois é um animal generico, e não uma das sbclasses de
                            // animal

        Animal animal2 = new Gato("Mimi");
        animal2.emitirSom();
    }
}
// neste código temos exemplos claros de herança quando criamo sibclasses a
// partir de animal, e quando usamos super(...)
// para passar argumentos do contrutor da subclasse para o construtor da
// superclasse
// temos exemplo de polimorfismo com o override, que sobreescreve metodos
// temos exemplos de encapsulamento com atribuos privados, setters e getters