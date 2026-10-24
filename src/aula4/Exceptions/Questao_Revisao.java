package aula4.Exceptions;

public class Questao_Revisao {

    static void main(String[] args) {

        try {
            System.out.println("A"); /// Printou A, não tem nenhum erro
            int x = 5/0; /// Divisão por 0k, gera um erro
            System.out.println("B"); /// Pula o B, porque já ocorreu o erro
        }

        catch (ArithmeticException e) { /// Erro de divisão por 0, interrompe e vem pro catch
            System.out.println("C");
        }

        finally {
            System.out.println("D");
        }

    }
}

