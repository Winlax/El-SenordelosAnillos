
package personajes;

import modelos.Heroe;


public class Hobbit extends Heroe{
    
    int vida = 200;
    int resistenciaArmadura = (int)Math.floor(Math.random()*(70-55+1)+55);
    int aumento;

    public Hobbit(String nombre) {
    }

    public Hobbit(int vida, String nombre, int resistenciaArmadura) {
        super(vida, nombre, resistenciaArmadura);
    }
    
    
}
