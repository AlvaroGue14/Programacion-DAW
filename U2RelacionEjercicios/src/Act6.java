import java.util.Scanner;

public class Act6 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        
        

        
        //Rango
        System.out.println("¿Cual es tu cargo de empleado? (seleccione el numero de su rango y pulse ENTER)");
        System.out.println("1-Prog. junior | 2-Prog. senior | 3-Jefe de proyecto");
        int rango = teclado.nextInt();

        //Estado civil
        System.out.println("¿Cual es su estado civil? (sekecione el numero de su estado civil y pulse ENTER)");
        System.out.println("1-Soltero | 2-Casado");
        double civil = teclado.nextInt();

        //Dietas
        System.out.println("¿Cuantos viajes ha hecho?");
        int Ndietas = teclado.nextInt();
        
        //Calcular Rango
        double sueldobase=0;
        switch (rango) {
            case 1:
                sueldobase=950;
                break;
            case 2:
                sueldobase=1200;
                break;
            case 3:
                sueldobase=1600;
                break;
            default:
                System.out.println("Cargo no valido.");
                return;
        }

        //Viajes
        int dietas=30;
        double sueldodietas= Ndietas*dietas;

        //Total sin el irpf quitado
        double sueldoSinIRPFbruto= sueldodietas+sueldobase;

        //Calcular Estado civil
        double porcentajeIRPF;
        if (civil==1) {
            porcentajeIRPF=0.25;
        }
        else if (civil==2) {
            porcentajeIRPF=0.20;
        } 
        else {
            System.out.println("Estado civil no valido");
            return;            
        }

        double descuentodeIRPF=sueldoSinIRPFbruto*porcentajeIRPF; 
        double neto= sueldoSinIRPFbruto-descuentodeIRPF; 

        System.out.println("------ NÓMINA DEL EMPLEADO ------");
        System.out.println("Sueldo base:               "+sueldobase);
        System.out.println("Dietas:                    "+sueldodietas);
        System.out.println("Sueldo bruto:              "+sueldoSinIRPFbruto);
        System.out.println("Retencion de IRPF:         "+descuentodeIRPF);
        System.out.println("Neto:                      "+neto);
        
    }
}
