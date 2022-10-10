public class capicuaV2 {
    public static void main(String[] args) {
        
        int numero=12345;
        int temporal=numero;

        while (temporal<0) {
            int cifra;
            int reverso = 0;
            cifra = temporal%10;
            reverso= reverso*10 + cifra;
            temporal=temporal/10;
        }
        if (temporal==numero) {
            System.out.println("Es Capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
