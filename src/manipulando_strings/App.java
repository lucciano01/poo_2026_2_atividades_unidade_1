package manipulando_strings;

public class App {
    static void main() {
        String a  = "José";
        String b  = "JOSé";

       // System.out.println(a == b);
       // System.out.println(a.equals(b));
       // System.out.println(a.equalsIgnoreCase(b));
       // System.out.println(a.length());
        //System.out.println(a.charAt(0));
        //funcao que verifica se existe um ou mais caracteres dentro de uma string
        //System.out.println(a.contains("sé"));
        String firstName = "Maria";
        String lastName =  "da Silva";
       // String mensagem = "Olá " + firstName + " " + lastName + "!";

//        String mensagem = "Olá ".concat(firstName)
//                .concat(" ").concat(lastName).concat("!");

        String mensagem =  "";

        for (int i = 0;  i < 1000; i++){
            mensagem  += i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0;  i < 1000; i++){
            sb.append(i);
        }
        String resultado = sb.toString();
        System.out.println(resultado);



        System.out.println(mensagem);



    }
}
