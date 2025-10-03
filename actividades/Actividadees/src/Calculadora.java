import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
         //Seleccionar el metodo si es suma, resta etc
        //Hacer la operacion
        int opcion;
        int numero1;
        int numero2;
        boolean salida=false;
        Scanner teclado=new Scanner(System.in);
        do {
            System.out.println("------CALCULADORA DAW------");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicar");
            System.out.println("4- Division");
            System.out.println("Introduce una opccion");
            System.out.println("Introduce -1 para salir");
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1: System.out.println("Introduzca los numeros");
                    numero1=teclado.nextInt();
                    numero2=teclado.nextInt();
                    System.out.println("La suma es "+(numero1+numero2));
                    break;
                case 2: System.out.println("Introduzca los numeros");
                    numero1=teclado.nextInt();
                    numero2=teclado.nextInt();
                    System.out.println("La resta es "+(numero1-numero2));
                    break;
                case 3: System.out.println("Introduzca los numeros");
                    numero1=teclado.nextInt();
                    numero2=teclado.nextInt();
                    System.out.println("EL resultado de la multiplicacion es "+(numero1*numero2));
                    break;
                case 4: System.out.println("Introduzca los numeros");
                    numero1=teclado.nextInt();
                    numero2=teclado.nextInt();
                    System.out.println("El resultado de la division es "+(numero1/numero2));
                    break;
                default: 
                    salida=true;
                    break;
            }
        } while (!salida);
        // while (opcion!=-1) / !salida / es lo mismo pero diferent manera de expresarlo 
        

    }
}
