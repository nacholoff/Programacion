public class interes {
    public static void main(String[] args) {
        
        double dinero = 100;
        int contador = 0;
        double interes = 100;
        

        while (contador < 5) {
            interes =(dinero * interes) /100;
            dinero = dinero + interes;
            contador++;
            System.out.println("TOTAL A PAGAR :"+dinero);
        }
        
       // System.out.println("TOTAL A PAGAR :"+dinero);
    }
}
