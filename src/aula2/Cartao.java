package aula2;

public class Cartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ "+ valor +" realizado via cartão");
    }

    @Override
    public String getDescricao() {
        return "Cartão";
    }
}
