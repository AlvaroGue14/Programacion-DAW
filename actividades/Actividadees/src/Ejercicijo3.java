import java.util.Scanner;

public class Ejercicijo3 {
    
    public static void main(String[] args) {
    
    
    //ACTIVIDAD 3

    int dia=0, mes=0, ano=0;
    Scanner teclado3=new Scanner(System.in);
    System.out.println("Introduce el dia");
    dia=teclado3.nextInt();

    System.out.println("Introduce el mes");
    mes=teclado3.nextInt();

    System.out.println("Introduce el año");
    ano=teclado3.nextInt();

    if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
        if (dia>1 && dia<=31){
            System.out.println("Fecha correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    }

    else if (mes==4 || mes==6 || mes==9 || mes==11) { // Meses que acaban en 30
        if (dia>1 && dia<=30){
            System.out.println("Fecha correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    }

    else if (mes==2) { //Febrero
        if (dia>1 && dia<=29) {
            System.out.println("Fecha correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    }
    else if (dia==29) { //Bisisesto
            if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
                System.out.println("Fecha correcta");
            }
            else{
                System.out.println("Fecha incorrecta");
            }
    } 
    
    else{
            System.out.println("Fecha incorrecta");
    }


   teclado3.close();

    }
    }

