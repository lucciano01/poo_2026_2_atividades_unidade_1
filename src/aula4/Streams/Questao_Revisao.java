package aula4.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questao_Revisao {

    static void main(String[] args) {

        List<String> lista = List.of("A", "B", "A", "C", "B");

        Map<String, List<String>> map = lista.stream()
                .collect(Collectors.groupingBy(s -> s));

        System.out.println(map);

        System.out.println("[");
        map.forEach((l,q) -> {
            System.out.println(l + " = ");
            System.out.println(q.size()+",");
        });
        System.out.println("]");
    }
}
