package aula5;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String nome;
    private String cpf;
    private List<Servico> servicos;

    public User(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.servicos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    // metódo necessário para user ter serviços e poder printar.
    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }
}