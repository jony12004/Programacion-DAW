import java.util.*;

public class Baraja {

    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        generarBaraja();
    }

    private void generarBaraja() {
        String[] palos = {"Picas", "Corazones", "Tréboles", "Diamantes"};
        String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta robar() {
        return cartas.remove(0);
    }
}
