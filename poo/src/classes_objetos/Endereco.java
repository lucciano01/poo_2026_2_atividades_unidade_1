package classes_objetos;

public class Endereco {

    String rua;
    String numero;
    String bairro;
    String cidade;
    String cep;

    @Override
    public String toString() {
        return "**Endereco**:" +
                "\nRua:"    + rua +
                "\nNumero:" + numero +
                "\nBairro:" + bairro +
                "\nCidade:" + cidade +
                "\nCep:" + cep;
    }
}
