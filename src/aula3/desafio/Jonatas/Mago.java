package aula3.desafio.Jonatas;

import java.util.Scanner;

public class Mago implements Personagem{
    private String nome;
    private int poder;
    private int mana;
    private double vida = 100;

    Scanner sc = new Scanner(System.in);

    public Mago( int poder, int mana, double vida) {
        this.poder = poder;
        this.mana = mana;
        this.vida = vida;
    }

    @Override
    public void falaPersonagem() {
        System.out.print("Qual Seu Nome Isdruchilo Mago: ");
        this.nome = sc.nextLine();

        System.out.println("Sou Um Mago das Trevas Muito Poderoso me Chamo " + this.nome);
    }

    @Override
    public void atacar(String alvo) {
        if (this.mana >= 10){

            this.mana -= 10;

            int dano = this.poder * 2;
            System.out.println(this.nome + " lança uma bola de fogo em " + alvo + "Causando " + dano + " de dano magico " + " mana Restante Apos Ataque " + this.mana);
        }else{
            System.out.println(this.nome + " Tentou Conjurar um feitiço em " + alvo + " mais esta sem mana ");
        }
    }

    @Override
    public void receberDano(double danoPosAtaque) {

        if(this.vida <= 0){
            System.out.println(this.nome + " Ja Esta Derrotado" );
        }

        this.vida -= danoPosAtaque;

        if (this.vida<=0){
            System.out.println("O Mago " + this.nome + " Recebeu Dano De " + danoPosAtaque + " E foi Derrotado");
        }else {
            System.out.println("O Mago " + this.nome + " Recebeu Dano De " + danoPosAtaque + " E Ficou Com  vida em " + this.vida + "HP");
        }



    }
}
