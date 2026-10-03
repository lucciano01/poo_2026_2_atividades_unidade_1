package aula2;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ "+ valor +" realizado via PIX");
    }

    @Override
    public String getDescricao() {
        return "PIX";
    }
}
