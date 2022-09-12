import java.util.Arrays;

public class AulaOito {
  public static void main(String[] args) {

    String[] letrasUm = new String[5];
    // [0] [1] [2] [3] [4]
    letrasUm[0] = "A";
    letrasUm[1] = "B";
    letrasUm[2] = "C";
    letrasUm[3] = "J";
    letrasUm[4] = "X";

    for (int i = 0; i < letrasUm.length; i++) {
      System.out.println(letrasUm[i]);
    }

    // Um abaixo do outro
    String[] letrasDois = {"A", "B", "C", "J", "X"};
    for (int i = 0; i < letrasDois.length; i++) {
        System.out.println(letrasDois[i]);
    }

    // Um ao lado do outro, dentro do array
    System.out.println(Arrays.toString(letrasUm));

    // Array com numeros e média
    int[] numeros = {9, 10, 12, 25, 2};
    int maior = numeros[0];
    int menor = numeros[0];
    float media = (float) 0;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
      media += numeros[i];
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Media: " + media / numeros.length);
  }
}
