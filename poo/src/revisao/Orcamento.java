package revisao;

public class Orcamento extends Imposto {

    private double valor;

    public Orcamento() {
    }

    public Orcamento(double taxa, double valor) {
        super(taxa);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularImposto(){
        return valor * super.getTaxa();
    }
}
