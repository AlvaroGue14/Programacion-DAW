import java.time.LocalTime;
public class Act1{

    public static void main(String[] args){

        LocalTime ahora = LocalTime.now();
        int hora = ahora.getHour();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}

