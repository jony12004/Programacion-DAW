
import java.util.ArrayList;

public class Jugador {
    private String nombre; 
    private ArrayList<Carta> mano;
    private int fondos = 0;
    private int puntuacion = 0;
    private int apuesta = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.fondos = 100;
        this.mano = new ArrayList<Carta>();
    }

    public void robarCarta(Baraja baraja) {
        this.mano.add(baraja.getBaraja().remove(0));
        calcularPuntuacion();
    }
    public void obtenerMano(Baraja baraja){
        this.mano.add(baraja.getBaraja().remove(0));
        this.mano.add(baraja.getBaraja().remove(0));
        calcularPuntuacion();
    }

    
    public void limpiarMano() {
        mano.clear();
    }

    
    public ArrayList<Carta> getMano() {
        return mano;
    }
    
    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public int getFondos() {
        return fondos;
    }

    public void ganarRonda(int apuesta) {
        this.fondos += apuesta;
    }

    public void perderRonda(int apuesta) {
        this.fondos -= apuesta;
    }   

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public void calcularPuntuacion() {
        int total = 0;
        int ases = 0;

        for (Carta c : mano) {
            int valor = c.getValorNumerico();
            if (c.getValor().equals("A")) ases++;  
            total += valor;
        }

        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }

        this.puntuacion = total;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", mano=").append(mano);
        sb.append(", fondos=").append(fondos);
        sb.append(", puntuacion=").append(puntuacion);
        sb.append('}');
        return sb.toString();
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }
    
}
