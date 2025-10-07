import java.util.Scanner;

public class Act2 {
    
    public static void main(String[] args) {
        
       Scanner teclado=new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas esta semana: ");
        int trabajado = teclado.nextInt();

        int salario;

        if (trabajado <= 40) {
            salario = trabajado*12;
        } else {
            int extra=trabajado-40;
            salario = (40*12) + (extra*16);
        }

        System.out.println("El salario semanal es: "+salario+" euros");
    }
}
