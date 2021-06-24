package modelos;

public class Heroe extends Ente {

    Heroe Heroe = new Heroe();
    protected int cantidadInstancias = 0;

    public Heroe() {

    }

    public Heroe(int vida, String nombre, int resistenciaArmadura) {

    }

    @Override
    public void muerto() {

    }

    @Override
    protected int tirarDados(int cantidadDados, int aumento) {
        int numeroDados;
        int min = 0;
        int max = 100;

        numeroDados = (int) Math.floor(Math.random() * (max - min + 1) - min);

        return numeroDados;
    }

}
