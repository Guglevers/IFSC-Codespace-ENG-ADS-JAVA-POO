package junk_tests;

public class E1_6Teste {
    public static void main(String[] args) {
        double raio = 5.0;
        double base = 2.0;
        double expoente = 3.0;
        int i = -10;  // Variável inteira para usar com Math.abs()
        double d = 4.5;  // Variável double para usar com Math.pow()

        // Calcula e exibe a área de um círculo
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + areaCirculo);

        // Limitando o número de casas decimais
        System.out.printf("Área do círculo com precisão: %.5f\n", areaCirculo);

        // Alguns métodos da classe Math
        System.out.println("Base elevada ao expoente: " + Math.pow(base, expoente));
        System.out.println("Seno de 45 graus: " + Math.sin(Math.toRadians(45)));
        System.out.println("Raiz quadrada de 2: " + Math.sqrt(2));
        System.out.println("Logaritmo natural (ln) de 10: " + Math.log(10));
        System.out.println("Logaritmo de base 10 de 100: " + Math.log10(100));
        System.out.println("Arredondamento para cima de 3.1: " + Math.ceil(3.1));
        System.out.println("Arredondamento para baixo de 3.9: " + Math.floor(3.9));
        System.out.println("Valor absoluto de " + i + ": " + Math.abs(i));
        System.out.println("Exponenciação de " + d + " ao quadrado: " + Math.pow(d, 2));

        // Ex: Arredondamento
        double numero = 7.85;
        System.out.println("Arredondamento de 7.85: " + Math.round(numero));

        // Ex: de máximo e mínimo
        System.out.println("Máximo entre 10 e 20: " + Math.max(10, 20));
        System.out.println("Mínimo entre 10 e 20: " + Math.min(10, 20));

        // Ex: de número aleatório
        System.out.println("Número aleatório entre 0.0 e 1.0: " + Math.random());

        // Métodos interessantes da classe Math
        double hypotenuse = Math.hypot(3, 4); // Calcula a hipotenusa de um triângulo retângulo
        System.out.println("Hipotenusa: " + hypotenuse);

        // Cálculo de tangente e cotangente
        double angleDegrees = 45;
        double tangente = Math.tan(Math.toRadians(angleDegrees));
        double cotangente = 1 / tangente; // Cotangente é o inverso da tangente
        System.out.println("Tangente de " + angleDegrees + " graus: " + tangente);
        System.out.println("Cotangente de " + angleDegrees + " graus: " + cotangente);

        // Cálculo de seno hiperbólico
        double sinhValue = Math.sinh(1); // Seno hiperbólico de 1
        System.out.println("Seno hiperbólico de 1: " + sinhValue);

        // Cálculo de cosseno hiperbólico
        double coshValue = Math.cosh(1); // Cosseno hiperbólico de 1
        System.out.println("Cosseno hiperbólico de 1: " + coshValue);
    }
}