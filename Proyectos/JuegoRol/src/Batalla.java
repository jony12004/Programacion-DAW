import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {
    static ArrayList<Personaje> orcos = new ArrayList<>();
    static ArrayList<Personaje> heroes = new ArrayList<>();
    
    static Scanner consola = new Scanner(System.in);

    public void menu() {
        boolean salir = false;
        do{
        System.out.print("""
                1. Crear Personaje
                2. Iniciar Batalla
                3. Mostrar Listas
                4. Salir
                Introduce una opcion:""");
        int opcion = consola.nextInt();
        switch (opcion) {
            case 1: 
                crearPersonaje();
                break;
            case 2:
                iniciaBatalla();
                break;
            case 3:
                mostrarListas();
                break;
            case 4:
                salir = true;
                break;

            }
        }while (!salir);
    }

    public static void mostrarListas() {
        if(heroes.isEmpty() && orcos.isEmpty()) {
            System.out.println("Las listas de heroes y orcos estan vacias");
            
        }else {
            System.out.println("---------MOSTRAR HEROES--------");
            for (int i = 0; i < heroes.size(); i++) {
                System.out.println(heroes.get(i));
            }

            System.out.println("---------MOSTRAR ORCOS--------");
            for (int i = 0; i < orcos.size(); i++) {
                System.out.println(orcos.get(i));
            }
        }
    }

    public static void crearPersonaje() {
        System.out.print("Introduce un nombre: ");
        String nombre = consola.next();
        System.out.print("Introduce tipo: ");
        String nombreTipo = consola.next();
        Tipo tipo = Tipo.valueOf(nombreTipo.toUpperCase());
        System.out.print("Introduce vida: ");
        int vida = Integer.parseInt(consola.next());
        System.out.print("Introduce ataque: ");
        int ataque = Integer.parseInt(consola.next());
        System.out.print("Introduce defensa: ");
        int defensa = Integer.parseInt(consola.next());
        Personaje p = new Personaje(nombre, vida, tipo, ataque, defensa);
        if(tipo.equals(Tipo.ORCO)) {
            orcos.add(p);
        }
        else{
            heroes.add(p);
        }
    }

    public static void iniciaBatalla() {
        if(heroes.isEmpty()) {
            System.out.println("Debes añadir un heroe(caballero/mago)");
        } else if(orcos.isEmpty()){
            System.out.println("Debes agregar un orco");
        }else {
    
            while (!heroes.isEmpty() && !orcos.isEmpty()) {
                Personaje h = heroes.get((int)(Math.random() * heroes.size()));
                Personaje o = orcos.get((int)(Math.random() * orcos.size()));

                System.out.println("\n--- ENFRENTAMIENTO ---");
                System.out.println("Héroe:  " + h);
                System.out.println("Orco:   " + o);

                h.atacar(o);
                o.atacar(h);

                System.out.println("Después del ataque:");
                System.out.println(h);
                System.out.println(o);
                

                if (!h.estaVivo()) {
                    System.out.println("El héroe " + h.getNombre() + " ha muerto.");
                    heroes.remove(h);
                }
                if (!o.estaVivo()) {
                    System.out.println("El orco " + o.getNombre() + " ha muerto.");
                    orcos.remove(o);
                }
            }
            System.out.println("\n===== FIN DE LA BATALLA =====");

            if (heroes.isEmpty() && orcos.isEmpty()) {
                System.out.println("Empate: ¡todos han muerto!");
            }
            else if (heroes.isEmpty()) {
                System.out.println("Los ORCOS han ganado la guerra.");
            }
            else {
                System.out.println("Los HÉROES han ganado la guerra.");
            }

            System.out.println("\n--- ESTADO FINAL DE LAS LISTAS ---");
            mostrarListas();
        }
    }
}
