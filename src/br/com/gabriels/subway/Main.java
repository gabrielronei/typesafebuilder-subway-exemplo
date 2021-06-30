package br.com.gabriels.subway;

import static br.com.gabriels.subway.Molho.CHIPOTLE;
import static br.com.gabriels.subway.Pao.PARMESAO_OREGANO;
import static br.com.gabriels.subway.Queijo.PRATO;
import static br.com.gabriels.subway.Recheio.CHURRASCO;
import static br.com.gabriels.subway.Vegetal.*;

public class Main {
    public static void main(String[] args) {
        Lanche lanche = Lanche.umLanche(CHURRASCO, PARMESAO_OREGANO)
                .grande()
                .comQueijo(PRATO)
                .comVegetais(ALFACE, CEBOLA)
                .comMolho(CHIPOTLE)
                .build();

        System.out.println(lanche);
    }
}
