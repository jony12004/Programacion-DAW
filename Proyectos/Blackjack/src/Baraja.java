
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    ArrayList<Carta> baraja;

    public Baraja() {
        baraja = new ArrayList<Carta>();
        String[] palos = {"Diamante", "Trebol", "Corazon", "Picas"};

        for (String palo : palos) {
            for (int i = 1; i <= 13; i++) {
                baraja.add(new Carta(i, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public Carta robarCarta() {
        if((!baraja.isEmpty())){
            return baraja.remove(0);
        }
        return null;
    }


    
}
