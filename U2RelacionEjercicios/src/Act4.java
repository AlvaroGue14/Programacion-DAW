import java.util.Scanner;

public class Act4 {
    
    public static void main(String[] args)  throws Exception {
        
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la pirmera nota y pulsa ENTER");
        int nota1 = teclado.nextInt();

        System.out.println("Introduce la segunda nota y pulsa ENTER");
        int nota2 = teclado.nextInt();

        double media=(nota1+nota2)/2;
        int recuperacion;
        int hacerrecup;
        boolean salida=false;

        if (media>=5) {
            System.out.println("Has aprobado");
        }
        else{
            System.out.println("Has suspendido");
            System.out.println("¿Has hecho el examen de recuperacion? 1-Si 2-No");
            hacerrecup=teclado.nextInt();

            if (hacerrecup==1) {
            do {
                System.out.println("¿Eres apto o no apto en el examen de recuperacion?  1-Apto 2-No apto");
                recuperacion=teclado.nextInt();
        
                switch (recuperacion) {
                    case 1: System.out.println("Apto, has sacado un 5");
                        recuperacion=teclado.nextInt();
                        System.out.println("Nota media 5, aprobado");
                    break;
                    case 2: System.out.println("No apto");
                        recuperacion=teclado.nextInt();
                        break;
                    default: 
                        System.out.println("Caracter invalido");
                        salida=true;
                    break;
                    
                } 
            }while (!salida);
        }

            else if (hacerrecup==2) {
                    System.out.println("Suspenso");
                }
            else{
                System.out.println("Caracter invalido");
            }
        
        
    }
       
    }
}

