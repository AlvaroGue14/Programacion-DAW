public class Actividad1 {
    public static void main(String[] args) throws Exception {
     
        int min=1, max=100;
        int numero1=(int)(Math.random()*(max-min+1))+min;
        int numero2=(int)(Math.random()*(max-min+1))+min;

        //Hacer las cuentas
        double cociente=numero1/(double)numero2;
        double media=(numero1+numero2)/2.0;
        double potencia=Math.pow(numero1, numero2);
        double raiz1=Math.sqrt(numero1);
        double raiz2=Math.sqrt(numero2);
        //Sacar resultados
        System.out.println("Los numero generados son: "+numero1+" y "+numero2);
        System.out.println("El cociente es "+cociente);
        System.out.println("La media es "+media);
        System.out.println("La potencia es "+potencia);
        System.out.println("La raiz cuadrada del primer numero es "+raiz1);
        System.out.println("La raiz cuadrada del segundo numero es "+raiz2);

    }

};

