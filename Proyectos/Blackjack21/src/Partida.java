import java.util.Scanner;

public class Partida {
    private Baraja baraja = new Baraja();
    private Jugador jugador;
    private Jugador crupier = new Jugador("Crupier");
    private Scanner consola = new Scanner(System.in);
    private int contadorVictoriasJugador = 0;
    private int contadorVictoriasCrupier = 0;

    public void IniciarJuego() {
        baraja.mezclar();
        asignarNombre();

        int contadorRondas = 1;

        while (jugador.getFondos() > 0) {

            limpiarManoAmbos();
            
            apostar();
            obtenerManoAmbos();

            System.out.println("\n--- RONDA " + contadorRondas + " ---");

            rondas();
            resolverGanador();

            contadorRondas++;
        }

        System.out.println("\nEl juego ha terminado. Fondos insuficientes para continuar.");
        System.out.println("Victorias " + jugador.getNombre() + ": " + contadorVictoriasJugador);
        System.out.println("Victorias Crupier: " + contadorVictoriasCrupier);
    }


    
    public void rondas() {
        turnoJugador();
        turnoCrupier();
    }

    public void turnoJugador() {
        boolean turnoTerminado = false;

        while (!turnoTerminado) {
            mostrarManoYPuntuacion(jugador);

            if (jugador.getPuntuacion() >= 21) {
                turnoTerminado = true;
            }

            System.out.print("¿Quieres carta " + jugador.getNombre() + "? (s/n): ");
            char robar = consola.next().toLowerCase().charAt(0);

            if (robar == 's') {
                jugador.robarCarta(baraja);
                if (jugador.getPuntuacion() >= 21) {
                    mostrarManoYPuntuacion(jugador);
                    turnoTerminado = true;
                }
            } else if (robar == 'n') {
                turnoTerminado = true;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }

    public void turnoCrupier() {
        System.out.println("\nTURNO DEL CRUPIER");
        mostrarManoYPuntuacion(crupier);

        while (crupier.getPuntuacion() < jugador.getPuntuacion() && crupier.getPuntuacion() < 17) {
            System.out.println("El crupier roba una carta...");
            crupier.robarCarta(baraja);
            mostrarManoYPuntuacion(crupier);
        }

        if (crupier.getPuntuacion() > 21) {
            System.out.println("El crupier se pasa de 21.");
        } else {
            System.out.println("El crupier se planta.");
        }
    }

    public void resolverGanador() {
        int puntosJ = jugador.getPuntuacion();
        int puntosC = crupier.getPuntuacion();
        int apuestaJ = jugador.getApuesta();

        System.out.println("\n--- RESULTADO DE LA RONDA ---");
        mostrarManoYPuntuacion(jugador);
        mostrarManoYPuntuacion(crupier);

        if (puntosJ > 21 && puntosC > 21) {
            System.out.println("Ambos se pasaron. Nadie gana ni pierde dinero.");
        }

        if (puntosJ > 21) {
            System.out.println(jugador.getNombre() + " se pasa de 21. Pierde la ronda.");
            contadorVictoriasCrupier++;
        }

        if (puntosC > 21) {
            System.out.println("El crupier se pasa de 21. ¡Ganas la ronda!");
            jugador.ganarRonda(apuestaJ);
            contadorVictoriasJugador++;
        }

        if (puntosJ > puntosC) {
            System.out.println("¡" + jugador.getNombre() + " gana la ronda!");
            jugador.ganarRonda(apuestaJ);
            contadorVictoriasJugador++;
            puntosC = 0;
        } else if(puntosC > puntosJ) {
            System.out.println("Gana el crupier.");
            jugador.perderRonda(apuestaJ);
            contadorVictoriasCrupier++;
        } else {
            System.out.println("Empate. No se mueve el dinero.");
        }
    }

    public void mostrarManoYPuntuacion(Jugador jug) {
        System.out.print(jug.getNombre() + " tiene: ");
        System.out.print(jug.getMano() + " ");
        System.out.print("(" + jug.getPuntuacion() + " puntos)");
        System.out.println();
    }

    public void limpiarManoAmbos() {
        jugador.limpiarMano();
        crupier.limpiarMano();
    }

    public void apostar() {
        boolean salirJugador = false;
        while (!salirJugador) {
            System.out.println("Fondos de " + jugador.getNombre() + ": " + jugador.getFondos());
            System.out.print("¿Cuánto quieres apostar " + jugador.getNombre() + "? ");
            jugador.setApuesta(consola.nextInt());

            if (jugador.getFondos() < jugador.getApuesta()) {
                System.out.println("No tienes suficientes fondos.");
            } else {
                salirJugador = true;
            }
        }
    }

    public void obtenerManoAmbos() {
        jugador.obtenerMano(baraja);
        crupier.obtenerMano(baraja);
    }

    public void asignarNombre() {
        System.out.print("Introduce un nombre: ");
        String nombre = consola.nextLine();
        jugador = new Jugador(nombre);
    }
}
