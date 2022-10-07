public class capicuaV2 {
    public static void main(String[] args) {
        
        int numero=545;
        int temporal=numero;
        int cifra;
        int reverso = 0;

        while (temporal>0) {
        
            cifra = temporal%10;
            reverso= reverso*10 + cifra;
            temporal=temporal/10;
        }
        if (reverso==numero) {
            System.out.println("Es Capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
