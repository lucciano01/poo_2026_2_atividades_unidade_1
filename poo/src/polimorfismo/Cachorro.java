package polimorfismo;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void comer() {
        System.out.println("Roe osso!");
    }
}
