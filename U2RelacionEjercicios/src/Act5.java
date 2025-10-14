import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        
            System.out.println("Pon el numero del dia de la semana que quieres saber el horario");
            System.out.println("Pulsa 6 para ver el horario completo");
            System.out.println("Pulsa 7 para salir");
            int horario = teclado.nextInt();

            if (horario==1) {
                System.out.println("08:00-09:00 |         IPE        |");
                System.out.println("09:00-10:00 |      Sist. Inf     |");
                System.out.println("10:00-11:00 |   G.Base de datos  |");
                System.out.println("11:00-11:30 |        RECREO      |");
                System.out.println("11:30-12:30 |   G.Base de datos  |");
                System.out.println("12:30-13:30 |     Programacion   |");
                System.out.println("13:30-14.30 |     Programacion   |");
            }
            else if (horario==2) {
                System.out.println("08:00-09:00 |        LMSGI       |");
                System.out.println("09:00-10:00 |      Sist. Inf     |");
                System.out.println("10:00-11:00 |      Sist. Inf     |");
                System.out.println("11:00-11:30 |        RECREO      |");
                System.out.println("11:30-12:30 |     Programacion   |");
                System.out.println("12:30-13:30 |     Programacion   |");
                System.out.println("13:30-14.30 |    Ent. Desarrolo  |");
            }
            else if (horario==3) {
                System.out.println("08:00-09:00 |   G.Base de datos  |");
                System.out.println("09:00-10:00 |   G.Base de datos  |");
                System.out.println("10:00-11:00 |      Sist. Inf     |");
                System.out.println("11:00-11:30 |        RECREO      |");
                System.out.println("11:30-12:30 |      Sist. Inf     |");
                System.out.println("12:30-13:30 |     Programacion   |");
                System.out.println("13:30-14.30 |     Programacion   |");
            }
            else if (horario==4) {
                System.out.println("08:00-09:00 |     Programacion   |");
                System.out.println("09:00-10:00 |   Ent. Desarrollo  |");
                System.out.println("10:00-11:00 |   Ent. Desarrollo  |");
                System.out.println("11:00-11:30 |        RECREO      |");
                System.out.println("11:30-12:30 |         IPE        |");
                System.out.println("12:30-13:30 |   G.Base de datos  |");
                System.out.println("13:30-14.30 |    Sostenibilidad  |");
            }
            else if (horario==5) {
                System.out.println("12:30-13:30 |   G.Base de datos  |");
                System.out.println("09:00-10:00 |    Digitalizacion  |");
                System.out.println("08:00-09:00 |        LMSGI       |");
                System.out.println("11:00-11:30 |        RECREO      |");
                System.out.println("08:00-09:00 |        LMSGI       |");
                System.out.println("11:30-12:30 |         IPE        |");
                System.out.println("13:30-14.30 |     Programacion   |");
            }
            else if (horario==6) {
                System.err.println("                     LUNES                 MARTES                MIERCOLES               JUEVES                  VIERNES      ");
                System.out.println("08:00-09:00 |         IPE        | |        LMSGI       | |   G.Base de datos  | |     Programacion   | |   G.Base de datos  |");
                System.out.println("09:00-10:00 |      Sist. Inf     | |      Sist. Inf     | |   G.Base de datos  | |   Ent. Desarrollo  | |    Digitalizacion  |");
                System.out.println("10:00-11:00 |   G.Base de datos  | |      Sist. Inf     | |      Sist. Inf     | |   Ent. Desarrollo  | |        LMSGI       |");
                System.out.println("11:00-11:30 |          R         | |          E         | |          C         | |          R         | |          O         |");
                System.out.println("11:30-12:30 |   G.Base de datos  | |     Programacion   | |      Sist. Inf     | |         IPE        | |        LMSGI       |");
                System.out.println("12:30-13:30 |     Programacion   | |     Programacion   | |     Programacion   | |   G.Base de datos  | |         IPE        |");
                System.out.println("13:30-14.30 |     Programacion   | |    Ent. Desarrolo  | |     Programacion   | |    Sostenibilidad  | |     Programacion   |");
            }
            else if (horario==7) {
                System.out.println("Hasta pronto");
            }
            else if (horario>7) {
                System.out.println("Valor incorrecto");
            }
        
    }
}
