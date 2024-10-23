package exercicios;

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

            int userInput = getUserInput(inp);

            switch (userInput) {
                case 0:
                    System.out.println("Encerrando programa...");
                    programIsRunning = false;
                    break;
                case 1:
                    numberConverter(inp);
                    break;
                case 2:
                    characterChecker(inp);
                    break;
                case 3:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        inp.close();
    }

    private static int getUserInput(Scanner inp) {
        while (true) {
            try {
                return Integer.parseInt(inp.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, digite um número: ");
            }
        }
    }

    private static void numberConverter(Scanner inp) {
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
    }

    private static void characterChecker(Scanner inp) {
        System.out.println("Verificador de Caracteres");
        System.out.print("Digite um char: ");
        String inpChar = inp.nextLine();

        if (inpChar.length() == 0) {
            System.out.println("Nenhum caractere digitado.");
            return;
        }

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
}
