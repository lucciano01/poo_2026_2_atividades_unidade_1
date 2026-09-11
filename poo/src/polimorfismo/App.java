package polimorfismo;

public class App {
    static void main() {

        Gato g = new Gato();
        g.comer();
        g.emitirSom();

        Cachorro c = new Cachorro();
        c.comer();
        c.emitirSom();

    }
}
