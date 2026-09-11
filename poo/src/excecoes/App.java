package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int opcao;

        String menu = "Digite -1 para sair ou 0 para continuar...";
        while (true){
          try {
              System.out.println(menu);
              opcao = sc.nextInt();

              if(opcao == -1){
                  break;
              }

              System.out.print("Digite o primeiro número: ");
              num1 = sc.nextInt();
              System.out.print("Digite o segundo número: ");
              num2 = sc.nextInt();
              System.out.println("Resultado : " +(num1/num2));

          } catch (InputMismatchException e) {
              System.out.println("Digite um número inteiro positivo");
              sc.next();
          } catch (ArithmeticException e) {
              System.out.println("Não pode dividir por zero");
          }


        }



    }
}
