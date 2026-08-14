package casting;

import java.util.Scanner;

public class App {
    static void main() {
//        double num = 10.5;
//        int num2 = (int)num;
//        System.out.println(num2);

        Scanner sc = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = sc.nextInt();
        System.out.println("+ , - , * , /");
        String operacao = sc.next();
        System.out.print("Num2: ");
        int num2 = sc.nextInt();

        switch (operacao) {
           case "+" -> System.out.println("A soma de " +(num1)+ " " +operacao + " " + (num2)+ " é: " +(num1+num2));
           case "-" -> System.out.println("A subtracao de " +(num1)+ " e " + (num2)+ " é: " +(num1-num2));
           case "/" -> System.out.println("A divisao de " +(num1)+ " e " + (num2)+ " é: " +(num1/num2));
           case "*" -> System.out.println("A multiplicacao de " +(num1)+ " e " + (num2)+ " é: " +(num1*num2));
        }

    }
}
