package aula3.gabarito;

public interface Personagem {

    void atacar();

    default void fala(String nome) {
        System.out.println("Oi, meu nome é: " + nome);
    }
}
