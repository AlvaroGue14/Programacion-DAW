import java.util.Scanner;

public class adivina {
    
    public static void main(String[] args) {
        //Generar el numero aleatorio
        int aleatorio=(int)(Math.random()*(100-1+1))+1;
        int intentos=0;
        int numero=0;
        boolean encontrado=false;
        Scanner teclado = new Scanner(System.in);

        //creamos el bucle para ir viendo lo que el usuario va introduciendo
        do{
            //Vamos a leer el numero
            System.out.print("Introduce un numero");
            numero=teclado.nextInt();
            if (numero>aleatorio) {
                System.out.println("El numero es menor al que has introducido");
            }
            else if (encontrado) {
                System.out.println("El numero es mayor al que has introducido");
            }
            else{
                System.out.println("Has acertado");
                encontrado=true;
            }
            intentos++;
            System.out.println("Lo has intentado "+intentos+" vez/es");
        } while (!encontrado);




       




    }
}


