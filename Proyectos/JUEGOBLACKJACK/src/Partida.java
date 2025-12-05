import java.util.Scanner;

public class Partida {

    private Baraja baraja;
    private Jugador jugador1;
    private Jugador jugador2;

    private int victorias1 = 0;
    private int victorias2 = 0;

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del Jugador 1: ");
        jugador1 = new Jugador(sc.nextLine(), 100);

        System.out.print("Nombre del Jugador 2: ");
        jugador2 = new Jugador(sc.nextLine(), 100);

        while (jugador1.getFondos() > 0 && jugador2.getFondos() > 0) {

            baraja = new Baraja();
            baraja.barajar();

            jugador1.limpiarMano();
            jugador2.limpiarMano();

            System.out.println("\n" + jugador1.getNombre() + " fondos: " + jugador1.getFondos() + "€");
            System.out.println(jugador2.getNombre() + " fondos: " + jugador2.getFondos() + "€");

            System.out.print("\n¿Cuánto apuesta cada uno?: ");
            int apuesta = sc.nextInt();

            while (apuesta <= 0 || apuesta > jugador1.getFondos() || apuesta > jugador2.getFondos()) {
                System.out.print("Apuesta inválida, introducir otra: ");
                apuesta = sc.nextInt();
            }

            // Repartir cartas iniciales
            repartirCartaConAs(jugador1, sc);
            repartirCartaConAs(jugador1, sc);

            repartirCartaConAs(jugador2, sc);
            repartirCartaConAs(jugador2, sc);

            // Turnos
            jugarTurno(jugador1, sc);
            jugarTurno(jugador2, sc);

            int puntos1 = jugador1.calcularPuntos();
            int puntos2 = jugador2.calcularPuntos();

           
            System.out.println("\n--- RESULTADOS ---");
            System.out.println(jugador1.getNombre() + ": " + jugador1.getMano() + " => " + puntos1);
            System.out.println(jugador2.getNombre() + ": " + jugador2.getMano() + " => " + puntos2);

            if (puntos1 > 21 && puntos2 > 21) {
                System.out.println("Ambos se pasaron. Nadie gana.");

            } else if (puntos1 > 21) {
                System.out.println(jugador2.getNombre() + " gana (el rival se pasó).");
                jugador2.ganarApuesta(apuesta, jugador1);
                victorias2++;

            } else if (puntos2 > 21) {
                System.out.println(jugador1.getNombre() + " gana (el rival se pasó).");
                jugador1.ganarApuesta(apuesta, jugador2);
                victorias1++;

            } else if (puntos1 > puntos2) {
                System.out.println(jugador1.getNombre() + " gana la ronda.");
                jugador1.ganarApuesta(apuesta, jugador2);
                victorias1++;

            } else if (puntos2 > puntos1) {
                System.out.println(jugador2.getNombre() + " gana la ronda.");
                jugador2.ganarApuesta(apuesta, jugador1);
                victorias2++;

            } else {
                System.out.println("Empate. Nadie gana dinero.");
            }
        }

        System.out.println("\n--- FIN DEL JUEGO ---");
        System.out.println("Victorias de " + jugador1.getNombre() + ": " + victorias1);
        System.out.println("Victorias de " + jugador2.getNombre() + ": " + victorias2);
    }

    private void repartirCartaConAs(Jugador jugador, Scanner sc) {
        Carta nueva = baraja.robar();
        jugador.recibirCarta(nueva);

        if (nueva.getValor().equals("A")) {
            System.out.print("\n" + jugador.getNombre() + ", te salió un As. ¿Quieres que valga 1 u 11?: ");
            int valorAs = sc.nextInt();

            while (valorAs != 1 && valorAs != 11) {
                System.out.print("Valor inválido. Introduce 1 u 11: ");
                valorAs = sc.nextInt();
            }
            jugador.asignarValorAs(valorAs);
        }
    }

    private void jugarTurno(Jugador jugador, Scanner sc) {
        System.out.println("\nTurno de " + jugador.getNombre());
        System.out.println("Mano: " + jugador.getMano() + " => " + jugador.calcularPuntos());

        boolean salir = false;

        while (jugador.calcularPuntos() < 21 && !salir) {

            System.out.print("¿Quieres otra carta " + jugador.getNombre() + "? (s/n): ");
            char opc = sc.next().toLowerCase().charAt(0);

            if (opc == 's') {
                repartirCartaConAs(jugador, sc);
                System.out.println("Nueva mano: " + jugador.getMano() + " => " + jugador.calcularPuntos());
            } else {
                salir = true;
            }
        }
    }
}
