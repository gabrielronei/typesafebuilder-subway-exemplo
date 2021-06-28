package br.com.gabriels.subway;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lanche lanche = new Lanche(Tamanho.GRANDE, Pao.PARMESAO_OREGANO,
                Recheio.CHURRASCO, Queijo.PRATO, List.of(Vegetal.ALFACE, Vegetal.CEBOLA), Molho.CHIPOTLE);
        System.out.println(lanche);
    }
}
