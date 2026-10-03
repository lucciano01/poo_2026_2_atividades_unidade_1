package aula2;

//public class main extends Cachorro {
//    static void main(String[] args) {
//        Animal animal = new Cachorro();
//        animal.fazerSom();
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new Pix());
        pagamentos.add(new Pix());

        pagamentos.add(new Cartao());
        pagamentos.add(new Cartao());

        pagamentos.add(new Boleto());
        pagamentos.add(new Boleto());

        double[] valores = {
                100.00,
                150.00,
                200.00,
                300.00,
                50.00,
                80.00
        };

        double total = 0;

        for (int i = 0; i < pagamentos.size(); i++) {

            Pagamento pagamento = pagamentos.get(i);

            pagamento.pagar(valores[i]);

            total = total + valores[i];

            System.out.println("Total dos pagamentos: "+total);

            Map<String, Pagamento> pagamentosCodigo = new HashMap<>();

            pagamentosCodigo.put("PG01", new Pix());
            pagamentosCodigo.put("PG02", new Cartao());
            pagamentosCodigo.put("PG03", new Boleto());

            String codigo = "PG02";

            Pagamento pagamentoEncontrado = pagamentosCodigo.get(codigo);

            if (pagamentoEncontrado != null) {
                System.out.println("Pagamento encontrado: " + pagamentoEncontrado.getDescricao());
            } else {
                System.out.println("Pagamento não encontrado!");
            }
        }

    }
}
