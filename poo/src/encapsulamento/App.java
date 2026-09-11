package encapsulamento;

public class App {
    static void main() {

        Pessoa pessoa = new Pessoa("João",
                "123456", "8399994125624",
                "teste@gmail.com");

        Pessoa pessoa2 = new Pessoa("Maria",
                "456789", "83999941275425",  40);

        Pessoa pessoa3 = new Pessoa("Pedro");
        Pessoa pessoa4 = new Pessoa("Pedro");

        Pessoa pessoa5 = new Pessoa();
        pessoa5.setEmail("meuemail@com");
//        pessoa2.getEmail();
//        pessoa.getEmail();
       // System.out.println(pessoa2.getEmail());
       // pessoa.setNome("João");
        //pessoa.setCpf("14523698521");
       // pessoa.setTelefone("(83)99999-5555");

//        System.out.println("Pessoa 1: " + pessoa);
//        System.out.println("Pessoa 2: " +pessoa2);
        System.out.println("São iguais? : " +(pessoa3.equals(pessoa4)));



    }
}
