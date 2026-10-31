package aula3.desafio.Jonatas;

public interface Inimigo {
    default void falaInimigo(){}

    default void receberDano(double danoPosAtaquePersonagem){}

    default void atacarPersonagem(String alvo){}
}
