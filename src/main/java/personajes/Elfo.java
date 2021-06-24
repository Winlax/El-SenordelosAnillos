
package personajes;

import modelos.Ente;
import modelos.Heroe;


public class Elfo extends Heroe {
    
    int vida = 250;
    int resistenciaArmadura = (int)Math.floor(Math.random()*(70-50+1)+50);
    int aumento;
    

    public Elfo(String nombre) {
        
    }

    public Elfo(int vida, String nombre, int resistenciaArmadura) {
        super(vida, nombre, resistenciaArmadura);
    }
    
    
    @Override
    public int getModificacionAtaque(Ente peleador) {
        
        return 0;
        
    }
    
}
