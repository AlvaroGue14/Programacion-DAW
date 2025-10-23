import java.util.Scanner;

public class Act3 {

        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce el día de nacimiento: ");
        int dia=scanner.nextInt();

        System.out.print("Introduce el mes de nacimiento: ");
        int mes=scanner.nextInt();

        String signo=queSigno(dia, mes);
        System.out.println("Tu signo del zodiaco es: " + signo);
    }

    //Se dividen los public static para que sea mas facil la operacion
    public static String queSigno(int dia, int mes) {

        if ((dia>=21 && mes==3) || (dia<=20 && mes==4)) {
            return "Aries";
        } else if ((dia>=21 && mes==4) || (dia<=20 && mes==5)) {
            return "Tauro";
        } else if ((dia>=21 && mes==5) || (dia<=21 && mes==6)) {
            return "Geminis";
        } else if ((dia>=22 && mes==6) || (dia<=22 && mes==7)) {
            return "Cancer";
        } else if ((dia>=23 && mes==7) || (dia<=23 && mes==8)) {
            return "Leo";
        } else if ((dia>=24 && mes==8) || (dia<=23 && mes==9)) {
            return "Virgo";
        } else if ((dia>=24 && mes==9) || (dia<=23 && mes==10)) {
            return "Libra";
        } else if ((dia>=24 && mes==10) || (dia<=22 && mes==11)) {
            return "Escorpio";
        } else if ((dia>=23 && mes==11) || (dia<=21&& mes==12)) {
            return "Sagitario";
        } else if ((dia>=22 && mes==12) || (dia<=20 && mes==1)) {
            return "Capricornio";
        } else if ((dia>=21 && mes==1) || (dia<=19 && mes==2)) {
            return "Acuario";
        } else if ((dia>=20 && mes==2) || (dia<=20 && mes==3)) {
            return "Piscis";
        } else {
            return "Fecha inválida";
        }
    }

                //Si pones un numero mayor ej: dia 33 y mes 3, te dice que es aries en vez de dar error (no se como arreglarlo)
}
