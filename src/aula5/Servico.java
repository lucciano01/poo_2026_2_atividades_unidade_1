package aula5;

public class Servico {

    public TipoServico tipo;
    public double valor;

    public Servico(TipoServico tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }
}