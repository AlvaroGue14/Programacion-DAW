import java.util.Scanner;

public class MCD_MCM {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int resto;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce a");
        a=teclado.nextInt();
        System.out.println("Introduce b");
        b=teclado.nextInt();
        int originalA= a;
        int originalB= b;
        while (b!=0) {
            resto=a%b;
            a=b;
            b=resto;
        }
        System.out.println("El MCD es "+a);


        //MCM
        int mcm=Math.max(originalA,originalB);
        while (mcm % originalA!=0 || mcm % originalB!=0) {
            mcm+=Math.max(originalA, originalB);
        }
            System.out.println("EL MCM es "+mcm);
    }
}
