//import static java .lang.Math.pow;
import java.time.LocalDateTime;

public class funciones {
    public static void main(String[] args) {
        //Uso de fechas en JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println(hoy.getDayOfWeek());

        //Tratamiento de Math
         System.out.println(Math.pow(2,8));

         //Tratamiento aleatorios
        int min=1;
        int max=15;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        System.out.println(aleatorio);
        // System.out.println(Math.random());  Para numero aleatorio entre 0-1


        //Operadores
        //++ (+1) y --
        //No es lo mismo variable++ que ++variable

        /*int valor=1;
         valor=++valor;
         System.out.println(valor);
         valor=valor+1;
         System.out.println(valor);
        */
        int valor=1;
        valor=--valor;
        System.out.println(valor);
        valor=valor-1;
        System.out.println(valor);

        //Expresiones relacionales
            //True or False
        System.out.println((5>3)&&(5>2));
        System.out.println((5>3)||(5>2));

        //Operadr opera-asigna
        int numero11=3;
        int numero12=4;
        numero11=numero11+numero12;
        System.out.println(numero11);


        int a=3 ,b=5;
        int x=a==10?b*2:a;
        System.out.println(x);
    }


    }
    

