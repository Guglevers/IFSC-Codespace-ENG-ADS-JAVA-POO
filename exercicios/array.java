import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("qual o tamanho que voce quer a sua matriz, linhas e colunas");

        int linhas = inp.nextInt();
        int colunas = inp.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            System.out.print("\n");
            
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = j;
                System.out.print(matriz[i][j]);
            }    
        }      
    }
}
