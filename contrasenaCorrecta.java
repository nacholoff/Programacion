
public class contrasenaCorrecta {
    public static void main(String[] args) {

        String password = "gf6assssssssssssdfgjk";
        String regex = "^[a-zA-Z0-9]*";
        Boolean validador = true;
        int contadorNums = 0;
        System.out.println(password.matches(regex));

        if (password.length()>10) {
            validador = false;
        }
        if (!password.matches(regex)) {
            validador = false;
        }
        for(char c: password.toCharArray()){

            if (Character.isDigit(c)) {
                contadorNums = contadorNums++;
                
            }
        }

    }
}
