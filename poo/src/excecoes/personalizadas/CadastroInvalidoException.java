package excecoes.personalizadas;

public class CadastroInvalidoException extends RuntimeException {

    public CadastroInvalidoException(String message) {
        super(message);
    }
}
