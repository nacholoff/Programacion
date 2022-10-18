public class arrays {
    /**
     * @param argssss
     */
    public static void main(String[] args) {
        
        int numeros[] = {0,0,1};

        for(int i= 1; i <= 15;i++){
        
        numeros[0] = numeros[1]+numeros[2];
        numeros[1] = numeros[2];
        numeros[2]= numeros[0];
        System.out.println(numeros[0]);
        }
        System.out.println("NUMERO FINAL " +numeros[0]);
    }
    
}
    
