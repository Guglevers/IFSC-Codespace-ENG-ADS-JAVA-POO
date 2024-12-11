class Animal {
    String nome;

    void setNome(String nome) {
        nome = this.nome;
    }

    void fazer_som() {
        System.out.println(this.nome + ":som generico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazer_som() {
        System.out.println(this.nome + ":AU!AU!AU!AU!AU!AUU!AU!");
    }
}

class Oop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "doge";

        cachorro.fazer_som();
    }
}