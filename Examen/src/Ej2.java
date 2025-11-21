import java.util.Scanner;
public class Ej2 {
    
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);

    
    System.out.println("Introduce que quieres sacar");
    System.out.println("1-Piedra || 2-Papel || 3-Tijera");
    System.out.println("Introduce -1 para salir");
    int sacartu = teclado.nextInt();
    
    int sacarmaquina=(int)(Math.random()*(3-1+1))+1;
    System.out.println("La mquina ha sacado: "+sacarmaquina);
    int wins=0;
    //Piedra 1
    //Papel 2
    //tijeras 3

    
    do {
    //primera opcion
    if (sacartu==1 && sacarmaquina==3){
         System.out.println("Has ganado la ronda");   
    } else if (sacartu==1 && sacarmaquina==2){
        System.out.println("Has perdido la ronda");
        wins++;
    } else if (sacartu==1 && sacarmaquina==1) {
        System.out.println("Empate");
    } 
    //2opcion
    else if (sacartu==2 && sacarmaquina==3) {
        System.out.println("Has perdido la ronda");
        wins++;
    } else if (sacartu==2 && sacarmaquina==2){
        System.out.println("Empate");
    } else if (sacartu==2 && sacarmaquina==1) {
        System.out.println("Has ganado la ronda");
    }
    //3opcion
    else if (sacartu==3 && sacarmaquina==1) {
        System.out.println("Has perdido la ronda");
        wins++;
    } else if (sacartu==3 && sacarmaquina==3){
        System.out.println("Empate");
    } else if (sacartu==3 && sacarmaquina==2) {
        System.out.println("Has ganado la ronda");
    }
    } while ((sacartu!=0) || (wins!=5));
    //es un bucle infinito por ahora
}
}
