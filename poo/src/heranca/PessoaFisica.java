package heranca;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, Endereco endereco, Contato contato, String cpf) {
        super(nome, endereco, contato);
        this.cpf = cpf;
    }
}
