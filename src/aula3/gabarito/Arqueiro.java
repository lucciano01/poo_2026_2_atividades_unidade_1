package aula3.gabarito;

import java.util.Scanner;

public class Arqueiro implements Personagem {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void atacar() {
        System.out.println("Atira uma flecha");
    }

    @Override
    public void fala(String nome) {
        System.out.println("Sou um arqueiro muito preciso, meu nome é: "+ nome + " e o seu? ");
        String nome2 = scanner.nextLine();
        System.out.println("Ok, "+nome2+ " Boa sorte na sua caminhada.");
    }
}
