public class Array2 {
    public static void main(String[] args) {
        int numeros[] = new int[100];
        int suma =0;
        double media = 0;

        System.out.println(numeros[5]);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
            suma+=numeros[i];
        }

        System.out.println("La suma es: "+suma);
        media=(double)suma/numeros.length;
        System.out.println("La media es: "+media);
        // SUMAR NUMEROS DE UN ARRAY Y HACER MEDIA

    }
}
