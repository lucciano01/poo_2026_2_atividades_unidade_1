package aula3.gabarito;


public class Guerreiro implements Personagem {

    @Override
    public void atacar() {
        System.out.println("Ataque com espada"); // Pode ser uma fala específica, ou grunido.
    }

    @Override
    public void fala(String nome) {
        System.out.println("Sou um guerreiro honrado, me chamo: "+ nome);
    }
}
