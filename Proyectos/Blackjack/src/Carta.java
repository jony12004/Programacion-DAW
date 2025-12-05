public class Carta{
    private String valor;
    private String palo;

    public Carta(int val, String palo) {
        switch (val) {
            case 1: this.valor = "A";break;
            case 11: this.valor = "J";break;
            case 12: this.valor = "Q";break;
            case 13: this.valor = "K";break;
            default:
            this.valor = String.valueOf(val);
        }
        this.palo = palo;
    }

    public int calcularPuntos() {
        if(this.valor.equals("A")){// Corregir cuanto puede valer A
            return 1;
        }
        if(this.valor.equals("J") || this.valor.equals("Q") || this.valor.equals("K")){
            return 10;
        }
        return Integer.parseInt(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta " + valor + " de " + palo;
    }

    



}