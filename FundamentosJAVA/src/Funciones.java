
import java.time.LocalDateTime;



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
    }
    
}
