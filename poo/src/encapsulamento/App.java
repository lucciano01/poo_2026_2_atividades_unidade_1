package encapsulamento;

public class App {
    static void main() {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("14523698521");
        pessoa.setTelefone("(83)99999-5555");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " +pessoa.getCpf());
        System.out.println("Telefone: " +pessoa.getTelefone());
    }
}
