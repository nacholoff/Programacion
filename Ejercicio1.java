/**
 * Ejercicio1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        int numeros[] = {0,0,1};

        for(int i= 1; i <= 6;i++){
        
        numeros[0] = numeros[1]+numeros[2];
        numeros[1] = numeros[2];
        numeros[2]= numeros[0];
        System.out.println(numeros[0]);
       
        }
        
        System.out.println("NUMERO FINAL " +numeros[0]);


        int n = 8;
        int fibonacci[];
        fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for(int i = 2;i < n;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];

        }

        for(int i = 0; i<fibonacci.length;i++){
        System.out.println(fibonacci[i]);
    }




    

    }
}