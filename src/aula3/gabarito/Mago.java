package aula3.gabarito;

public class Mago implements Personagem {

    @Override
    public void atacar() {
        System.out.println("Magia arcana");
    }

    @Override
    public void fala(String nome) {
        System.out.println("Sou um mago adivinhador, seu nome é: "+nome+" Correto?");
    }
}
