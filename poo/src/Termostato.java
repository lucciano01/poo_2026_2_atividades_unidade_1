import java.util.Scanner;

public class Termostato {

    static void main() {

        String modo = "";
        int temperatura;
        String opcao = "";

        Scanner sc = new Scanner(System.in);

        String menu = """
                + : Resfriar
                - : Aquecer
                0 : Desligar
                Selecione uma opcao:
                """;
        do{
            opcao = sc.next();
            System.out.print(menu);
            if(opcao.equals("0")){
                break;
            }
            System.out.print("Digite a temperatura : ");
            temperatura = sc.nextInt();
            if(temperatura < 16 || temperatura > 30){
                System.out.println("A temperatura não pode ser alterada");
                return;
            }else{
                System.out.print("Digite o modo:");
                modo = sc.next();
                if(modo.equals("-")){
                    System.out.println("Temperatura atual: "+temperatura);
                    System.out.println("Modo resfriar acionado: "+(temperatura--));
                    System.out.println("Temperatura atual: "+temperatura);
                } else if (modo.equals("+")) {
                    System.out.println("Temperatura atual: "+temperatura);
                    System.out.println("Modo resfriar acionado: "+(temperatura++));
                    System.out.println("Temperatura atual: "+temperatura);
                }
            }



        }while (!opcao.equals("0"));
    }
}
