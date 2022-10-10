public class capicuaV2 {
    public static void main(String[] args) {
        
<<<<<<< HEAD
        int numero=12345;
        int temporal=numero;

        while (temporal<0) {
            int cifra;
            int reverso = 0;
=======
        int numero=545;
        int temporal=numero;
        int cifra;
        int reverso = 0;

        while (temporal>0) {
        
>>>>>>> acb9fe7b0d2ad39b28dab33beb0de7b7b248c460
            cifra = temporal%10;
            reverso= reverso*10 + cifra;
            temporal=temporal/10;
        }
<<<<<<< HEAD
        if (temporal==numero) {
=======
        if (reverso==numero) {
>>>>>>> acb9fe7b0d2ad39b28dab33beb0de7b7b248c460
            System.out.println("Es Capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
