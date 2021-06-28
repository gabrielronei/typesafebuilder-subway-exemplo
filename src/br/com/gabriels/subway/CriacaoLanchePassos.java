package br.com.gabriels.subway;

public interface CriacaoLanchePassos {

    interface LancheBuilder {
        LancheTerceiroPasso grande();
        LancheTerceiroPasso normal();
    }

    interface LancheTerceiroPasso {
        LancheQuartoPasso comQueijo(Queijo queijo);
    }

    interface LancheQuartoPasso {
        LanchePassoFinal comVegetais(Vegetal... vegetais);
    }

    interface LanchePassoFinal {
        LanchePassoFinal comMolho(Molho molho);
        Lanche build();
    }
}
