
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // //Caso básico de bucle
        // for(int i=0;i<5;i++){ // Conozco cuantas veces se ejecutan
        //     System.out.println(i);
        // }
        // int j=0;
        // //Bucle while
        // while(j<5){ //mientras se cumpla la condición
        //     System.out.println(j);
        //     j++;
        // }

        // // Bucle do while
        // int k = 0; // min se ejecuta una vez 
        // do { 
        //     System.out.println(k);
        //     k++;
        // } while (k<5);
    

        //Cosas que no quiere ver domingo en nuestros codigos
        // for(int i = 0; i < 5 && continuar; i++){
        //     System.out.println(i);
        //     if(i == 3){
        //         break;
        //     }
        // }

        // boolean continuar = true;
        // for(int i = 0; i < 5 && continuar; i++){
        //     System.out.println(i);
        //     if(i == 3){
        //         continuar = false; 
        //     }
        // }


        // Hacerlo con while
        // int j=0;
        // boolean continua=true;
        // while(j<5 && continua){
        //     System.out.println(j);
        //     if(j==3){
        //         continua=false;
        //     }
        //     j++;
        // }

        // Scanner teclado = new Scanner(System.in);
        // int numero = 0;
        // do {
        //     System.out.println("Introduce un número entre 1 y 5: ");
        //     numero = teclado.nextInt();
        // }while (numero<1 || numero>5);
    

    //Bucles Anidados
        // for(int i=1; i<= 4; i++){
        //     if(i%2 == 0){
        //         for(int j= 4; j >= i; j--) {
        //             System.out.print("*");
        //         } 
        //     }
        //     System.out.println("");
            
        // }
        tablasMultiplicar();
    }

    // Tablas de multiplicar
    public static void tablasMultiplicar(){
        for(int i=1; i<=10; i++){
            System.out.println("Tabla del " + i);
            for(int j=1; j<=10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("");
        }
    }

}