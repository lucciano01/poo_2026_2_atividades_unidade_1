package heranca;

public class App {

    static void main() {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setEndereco(new Endereco("Rua J",
                "500", "Centro", "Sousa"));
        pj.setContato(new Contato("9995-2222",
                "email@email.com"));
        pj.setNome("Space X");
        pj.setCnpj("256412632452");

        PessoaFisica pf = new PessoaFisica("Jose",
                new Endereco("Rua Y",
                        "450", "Centro", "Dubai"),
                new Contato("9995-0001", "meuemail@.com"),
                "5845625479"
                );

        System.out.println(pf);
        System.out.println(pj);
    }
}
