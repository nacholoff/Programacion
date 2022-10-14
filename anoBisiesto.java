public class anoBisiesto {
    public static void main(String[] args) {
        int year = 2024;


        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("THIS YEAR "+year+" is BISIESTUS");
        } else {
            System.out.println("El año no es bisiesto");
            
        }
    }
}
