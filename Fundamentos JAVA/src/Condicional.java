import java.util.Scanner;

public class Condicional {
//Manejo IF-ELSE
    /*public static void main(String[] args) {
        int user=18;

        if (user <=18) {
            System.out.println("El usuario es menor de edad");
        }
        else{
            System.out.println("El usuario es mayor de edad");
        }


    }
        */
    public static void main(String[] args) {
        int user2=45;

        if (user2<=18) {
            System.out.println("EL usuario es menor");
        }
        else if (user2 >= 18 && user2 < 40) {
            System.out.println("El usuario tiene entre 18 y 39");
        }
        else if (user2 == 45 || user2 == 50) {
            System.out.println("El usuario tiene entre 45 y 50 años");
        }
        else {
            System.out.println("El usuario es mayor de 40");
        }


        //Comprobar si un numero es divisle por 2 y por 3
        /*Si numero%2 es 0 Y numero%3 
        */
        System.out.println("Introduce el numero");
        String nombre=teclado.nextLine();
        

        int numero=6;
        if (numero%2==0 && numero%3==0){
            System.out.println("Es divisible por 2 y 3");
        }
        else{
            System.out.println("El numero no es divisible por 2 y por 3");
        }
    }
    

    
    

}

