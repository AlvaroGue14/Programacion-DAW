public class recursividad {
    /* 
    public static int factorial(int n) {
        //Caso false
        if (n==0) {
                return 1;
        }
        else{ //caso recursivo
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(4));
    }
    */


    /* 
    public static void main(String[] args) {
    int a = 2001;
    System.out.println(funcion(a, 2));
    }
    public static int funcion(int num, int pos){
    if(num < 10){
    return num;
    }
    else{
    return (num % 10) * (int) Math.pow(10, pos) + (funcion(num/10, pos-1));
    }
    }
    
    public static void main(String[] args) {
        incre(4);
    }

    public static void incre(int n){
    if(n>0){
        incre(n-1);
        System.out.println(n);
    }
    else{
    System.out.println();
    }
    }

}
    */

    /* haz una funcion que lea cuantos digitos tiene 
     * 
     * Leer la funcion
     * hacer la funcion
     * Decir cuantos digitos tiene esa funcion
     * 
    */


    
    public static int numerodigitos(int n){
        int contador=0;
        while (n>0) {
            n=n/10;  //Se divide entre 10 para sacar la cantidad de digitos
            contador++;
        }
        return contador;
    }

    public static int numerodigitosRecursivo(int n){
    if(n>0 && n<10) {
        return 1;
    }
    else{
        return 1+numerodigitosRecursivo(n/10);
    }
}
    public static void main(String[] args) {
        int numero=1231232;
        System.out.println(numerodigitos(numero)); //reiterativo (el normal)
        System.out.println(numerodigitosRecursivo(numero));
    }
    

}