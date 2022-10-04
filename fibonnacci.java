public class fibonnacci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        int numero1= 0;
        int numero2= 1;
        int suma=0;

        for (int i =1; i < 15 ;i++ ) {

            System.out.println("Fibonnacci: "+suma);
            suma = numero1+numero2;
            numero1 = numero2;
            numero2 = suma;
            
        }
        System.out.println(suma);
        

    }
    
}