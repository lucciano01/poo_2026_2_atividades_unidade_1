package estruturas_condicionais;

import java.util.Scanner;

public class App {

    static void main() {
        boolean estaChovendo = true;

//        if(estaChovendo){
//            System.out.println("Leve um guarda chuva");
//        }

        int num1 = 1;
        int num2 = 2;
        boolean saoIguais = num1 == num2;

//        if(saoIguais){
//            System.out.println("são iguais");
//        }else{
//            System.out.println("São diferentes");
//        }



//        if(num % 3 == 0){
//            System.out.println("Múltiplo de 3");
//        }else if(num % 5 == 0){
//            System.out.println("Multiplo de 5");
//        }else {
//            System.out.println("Numero inválido!");
//        }
       // String msg = (num > 18) ? "Maior de idade" :  "Menor de idade";
//                : (num % 5 == 0) ? "Multiplo de 5";
//
//                : "Numero inválido!";

       // System.out.println(msg);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota final: ");
        int nota = sc.nextInt();

        switch (nota){
            case 4:
            case 5:
            case 6:
                System.out.println("Em recuperação");
            break;
            case 7:
            case 8:
            case 9:
                System.out.println("Aprovado!");
            break;
            case 10:
                System.out.println("Excelente!");
            break;
            default:
                System.out.println("Nota inválida!");
            break;
        }

        String menu = """
                1 - Entrar
                2 - Cadastrar Produto
                3 - Listar Produtos
                """;
        System.out.println(menu);
        System.out.print("Digite uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1 -> System.out.println("Entrar no sistema");
            case 2 -> System.out.println("Cadastrar produto");
            case 3 -> System.out.println("Listar produtos");
            default -> System.out.println("Opção Inválida!");
        }

    }
}
