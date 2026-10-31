package aula3.desafio.Jonatas;


import java.util.Scanner;

public class Goblin implements Inimigo{
    private double vida = 100;
    private String nome;
    private int forca;

    Scanner sc = new Scanner(System.in);

    public Goblin(double vida, String nome, int forca) {
        this.vida = vida;
        this.nome = nome;
        this.forca = forca;
    }

    @Override
    public void falaInimigo() {
        System.out.println("E qual e o Seu Nome Infecto Adversario");

        System.out.println("Sou Um " + this.nome + " muito Grande e Forte");
    }

    @Override
    public void atacarPersonagem(String alvo) {
        double danoAtaque = this.forca * 1.5;
        System.out.println(this.nome + " Avança com sua espada contra " + alvo + " Causando  " + danoAtaque +"HP");
    }

    @Override
    public void receberDano(double danoPosAtaquePersonagem) {
        if(this.vida <= 0){
            System.out.println(this.nome + " Ja Esta Derrotado" );
        }

        this.vida -= danoPosAtaquePersonagem;

        if (this.vida<=0){
            System.out.println(this.nome + " Recebeu Dano De " + danoPosAtaquePersonagem + " E foi Derrotado");
        }else {
            System.out.println(this.nome + " Recebeu Dano De " + danoPosAtaquePersonagem + " E Ficou Com  vida em " + this.vida + "HP");
        }
    }
}
