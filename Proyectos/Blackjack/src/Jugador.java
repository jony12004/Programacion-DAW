
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int fondos;
    private ArrayList<Carta> mano = new ArrayList<Carta>();

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.fondos = 100;
    }

    public void pedirMano(Baraja baraja) {
        mano.add(baraja.robarCarta());
        mano.add(baraja.robarCarta());
    }

    public void apostar(int apuesta, boolean ganar) {
        if(apuesta < this.fondos){
            if(ganar) {
                ganarRonda(apuesta);
            } else if(!ganar){
                perderRonda(apuesta);
            }
        }
    }
    public void ganarRonda(int apuesta) {
        this.fondos = this.fondos + apuesta;
    }

    public void perderRonda(int apuesta) {
        this.fondos = this.fondos - apuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }



    
}
