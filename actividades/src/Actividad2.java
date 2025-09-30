import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        // Resolucion de las ecuaciones de segundo grado 
        int a = 0, b = 0, c = 0;
        Scanner teclado = new Scanner(System.in);        

        System.out.println("Introduce los valores de a b c: ");
        a=teclado.nextInt();  
        b=teclado.nextInt();
        c=teclado.nextInt();
        double x1=0,x2=0;
        //Calcular el discriminante
        double discriminante=Math.pow(b,2)-4*a*c;

        if (discriminante <0){
            System.out.println("No hay soluciones");
        }
        else if(discriminante == 0){
            x1=-b/(2*a);
            System.out.println("La única solución es: "+x1);
        }
        else{
            x1=(-b+Math.sqrt(discriminante))/(2*a);
            x2=(-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("La solución 1 es: "+x1);
            System.out.println("La solución 2 es: "+x2);
        }


    }
}
