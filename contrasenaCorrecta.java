import java.net.PasswordAuthentication;

public class contrasenaCorrecta {
    public static void main(String[] args) {

        String passWord = "asrseg123";
        
        boolean valido = true;
        int contador = 0;

        if ((passWord.length() == 9) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("THIS YEAR "+year+" is BISIESTUS");
        } else {
            System.out.println("El año no es bisiesto");
            
        }

    
    }
}
