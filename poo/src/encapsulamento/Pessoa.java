package encapsulamento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {

   private String nome;
   private String cpf;
   private String telefone;
   protected LocalDateTime dataNascimento;

   //get -> retornar o valor do atributo
   //set -> alterar o valor do atributo

    public String getNome() {
        if(nome == null){
           return "O nome está inválido";
        }
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 2){
            System.out.println("O nome informado está inválido");
            return;
        }
        this.nome = nome;
    }

    public String getCpf() {
        if(cpf.length() != 11){
            return "CPF inválido";
        }
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {


        if(telefone.contains("-") || telefone.contains("(") || telefone.contains(")")){
            telefone = telefone.replace("(", "")
                    .replace("-", "").replace(")", "");
            System.out.println("Telefone sem caracteres especiais:" +telefone);
        }

        this.telefone = telefone;
    }
}
