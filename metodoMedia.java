import java.util.Scanner;

public class metodoMedia {

public static double media(double a, double b, double c, double d, double e){

    double media = 0;
    media = a + b + c + d;
    media = media / 5;
    return media;


}



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        

        System.out.println("Inserte 5 numeros para calcular su media");
        System.out.println("Inserte Primer Numero");
        double num1 = sc.nextDouble();

        System.out.println("Inserte Segundo Numero");
        double num2 = sc.nextDouble();

        System.out.println("Inserte Tercer Numero");
        double num3 = sc.nextDouble();

        System.out.println("Inserte Cuarto Numero");
        double num4 = sc.nextDouble();

        System.out.println("Inserte Quinto Numero");
        double num5 = sc.nextDouble();
        sc.close();

        System.out.println(media(num1, num2, num3, num4, num5));

        



        
    }
}
