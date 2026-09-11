package revisao;

public class Imposto {

    private double taxa;

    public Imposto() {
    }

    public Imposto(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
