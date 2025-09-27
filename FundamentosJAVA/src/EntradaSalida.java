
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        // // Instrucciones de salida por pantalla
        // int valor = 7;
        // System.out.println(valor);

        // // Usar printf
        // double precio = 13.354789;
        // System.out.printf(" El precio del producto %s tiene un valor de %.2f y se han comprado %d", "Tablet", precio,
        //         valor);
        // // Incluir un icono
        // System.out.println("Q ganas tengo de unas vacaciones \u26F1");
        
        // // Formato reciente de System
        // System.out.println("El precio del producto " + "Tablet" + "tiene un valor de " + precio + " y se han comprado " + valor);
    
        // // Formato salida texto
        // System.out.printf("%15s, %-15s", "Jonathan", "Informatico");
        // System.out.println();

        // // Formato tabla
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s |%-10s |%-10s\n", "Producto", "Cantidad", "Valor");
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s|%d   |%.2f   |\n", "Tablet", valor, precio);
        // System.out.println("|----------|----------|----------|");


        // System.out.println("|----------|----------|----------|");
        // System.out.println("|" + "Producto" + "  |" + "Cantidad" + "  |" + "Precio" + "  |");
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|" + "Producto " + " |     " + valor + "    |" + precio + "  |");
        // System.out.println("|----------|----------|----------|");

        // Operaciones de entrada por teclado
        Scanner consola = new Scanner(System.in);
        /*System.out.print("Introduce la cadena de texto deseada: ");
        String cadena = consola.nextLine();
        System.out.println("La cadena introducida es: " + cadena);
        */
        System.out.print("Introduce nombre: ");
        // Lee nombre
        String nombre = consola.nextLine();
        // Leer apellido
        System.out.print("Introduce apellido: ");
        String apellido = consola.nextLine();
        // Leer edad
        System.out.print("Introduce edad: ");
        // Opcion1 de limpiar buffer
        //int edad = consola.nextInt();
        //consola.nextLine(); // Limpiar el buffer para el salto de linea
        // Opcion2 de limpiado de buffer
        int edad = Integer.parseInt(consola.nextLine());
        
        // Leer profesion
        System.out.print("Introduce profesion: ");
        String profesion = consola.nextLine();

        System.out.println("El usuario se llama " + nombre + " " + apellido + ". Tiene " + edad+  " años y trabaja de " + profesion);


        consola.close();
    }
}
