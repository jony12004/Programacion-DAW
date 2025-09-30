
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        //Introdue la nota
        Scanner teclado =new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota=teclado.nextInt();

        if(nota>=0 && nota <5){
            System.out.println("SUSPENSO");
        }
        else if (nota>=5 && nota<7){
            System.out.println("APROBADO");
        }
        else if(nota>=7 && nota <9){
            System.out.println("NOTABLE");
        }
        else if(nota>=9 && nota <=10){
            System.out.println("SOBRESALIENTE");
        }
        else{
            System.out.println("Nota incorrecta");
        }

        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("SUSPENSO");break;
            case 5:
            case 6: System.out.println("APROBADO");break;
            case 7:
            case 8: System.out.println("NOTABLE");break;
            case 9:
            case 10: System.out.println("SOBRESALIENTE");break;
            default:System.out.println("Nota incorrecta");break;
        }   
    }
    
}
