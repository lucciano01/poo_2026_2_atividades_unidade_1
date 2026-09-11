package revisao;

public class OrcamentoIPI {

    private Orcamento orcamento;

    public OrcamentoIPI(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public double calcularIpi(){
        return this.orcamento.calcularImposto();
    }
}
