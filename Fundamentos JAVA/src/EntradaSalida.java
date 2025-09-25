public class EntradaSalida {
    public static void main(String[] args) {
        //Intrucciones pro pantalla
        int valor=7;
        System.out.println(valor);
        
        //Usar printf 
        double precio=13.354789;
        System.out.printf("El producto %s tiene un valor de %5.2f y se ha comprado %d", "manzanas", precio, valor);

        //Incluir un icono
        System.out.println("Que ganas tengo de unas vaciones ⛱");

        //Formato reciente de System (el mas usado y el voy a usar(mas facil))
        System.out.println("El precio del producto "+" manzanas "+" tiene un valor de "+precio+" y se han comprado "+valor);

        //Formato salida texto
        System.out.printf("%15s, %-15s", "Alvaro","Informatico");

        //Formato de tabla
        System.out.println();
        System.out.println("|----------|----------|----------|");
        System.out.printf("|%-10s|%-10s|%-10s|\n", "Producto","Cantidad","Valor");
        System.out.println("|----------|----------|----------|");
        System.out.printf("|%-10s|%d         |%f |\n", "Producto",valor,precio);
        System.out.println("|----------|----------|----------|");

        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Producto  "+"|"+"Cantidad  "+"|"+"Precio    "+"|");
        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Producto  "+"|"+valor+"         |"+precio+" |");
        System.out.println("|----------|----------|----------|");

    }
    
}
    