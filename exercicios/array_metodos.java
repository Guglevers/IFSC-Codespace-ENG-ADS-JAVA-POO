import java.util.Arrays;  
import java.util.Scanner; 

public class array_metodos {  
    public static void main(String[] args) {  
        Scanner inp = new Scanner(System.in);  

        String arrayString = inp.nextLine();  

        // Divide a string de entrada em um array de strings, usando espaço como delimitador
        String[] array = arrayString.split(" ");  

        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += Integer.parseInt(array[i]);  // Converte a string para inteiro
        }

        // Ordena o array em ordem alfabética, pois os elementos são strings
        Arrays.sort(array);  

        // Exibe o array ordenado como uma string (usando o formato padrão de toString para arrays)
        System.out.println(Arrays.toString(array));  

        System.out.println(soma);  
    }
}
