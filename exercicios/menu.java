package exercicios;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("\nIniciando Menu...");

        System.out.println("1 - Conversor de Números\n2 - Verificador de Caracteres\n3 - Retornar ao menu inicial\n0 - Sair");

        System.out.println();
        String user_input = inp.nextInt();

        System.out.println(user_input);

        switch (user_input) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println();

            default:
                break;
        }



    }
}
