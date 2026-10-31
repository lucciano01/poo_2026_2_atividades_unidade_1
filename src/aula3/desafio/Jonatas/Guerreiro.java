package aula3.desafio.Jonatas;

import java.util.Scanner;

public class Guerreiro implements Personagem,Inimigo{
    private int forca;
    private String nome;
    private double vida = 100;

    public Guerreiro(int forca, int vida) {
        this.forca = forca;
        this.vida = vida;

    }

   Scanner sc = new Scanner(System.in);

    @Override
    public void falaPersonagem() {
        System.out.print("Qual Seu Nome Isdruchilo Guerreiro: ");
        this.nome = sc.nextLine();

        System.out.println("Sou o Guerreiro MAis Forte e Habilidoso do Reino me Chamo " + this.nome);
        System.out.println();
    }

    @Override
    public void atacar(String alvo) {
        double danoAtaque = this.forca * 1.5;
        System.out.println("Guerreiro Avança com sua espada contra " + alvo + " Causando  " + danoAtaque +"HP");



    }


    @Override
    public void receberDano(double danoPosAtaque) {
        if(this.vida <= 0){
            System.out.println(this.nome + " Ja Esta Derrotado" );
        }

        this.vida -= danoPosAtaque;

        if (this.vida <=0){
            System.out.println("O Guerreiro " + this.nome + " Recebeu Dano De " + danoPosAtaque + "HP" + " E foi Derrotado");
        }else {
            System.out.println("O Guerreiro " + this.nome + " Recebeu Dano De " + danoPosAtaque + "HP" +  " E Ficou Com  vida em " + this.vida + "HP");
        }



    }
}
