import java.util.Scanner;
public class ER1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
       
        System.out.println("Introduce el numero y pulsa ENTER: ");
            int num=teclado.nextInt();

            if (num%2==0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
    }

}
