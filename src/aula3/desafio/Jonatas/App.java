package aula3.desafio.Jonatas;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        String menu = """
            1 - Usar Guerreiro
            2 - Usar Arqueiro
            3 - Usar Mago
            """;

        Scanner sc = new Scanner(System.in);

        System.out.println(menu);
        System.out.print("Com Qual Personagem Queres Lutar: ");
        int op = sc.nextInt();

        switch (op){

            case 1 -> {
                System.out.println();

                System.out.println("Guerreiro");



                Personagem guerreiro = new Guerreiro(50,100);
                Goblin goblin = new Goblin(50, "Goblin", 50);


                guerreiro.falaPersonagem();
                goblin.falaInimigo();

                System.out.println();

                goblin.atacarPersonagem("guerreiro");
                guerreiro.receberDano(75);

                System.out.println();

                guerreiro.atacar("Goblin");
                goblin.receberDano(75);




            }
            case 2 -> {
                System.out.println();

                System.out.println("Arqueiro");

                System.out.println();

                Arqueiro arqueiro = new Arqueiro(50, 100);
                Goblin goblin = new Goblin(50, "Goblin", 50);

                System.out.println("Inimigo Pergunta Pra Arqueiro");
                arqueiro.falaPersonagem();

                System.out.println();
                
                System.out.println("Arqueiro Pergunta pra inimigo");
                goblin.falaInimigo();

                System.out.println();

                System.out.println("Goblin Atacando Arqueiro");

                goblin.atacarPersonagem("Arqueiro");
                arqueiro.receberDano(75);

                System.out.println();

                System.out.println("Arqueiro Atacandon Goblin");

                arqueiro.atacar("Goblin");
                goblin.receberDano(75);


            }

            case 3 -> {
                System.out.println();

                System.out.println("Mago");

                System.out.println();

                Mago mago = new Mago(50, 100, 100);
                Goblin goblin = new Goblin(50, "Goblin", 50);

                mago.falaPersonagem();
                goblin.falaInimigo();

                System.out.println();

                goblin.atacarPersonagem("Mago");
                mago.receberDano(75);

                System.out.println();

                mago.atacar("Goblin");
                goblin.receberDano(100);
            }
        }
    }

}
