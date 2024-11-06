//Este Código possui a classe Menu, que da nome a ele e serve para guardar a funcionalidade principal do programa
//Eu apesar de não ter criado nenhuma classe especial, ou objeto especifico, utilizei o Scanner que é uma classe que eu usei para criar o "inp" meu objeto ela serve para eu ler inputs do usuario,
//Eu criei o metodo principal do projte "main" é nele que meu código roda, além disso eu usei metodos, como .nextInt(); que é um metodo para objetos da classe Scanner, 
//Usei também metodos wrapper para transformar as strings em int em então em binarios ou octais

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.println("\nIniciando Menu...\n\nMenu iniciado");
            System.out.println(
                    "1 - Conversor de Números\n2 - Verificador de Caracteres\n3 - Retornar ao menu principal\n0 - Sair");
            System.out.print("O que você quer fazer?: ");

            int userInput;
            while (true) {
                try {
                    userInput = Integer.parseInt(inp.nextLine());
                    break; // Exit the loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Por favor, digite um número: ");
                }
            }

            switch (userInput) {
                case 0:
                    System.out.println("Encerrando programa...");
                    programIsRunning = false;
                    break;
                case 1:
                    System.out.println("Conversor de Números");
                    System.out.print("Digite um número inteiro: ");
                    int decimalNumber = inp.nextInt();
                    inp.nextLine(); // Clear the newline character

                    String binaryNumber = Integer.toBinaryString(decimalNumber);
                    String octalNumber = Integer.toOctalString(decimalNumber);
                    String hexNumber = Integer.toHexString(decimalNumber);

                    System.out.println("Decimal: " + decimalNumber);
                    System.out.println("Binário: " + binaryNumber);
                    System.out.println("Octal: " + octalNumber);
                    System.out.println("Hex: " + hexNumber);
                    break;
                case 2:
                    System.out.println("Verificador de Caracteres");
                    System.out.print("Digite um char: ");
                    String inpChar = inp.nextLine();

                    if (inpChar.length() == 0) {
                        System.out.println("Nenhum caractere digitado.");
                    } else {
                        char firstChar = inpChar.charAt(0);
                        if (Character.isWhitespace(firstChar)) {
                            System.out.println("Você escreveu um whitespace");
                        } else if (Character.isLetter(firstChar)) {
                            if (Character.isUpperCase(firstChar)) {
                                System.out.println("Você escreveu uma letra maiúscula");
                            } else {
                                System.out.println("Você escreveu uma letra minúscula");
                            }
                        } else if (Character.isDigit(firstChar)) {
                            System.out.println("Você escreveu um dígito");
                        } else {
                            System.out.println("Você escreveu um caractere especial");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Retornando ao menu principal...");
                    // No action needed; just returning to the loop.
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        inp.close();
    }
}
