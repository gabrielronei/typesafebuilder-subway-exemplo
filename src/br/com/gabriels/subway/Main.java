package br.com.gabriels.subway;

public class Main {
    public static void main(String[] args) {
        Lanche lanche = Lanche.umLanche(Recheio.CHURRASCO, Pao.PARMESAO_OREGANO)
                .grande()
                .comQueijo(Queijo.PRATO)
                .comVegetais(Vegetal.CEBOLA, Vegetal.ALFACE)
                .comMolho(Molho.CHIPOTLE)
                .build();

        System.out.println(lanche);
    }
}
