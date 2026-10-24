package aula4.Collections;

import java.util.HashMap;
import java.util.Map;

public class Questao_Revisao {
    static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        ///    Chave, Valor
        map.put(123, "Joe");
        map.put(345, "João");
        map.put(678, "Mary");
        map.put(999, "Ana");
        map.put(555, "Peter");
        map.put(555, "Peter");

        System.out.println(map.get(678)); /// Mary
        System.out.println(map.size()); /// 5
    }
}
