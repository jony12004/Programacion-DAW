import java.util.Scanner;



public class Condicional {
    public static void main(String[] args) {
        //Manejo de if-else
        // int user=19;
        // if (user < 18){
        //     System.out.println("User es muy joven");
        // }
        // else{
        //     System.out.println("User mayor de edad");
        // }
        // //Operador ternario
        // int a=19;
        // System.out.println(a<18 ? "User es muy joven" : "User es mayor de edad");
        
        //Comprobar si un número es divisible por 2 y por 3
        // Si numero%2 es 0 Y numero%3 es 0 entonces
        //     escribir numero es divisible por 2 y 3
        // Sino 
        //     escribir no es divisible por 2 y 3
        // fin_Si
        // int numero=6;
        // if(numero%2==0 && numero%3==0){
        //     System.out.println("El número "+numero+" es divisible por 2 y 3");
        // }
        // else{
        //     System.out.println("El número "+numero+" no es divisible por 2 y 3");
        // }


        /*
         * Si numero%2=0 entonces
         *  Si numero%3=0 entonces
         *      escribe Es divisible por 2 y 3;
         *  Si no entonces
         *      escribe No es divisible por 2 y 3
         *  fin_si
         * fin_si
         */
        // if(numero%2==0){
        //     if(numero%3==0){
        //         System.out.println("El número "+numero+" es divisible por 2 y 3");
        //     }
        //     else{
        //         System.out.println("El número "+numero+" no es divisible por 2 y 3");
        //     }
        // }

        //Solicita un número e indica el nombre del mes correspondiente
        //Código para ver la diferencia de uso de if-else con switch
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero=teclado.nextInt();
        // if(numero==1){
        //     System.out.println("ENERO");
        // }
        // else if (numero==2){
        //     System.out.println("FEBRERO");
        // }
        // else if (numero==3){
        //     System.out.println("MARZO");
        // }
        // else if (numero==4){
        //     System.out.println("ABRIL");
        // }
        // else if (numero==5){
        //     System.out.println("MAYO");
        // }
        // else if (numero==6){
        //     System.out.println("JUNIO");
        // }
        // else if (numero==7){
        //     System.out.println("JULIO");
        // }
        // else if (numero==8){
        //     System.out.println("AGOSTO");
        // }
        // else if (numero==9){
        //     System.out.println("SEPTIEMBRE");
        // }
        // else if (numero==10){
        //     System.out.println("OCTUBRE");
        // }
        // else if (numero==11){
        //     System.out.println("NOVIEMBRE");
        // }
        // else if (numero==12){
        //     System.out.println("DICIEMBRE");
        // }
        // else{
        //     System.out.println("Valor incorrecto");
        // }

        //Vamos a hacerlo todo con un switch
        switch(numero){
            case 1: System.out.println("ENERO");break;
            case 2: System.out.println("FEBRERO");break;
            case 3: System.out.println("MARZO");break;
            case 4: System.out.println("ABRIL");break;
            case 5: System.out.println("MAYO");break;
            case 6: System.out.println("JUNIO");break;
            case 7: System.out.println("JULIO");break;
            case 8: System.out.println("AGOSTO");break;
            case 9: System.out.println("SEPTIEMBRE");break;
            case 10: System.out.println("OCTUBRE");break;
            case 11: System.out.println("NOVIEMBRE");break;
            case 12: System.out.println("DICIEMBRE");break;
            default: System.out.println("Valor incrorrecto");break;
        }
    }
}