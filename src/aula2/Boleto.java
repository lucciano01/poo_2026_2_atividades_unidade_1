package aula2;

public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ "+ valor +" realizado via boleto");
    }

    @Override
    public String getDescricao() {
        return "Boleto";
    }
}
