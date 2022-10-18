import java.util.Scanner;
public class Array3 {

    // CREAR ARRAY INSERTAR NUMEROS Y MOSTRARLOS DEL 1 al 10
    public static void main(String[] args) {
        Scanner sn = new  Scanner(System.in);
        System.out.println("Inserte la longitud del ARRAY");
        int longitud = sn.nextInt();
        int numeros[] = new int[longitud];
        int num = 0;

        for(int i =0; i<numeros.length;i++){
            System.out.println("Inserte un numero en la posicion "+i);

            do {
                num = sn.nextInt();
                if(!(num >= 0 && num <=10)){
                    System.out.println("Error, solo numeros del 0 al 10" +
                    "Inserte un numero en la posicion "+i);

                }
            } while (!(num >= 0 && num <=10));
            numeros[i]=num;

        }
        System.out.println("Estos son los numeros elegidos por el usuario");
            for(int i = 0; i<numeros.length;i++ ){
                System.out.println(numeros[i]);
            }
    }
}
