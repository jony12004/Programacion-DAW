import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> baraja;
    
    public Baraja() {
        String[] palos = {"Diamante", "Corazon", "Picas", "Trebol"};
        baraja = new ArrayList<Carta>();
        for (String palo : palos) {
            for (int i = 0; i < 13; i++) {
                baraja.add(new Carta(i+1, palo));
            }
        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
    
    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void mezclar() {
        Collections.shuffle(baraja);
    }    

    @Override
    public String toString() {
        return "Baraja [baraja=" + baraja + "]";
    }


}
