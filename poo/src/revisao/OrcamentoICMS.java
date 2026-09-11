package revisao;

public class OrcamentoICMS {

    private Orcamento orcamento;

    public OrcamentoICMS(Orcamento orcamento){
       this.orcamento = orcamento;
    }

    public double calcularIcms(){
        return orcamento.calcularImposto();
    }
}
