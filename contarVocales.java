public class contarVocales {
  public static void main(String[] args) {

    String letras = "abcdeaaSDGADTKARDHSRtaeTGaEHETAT";
    int vocales = 0;

    for (int i = 0; i < letras.length(); i++) {
      if ((letras.charAt(i) == 'a')
          || (letras.charAt(i) == 'e')
          || (letras.charAt(i) == 'i')
          || (letras.charAt(i) == 'o')
          || (letras.charAt(i) == 'u')) {
        vocales++;

      }

    }
    System.out.println(vocales);

  }
}
