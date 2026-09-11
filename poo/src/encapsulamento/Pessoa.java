package encapsulamento;


import java.util.Objects;

public class Pessoa {

   private String nome;
   private String cpf;
   private String telefone;
   private String email;
   private int idade;

   public Pessoa(){}

   public Pessoa(String nome, String cpf, String telefone, String email){
       this.nome = nome;
       this.cpf = cpf;
       this.telefone = telefone;
       this.email = email;
   }

    public Pessoa(String nome, String cpf, String telefone, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }


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

    public String getEmail() {
       if(Objects.isNull(email)){
           email =  "Email não cadastrado";
       }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nTelefone: " + telefone +
                "\nEmail: " + this.email;
    }


}
