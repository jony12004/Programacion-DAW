
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        //Definir variables
        int dia=0, mes=0, anyo=0;
        System.out.println("Introduce día mes año: ");
        Scanner teclado = new Scanner(System.in);
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        anyo=teclado.nextInt();

        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){//Meses de 31 días
            if(dia>=1 && dia<=31){
                System.out.println("Fecha correcta");
            }
            else{
                System.out.println("Fecha incorrecta");
            }
        }
        else if(mes==4 || mes==6 || mes==9 || mes==11){//MEses de 30 días
            if(dia>=1 && dia<=30){
                System.out.println("Fecha correcta");
            }
            else{
                System.out.println("Fecha incorrecta");
            }
        }
        else if(mes==2){//Caso febrero
            if(dia>=1 && dia<=28){
                System.out.println("Fecha correcta");
            }
            else if(dia==29){
                if((anyo%4==0 && anyo%100!=0)||(anyo%400==0)){//Ver si el año es bisiesto
                    System.out.println("Fecha correcta");
                }
                else{
                    System.out.println("Fecha incorrecta");
                }
            }
            else{
                System.out.println("Fecha incorrecta");
            }
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    }    
}
