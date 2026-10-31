package aula3.desafio.Jonatas;

import java.util.Scanner;

public class Arqueiro  implements Personagem{
    private int flecha;
    private String nome;
    private double vida = 100;

    public Arqueiro(int flecha, double vida) {
        this.flecha = flecha;
        this.vida = vida;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void falaPersonagem() {
        System.out.print("Qual Seu Nome Isdruchilo Arqueiro : ");
        this.nome = sc.nextLine();

        System.out.println("Sou Um Arqueiro Com a Mira Mais sertera do Reino me Chamo " + this.nome);
        System.out.println();
    }

    @Override
    public void atacar(String alvo) {
        if (this.flecha >= 10){
            this.flecha -= 1;

            double danoflecha = 2.5 * 30;

            System.out.println("O arqueiro " + this.nome + " Lança uma Flecha No Alvo " + alvo + " Causando Dano De " + danoflecha+"HP");
        }else{
            System.out.println("O Arqueiro " + this.nome + " Armou o Arco Pra Atirar mais noa tinha Flecha");
        }
    }

    @Override
    public void receberDano(double danoPosAtaque) {
        if(this.vida <= 0){
            System.out.println(this.nome + " Ja Esta Derrotado" );
        }

        this.vida -= danoPosAtaque;

        if (this.vida<=0){
            System.out.println("O Arqueiro " + this.nome + " Recebeu Dano De " + danoPosAtaque + " E foi Derrotado");
        }else {
            System.out.println("O Arqueiro " + this.nome + " Recebeu Dano De " + danoPosAtaque + " E Ficou Com  vida em " + this.vida + "HP");
        }
    }
}




