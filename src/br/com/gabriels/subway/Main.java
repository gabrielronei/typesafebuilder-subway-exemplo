package br.com.gabriels.subway;

import static br.com.gabriels.subway.Pao.*;
import static br.com.gabriels.subway.Queijo.*;
import static br.com.gabriels.subway.Recheio.*;
import static br.com.gabriels.subway.Vegetal.*;

public class Main {
    public static void main(String[] args) {
        Lanche lanche = Lanche.umLanche(CHURRASCO, PARMESAO_OREGANO)
                .grande()
                .comQueijo(PRATO)
                .comVegetais(CEBOLA, ALF    ACE)
                .comMolho(Molho.CHIPOTLE)
                .build();

        System.out.println(lanche);
    }
}
