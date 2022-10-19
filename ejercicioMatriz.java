import java.util.Arrays;

public class ejercicioMatriz {
    public static void main(String[] args) {
        
        int numero = 5;
        int[][] matriz = new int [numero] [numero];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){

                matriz[i][j]= i+j;
            }
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");

            for (int[] matrix: matriz) {
                System.out.println(Arrays.toString(matrix));
            }
        }
    }
}
