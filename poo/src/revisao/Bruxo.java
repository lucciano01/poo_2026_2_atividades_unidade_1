package revisao;

public class Bruxo extends Personagem{
    private boolean magia;

    public Bruxo() {
    }

    public Bruxo(String nome, int vida, boolean magia) {
        super(nome, vida);
        this.magia = magia;
    }

    public boolean isMagia() {
        return magia;
    }

    public void setMagia(boolean magia) {
        this.magia = magia;
    }

    @Override
    public void atacar() {
        System.out.println(super.getNome() + " lançando bruxaria...");
    }

    @Override
    public String toString() {
        return "Bruxo{" +
                "magia=" + magia +
                ", nome='" + super.getNome() + '\'' +
                ", vida=" + super.getVida() +
                "} " ;
    }
}
