package revisao;

import java.util.Objects;

public class AppArray {

    static void main() {

        Produto [] produtos = {
                new Produto("Coca-cola", 15.50),
                new Produto("Shampoo", 84.5),
                new Produto("Biscoito", 15.8)
        };

        Produto produtoMaisCaro = new Produto();


        for(Produto p : produtos){
            if(Objects.isNull(produtoMaisCaro.getPreco())){
                produtoMaisCaro = p;
            } else if (p.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = p;
            }
        }
        System.out.println(produtoMaisCaro);


    }
}
