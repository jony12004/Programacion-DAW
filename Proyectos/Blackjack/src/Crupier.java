
import java.util.ArrayList;

public class Crupier {
    private ArrayList<Carta> mano;

    public Crupier() {
        mano = new ArrayList<Carta>();
    }

    public void pedirMano(Baraja baraja) {
        mano.add(baraja.robarCarta());
        mano.add(baraja.robarCarta());
    }

    public int calcularPuntuacion() {
        int totalPuntos = 0;
        for (int i = 0; i< mano.size();i++) {
            totalPuntos+= mano.get(i).calcularPuntos();
        }
        return totalPuntos;
    }
}
