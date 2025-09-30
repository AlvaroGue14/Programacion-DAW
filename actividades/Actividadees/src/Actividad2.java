import java.util.Scanner;

public class Actividad2 {
    
    public static void main(String[] args) throws Exception {

        //Actividad 1

        int a=0, b=0, c=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce A");
        a=teclado.nextInt();
        
        System.out.println("Introduce B");
        b=teclado.nextInt();

        System.out.println("Introduce C");
        c=teclado.nextInt();

        double x1=0, x2=0;
        double A=Math.pow(b,2)-4*b*c;

        if (A <0) {
            System.out.println("No hay solucion");
        }
        else if (A==0) {
            x1=b/(2*a);
            System.out.println("La solucion es: "+x1);
        }
        else{
            x1=(-b+Math.sqrt(A))/(2*a);
            x2=(-b-Math.sqrt(A))/(2*a);
            System.out.println("La primera solucion es "+x1);
            System.out.println("La segunda solucion es "+x2);
        }
       

    //ACTIVIDAD 2

    double nota=0;
    Scanner teclado2=new Scanner(System.in);
    System.out.println("Introduce la nota que has sacado");
    nota=teclado2.nextInt();

    if (nota<5) {
        System.out.println("Has suspendido");
    }
    else if (nota==5) {
        System.out.println("Has aprobado por los pelos");
    }
    else if (nota==6) {
        System.out.println("Has aprobado");
    }
    else if (nota==7) {
        System.out.println("Has aprobado con notable");
    }
    else if (nota==8) {
        System.out.println("Has aprobado con notable");
    }
    else if (nota==9) {
        System.out.println("Has aprobado con sobresaliente");
    }
    else if (nota==10) {
        System.out.println("Has aprobado con sobresaliente");
    }
    else{
        System.out.println("Nota incorrecta");
    }
    
    teclado2.close();
    

    }
}
    



    
    



