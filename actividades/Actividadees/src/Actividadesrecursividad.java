//Ejercicio 2
public class Actividadesrecursividad{

public static void main(String[] args){
    System.out.println(sumaNumeros(4));
    System.out.println(sumaNumerosRecursivo(4));

    System.out.println(potenciaNum(3, 4));

    System.out.println(pasarBinario(567));
 System.out.println();
}


public static int sumaNumeros(int n){
    int suma=0;
    for(int i=0;i<=n;i++){
        suma+=1;
    }
    return suma;
}

public static int sumaNumerosRecursivo(int n){
    if (n==1){
        return 1;
    }
    else{
        return n+sumaNumerosRecursivo(n-1);
    }
    }

//Ejercicio 3

public static double potenciaNum(int base, int exponente){ 
    //Caso base
    if(exponente==0) return 1;
    else return base*potenciaNum(base, exponente-1);
    }


//Ejercicio 4
public static String pasarBinario(int num){
    if (num==0){
        return "";
    }
    else{
       return pasarBinario(num / 2 ) + (num % 2);
    }
}
    
}
