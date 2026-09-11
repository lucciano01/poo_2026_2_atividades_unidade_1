package excecoes.personalizadas;

public class Cadastro {

    public void cadastrar(String nome, String cpf){
        if(nome.isBlank()){
            throw new CadastroInvalidoException("O nome não pode ser nulo ou vazio");
        }

        if(nome.length() < 3){
            throw new CadastroInvalidoException("O nome não pode ser menor que 3 caracteres");
        }

        if(cpf.length() != 11){
            throw new CadastroInvalidoException("CPF inválido!");
        }

        System.out.println("Cadastro do usuário " +nome+ " - CPF: " +cpf+ " realizado com sucesso!");
    }
}
