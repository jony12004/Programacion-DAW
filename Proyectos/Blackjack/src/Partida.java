import java.util.Scanner;

public class Partida {

    private Baraja baraja;
    private Jugador jugador;
    private Jugador crupier;

    private int victoriasJugador = 0;
    private int victoriasCrupier = 0;

    public void iniciar() {
        Scanner consola = new Scanner(System.in);
        baraja = new Baraja();
        baraja.barajar();
        System.out.print("Introduce un nombre: ");
        String nombre = consola.next();
        jugador = new Jugador(nombre);
        System.out.print("Introduce un nombre para el crupier: ");
        String nombreCrupier = consola.next();
        crupier = new Jugador(nombreCrupier);
        boolean salir = false;
        jugador.pedirMano(baraja);
        crupier.pedirMano(baraja);
        int puntosJugador = 0;
        int puntosCrupier = 0;
        do {
            System.out.println("Cuanto quieres apostar " + jugador + "?");
            int apuesta = consola.nextInt();
            jugador.apostar(apuesta, salir);
            System.out.println("-----Tus cartas-----");
            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.println(jugador.getMano().get(i).toString());
                puntosJugador = puntosJugador + jugador.getMano().get(i).calcularPuntos();
                System.out.println(puntosJugador);
            }

            System.out.println("--Cartas Crupier--");
            for (int i = 0; i < crupier.getMano().size(); i++) {
                System.out.println(crupier.getMano().get(i).toString());
                puntosCrupier = puntosCrupier + crupier.getMano().get(i).calcularPuntos();
                System.out.println(puntosCrupier);
            }
            if(puntosCrupier == 21) {
                crupier.ganarRonda();
            }
            salir = true;
        } while (!salir);
    }
}