public class calculoMenorV2 {
    public static void main(String[] args) {

        double numeros[] = { -9991, -7.2, 4.5, -21, -3333.14, 0 };
        double menor = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (menor > numeros[i]) {
                menor = numeros[i];
            }

        }
        System.out.println(menor);
    }
}
