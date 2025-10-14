import java.util.Scanner;

public class Act7 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int positivos=0;
        int negativos=0;

        System.out.println("Introduce números (introduce el 0 para terminar):");
        do {
            numero = teclado.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        } while (numero!= 0);

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

    }
}
