package classes_objetos;

public class Contato {
    String telefone;
    String email;

    @Override
    public String toString() {
        return "**Contato**: " +
                "\nTelefone:" + telefone +
                "\nEmail:" + email;
    }
}
