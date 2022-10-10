public class ejercicioMedia {
    public static void main(String[] args) {

       /* 
        int numeros[] = { 1, 2, 3, 4 };

        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            media = media + numeros[i];

        }
        media = media / 4;
        System.out.println(media);
        */

        int numeros[] = { 1, 2, 3, 4 };
        int i = 0;
        double media =0;
        while (numeros[i]<numeros.length) {
            media = media + numeros[i];
            i++;
        }
        media = media /4;
        System.out.println(media);
    }
}
