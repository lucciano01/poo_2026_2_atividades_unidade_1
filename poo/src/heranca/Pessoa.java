package heranca;

public class Pessoa {

    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Pessoa() {
    }

    public Pessoa(String nome, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
