import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private int fondos;
    ArrayList<Carta> mano;
    private ArrayList<Integer> valoresAs; 

    public Jugador(String nombre, int fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
        this.mano = new ArrayList<>();
        this.valoresAs = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getFondos() {
        return fondos;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public void limpiarMano() {
        mano.clear();
        valoresAs.clear();
    }

    public String getMano() {
        return mano.toString();
    }

    
    public void asignarValorAs(int valor) {
        valoresAs.add(valor);
    }

    public int calcularPuntos() {
        int puntos = 0;
        int indiceAs = 0;

        for (Carta c : mano) {
            String valor = c.getValor();

            if (valor.equals("A")) {
                if (indiceAs < valoresAs.size()) {
                    puntos += valoresAs.get(indiceAs);
                    indiceAs++;
                } else {
                    puntos += 1;
                }
            }
            else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
                puntos += 10;
            }
            else {
                puntos += Integer.parseInt(valor);
            }
        }

        return puntos;
    }

    public void ganarApuesta(int apuesta, Jugador perdedor) {
        this.fondos += apuesta;
        perdedor.fondos -= apuesta;
    }
}
