package br.com.gabriels.subway;

import static br.com.gabriels.subway.Lanche.LancheBuilder;
import static br.com.gabriels.subway.Molho.*;
import static br.com.gabriels.subway.Pao.*;
import static br.com.gabriels.subway.Queijo.*;
import static br.com.gabriels.subway.Recheio.*;
import static br.com.gabriels.subway.Vegetal.*;

public class Main {
    public static void main(String[] args) {

        Lanche lanche = Lanche.umLanche().grande()
                .comPao(PARMESAO_OREGANO)
                .comMolho(CHIPOTLE)
                .comQueijo(PRATO)
                .comRecheio(CHURRASCO)
                .comVegetais(ALFACE, CEBOLA)
                .constroi();

        System.out.println(lanche);
    }
}
