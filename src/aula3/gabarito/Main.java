package aula3.gabarito;

public class Main {
    static void main(String[] args) {
        Personagem Guerreiro = new Guerreiro();
        Personagem Mago = new Mago();
        Personagem Arqueiro = new Arqueiro();

        Guerreiro.fala("Pedro");
        Guerreiro.atacar();

        Mago.fala("Paulo");
        Mago.atacar();

        Arqueiro.fala("Jonatas");
        Arqueiro.atacar();

    }
}
