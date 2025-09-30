public class Actividad1 {
    //Actividad tema 2 diapositiva 9
        //Realiza un programa que genera dos números aleatorios y devuelva el cociente....
        /*
         * Pseudocódigo
         * inicio_programa
         *      Generar numero1 aleatorio
         *      Generar numero2 aleatorio
         *      Hacer cuentas (cociente, media, potencia, raiz cuadrada)
         *      Imprimir cociente, media, potencia y raiz de cada número
         * fin_programa
         */
    public static void main(String[] args) {
    
        int min=1, max=10;
        int numero1=(int)(Math.random()*(max-min+1))+min;
        int numero2=(int)(Math.random()*(max-min+1))+min;
        //Hacer las cuentas
        double cociente=numero1/(double)numero2;
        double media=(numero1+numero2)/2.0;
        double potencia=Math.pow(numero1,numero2);
        double raiz1=Math.sqrt(numero1);
        double raiz2=Math.sqrt(numero2);
        //Sacar resultados
        System.out.println("Los números generados son: "+ numero1+" y "+numero2);
        System.out.println("El cociente es: "+cociente);
        System.out.println("La media es: "+media);
        System.out.println("El potencia es: "+potencia);
        System.out.println("El raiz cuadrada de numero1 es: "+raiz1);
        System.out.println("El raiz cuadrada de numero2 es: "+raiz2);    

    }
}