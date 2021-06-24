package modelos;

public class Bestia extends Ente {

    protected int cantidadInstancias = 0;

    public Bestia(int vida, String nombre, int resistenciaArmadura) {
    }

    public Bestia() {
    }

    @Override
    public void Ataque(Ente peleador) {
        int ataque;
        ataque = peleador.tirarDados(1, 0);
    }

    @Override
    protected int tirarDados(int cantidadDados, int aumento) {
        int numeroDados;
        int min = 0;
        int max = 90;

        numeroDados = (int) Math.floor(Math.random() * (max - min + 1) - min);

        return numeroDados;
    }

    @Override
    public void muerto() {

    }
}
