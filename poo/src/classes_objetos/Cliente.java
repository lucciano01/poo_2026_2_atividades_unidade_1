package classes_objetos;

public class Cliente {

    String titular;
    String rg;
    String cpf;
    Contato contato;
    Endereco endereco;

    @Override
    public String toString() {
        return "**Cliente**: " +
                "\nTitular: " + titular +
                "\nRg: "      + rg +
                "\nCpf: "     + cpf +
                "\n"  + contato +
                "\n" + endereco;
    }
}
