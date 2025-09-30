
import java.time.LocalDateTime;

import utilidades.Matematicas;



public class Funciones {
    public static void main(String[] args) {
        // Tratamiento de fechas en JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
        System.out.println("El día es: " + hoy.getDayOfMonth());
        System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
        System.out.println("El año es: " + hoy.getYear());
        System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());
    
        //Tratamiento de Math
        System.out.println(Math.pow(2,8));

        //Uso de funciones propias
        System.out.println(Matematicas.suma(3, 4));

        //Números aleatorios
        int min=1;
        int max=15;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        System.out.println(aleatorio);

        //Operadores
        //++ y --
        //No es lo mismo variable++ que ++variable
        int valor=1;
        valor=--valor;//Forzar la diferencia, tú pondrás en código sólo --valor
        System.out.println(valor);
        valor=valor-1;
        System.out.println(valor);

        //Expresiones relacionales
        System.out.println((5>3)||(5>6));

        //Operador opera-asigna
        int numero11=3;
        int numero12=4;
        numero11+=numero12;
        System.out.println(numero11);

        //Operador ternario 
        int a=10,b=5;
        int x=a==10 ? b*2 : a;
        System.out.println(x);
    
    }
    
}
