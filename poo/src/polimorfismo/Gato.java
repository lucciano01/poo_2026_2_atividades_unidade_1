package polimorfismo;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miauuuuuu.....");
    }

    @Override
    public void comer() {
        System.out.println("Come ração....");
    }
}
