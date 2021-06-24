
package modelos;

import java.util.Objects;


public class Ente {

    Ente Ente = new Ente();

    private int vida;
    private String nombre;
    private int resistenciaArmadura;

    protected int LIMITESUPERIORATAQUE;
    protected int CANTIDADDADOS;

    private String[] figuraBestia;
    private String[] figuraMuerto;
    private String[] figuraHeroe;

    public Ente(int vida, String nombre, int resistenciaArmadura) {
        this.vida = vida;
        this.nombre = nombre;
        this.resistenciaArmadura = resistenciaArmadura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.vida;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.resistenciaArmadura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ente other = (Ente) obj;
        if (this.vida != other.vida) {
            return false;
        }
        if (this.resistenciaArmadura != other.resistenciaArmadura) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getResistenciaArmadura() {
        return resistenciaArmadura;
    }

    public void setResistenciaArmadura(int resistenciaArmadura) {
        this.resistenciaArmadura = resistenciaArmadura;
    }

    public void Ataque(Ente enemigo) {
        
    }
    
    public int getAleatorio() {
        
    }
    
}
