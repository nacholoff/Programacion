public class metodoPrimos {

    public static boolean devuelvePrimo(int n) {

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 1000;

        for (int i = 2; i < n;i++) {

            if (devuelvePrimo(i) && devuelvePrimo((i + 2))) {
                System.out.println(i+ "-" + (i+2));
               
            }

        }
    }
}
