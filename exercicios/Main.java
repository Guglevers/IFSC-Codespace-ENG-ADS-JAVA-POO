/*aqui é criado o objeto pessoa, basicamente um objeto que possui dois atributos
 * nome que é uma string e idade que é um inteiro,
 * ambos os atributos estão privados, assim mantando o o encapsulamento do objeto,
 * para alterar o valor desses atributos voce preceisa utilisar metodos do objeto
 * os setters, isso ajuda a garantir que os dados são transmitidos corretamente para o objeto
 * por exemplo neste código temos no setter de idade, um bloco de código que impede a idade de ser
 * negativa.
 */

class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}

/*
 * Aqui no metodo principal do programa temos o uso dos metodos do objeto,
 * definindo idade nome para nova pessoa, e depois usamos o get para printalos
 * no terminal
 */

// Programa principal
class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
