public class Personaje {
    private String nombre;
    private Tipo tipo;
    private int vida;
    private int ataque;
    private int defensa;

    public Personaje(String nombre, int vida,Tipo tipo,int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public void atacar(Personaje enemigo) {
        int danio = this.ataque - enemigo.defensa;
        if(danio < 0) danio = 0;
        enemigo.recibirDanio(danio);
    }

    public void recibirDanio(int danio) {
        this.vida -= danio;
        if(vida<= 0) vida = 0;
    }

    public boolean estaVivo() {
        if(this.getVida() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personaje{");
        sb.append("nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", vida=").append(vida);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append('}');
        return sb.toString();
    }





    



}