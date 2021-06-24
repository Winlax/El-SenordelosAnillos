
package personajes;

import modelos.Heroe;


public class Humano extends Heroe {
    
    int vida = 180;
    int resistenciaArmadura = (int)Math.floor(Math.random()*(70-60+1)+60);

    public Humano(String nombre) {
    }

    public Humano(int vida, String nombre, int resistenciaArmadura) {
        super(vida, nombre, resistenciaArmadura);
    }
    
    
}
