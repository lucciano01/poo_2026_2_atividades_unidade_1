package entrada_dados_scanner;

public class App {

    static void main(String[] args) {

        String nome = null;
        System.out.println(nome);
        String vazio = "teste";
        //System.out.println(vazio.length());


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite uma palavra: ");
//       // String value = sc.next();
//        char letra = sc.next().charAt(2);
//        System.out.println(letra);
//        System.out.print("Digite o primeiro numero: ");
//        int num1 = sc.nextInt();
//        System.out.print("Digite o segundo numero: ");
//        int num2 = sc.nextInt();
//        System.out.print("Digite seu nome:");
//        String name = sc.next();

      //  int resultado = somar(num1, num2);
       // System.out.println(resultado);
       // System.out.println("Seja Bem vindo " +name);
//        subtrair(10, 5);
       // validateNumber(10);
    }

    public static int somar(int a , int b){
        return a + b;
    }

    public static void subtrair(int c, int d){
        System.out.println(c - d);
    }

    public static void validateNumber(int number){
        if(number > 5){
            System.out.println(number);
            return;
        }
        System.out.println("Sem o return essa linha sempre será impressa!");
    }


}
