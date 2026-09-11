package excecoes.personalizadas;

import java.util.InputMismatchException;


public class App {

    static void main() {

        Cadastro c = new Cadastro();

        try {
            c.cadastrar("Jose", "1245214785");
        }catch (InputMismatchException e){
            System.out.println("Entrada de dados invalida");
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por zero " +e.getMessage());
        }


    }
}
