import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        int precioBase=8;
         
        //Saber cuantas entradas
        System.out.println("Introduce el numero de entradas que desee y pulsa ENTER");
        int NumEntradas = teclado.nextInt();

        //Saber que dia van
        System.out.println("¿Que dia quiere/en ir?");
        System.out.println("1-Lunes || 2-Martes || 3-Miercoles || 4-Jueves || 5-Viernes || 6-Sabado || 7-Domingo");
        int dia = teclado.nextInt();

        //Saber si tiene tarjeta del cine
        System.out.println("¿Tiene tarjeta de CineCampa?");
        System.out.println("1-Si || 2-No");
        int tarjeta = teclado.nextInt();

        //CAlcular las ofertas dependiendo del dia q vayan
        double precioEntrada=0;
        switch (dia) {
            case 1:
                precioEntrada=8;
                break;
            case 2:
                precioEntrada=8;
                break;
            case 3:
                precioEntrada=5;
                break;
            case 4:
                if (NumEntradas%2==0) {
                    precioEntrada=5.5;
                }
                else{
                    precioEntrada=8;
                }
                break;
            case 5:
                precioEntrada=8;
                break;
            case 6:
                precioEntrada=8;
                break;
            case 7:
                precioEntrada=8;
                break;
            default:
                System.out.println("Cargo no valido.");
                return;
        }

        double preciototal=NumEntradas*precioEntrada;
        //Sacar el descuento
        double descuento=0;
        if (tarjeta==1) {
            descuento=0.10;
            double precioConDescuento=preciototal*0.9; 
            System.out.println("Aqui tiene sus entradas, gracias por su compra");
            System.out.println("Numero de entradas: "+NumEntradas);
            System.out.println("Precio por entrada: "+precioEntrada+" euros");
            System.out.println("Descuesto: 10%");
            System.out.println("El precio total de las entras es de: "+precioConDescuento+" euros");
         } 
        else{    
            System.out.println("Aqui tiene sus entradas, gracias por su compra");
            System.out.println("Numero de entradas: "+NumEntradas);
            System.out.println("Precio por entrada: "+precioEntrada+" euros");
            System.out.println("Descuesto: 0%");
            System.out.println("La/s entradas cuestan: "+preciototal);
        }   
        
    
    }
}
