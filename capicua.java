import  java.lang.Math;
public class capicua {
    public static void main(String[] args) {
       //sacar las 4 cifras de un num de 4 cifras
       int num = 11111;
       int num1 = num;
       int tamaño = 5;
       int inverso = 0;
        
        int cifras[]= new int[5];
    
        for (int i = 0; i <5;i++) {

            cifras[i] = num1%10;
            num1= num1/10;            
            System.out.println(cifras[i]);
        
        }
        int num2=0;
        for (int i = 0; i < tamaño; i++) {
            num2 = (int) (cifras[i] + Math.pow(tamaño-1, -i));
           System.out.print(num2);
        }

    
        if (num2==num) {
            System.out.println("El  numero "+num2+ " es capicua!!");
        } else {
            System.out.println("No es capicua");
        }

        


       /* 
        if(num==num1){
            System.out.println(" ES CAPICUA");
        }else{
            System.out.println(" NO ES CAPICUA");
        }
        */
       



       



    }
}
