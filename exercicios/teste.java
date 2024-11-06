import java.util.Scanner;

public class teste {
    public static void main (String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Digite numeros a serem somados: ");

        String input = inp.nextLine();

        String numeros_str[] = input.split(" ");

        System.out.println(sum(numeros_str));
    }

    public static int sum (String[] args){

        int result = 0;

        for (int i = 0; i < args.length; i++){
            result+=Integer.parseInt(args[i]);
        }
        return result;
    }
}


