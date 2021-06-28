package br.com.gabriels.subway;

import java.util.List;

public class Lanche {
    private final Tamanho tamanho;
    private final Pao pao;
    private final Recheio recheio;
    private final Queijo queijo;
    private final List<Vegetal> vegetais;
    private final Molho molho;

    private Lanche(LanchePassoFinalBuilder lanchePassoFinalBuilder) {
        this.tamanho = lanchePassoFinalBuilder.tamanho;
        this.pao = lanchePassoFinalBuilder.pao;
        this.recheio = lanchePassoFinalBuilder.recheio;
        this.queijo = lanchePassoFinalBuilder.queijo;
        this.vegetais = lanchePassoFinalBuilder.vegetais;
        this.molho = lanchePassoFinalBuilder.molho;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "tamanho=" + tamanho +
                ", pao=" + pao +
                ", recheio=" + recheio +
                ", queijo=" + queijo +
                ", vegetais=" + vegetais +
                ", molho=" + molho +
                '}';
    }

    public static CriacaoLanchePassos.LancheBuilder umLanche(Recheio recheio, Pao pao) {
        return new LancheBuilder(recheio, pao);
    }

    private static class LancheBuilder implements CriacaoLanchePassos.LancheBuilder {
        private final Recheio recheio;
        private final Pao pao;

        public LancheBuilder(Recheio recheio, Pao pao) {
            this.recheio = recheio;
            this.pao = pao;
        }

        public CriacaoLanchePassos.LancheTerceiroPasso grande() {
            return new LancheTerceiroPassoBuilder(recheio, pao,
                    Tamanho.GRANDE);
        }

        public CriacaoLanchePassos.LancheTerceiroPasso normal() {
            return new LancheTerceiroPassoBuilder(recheio, pao,
                    Tamanho.NORMAL);
        }
    }

    private static class LancheTerceiroPassoBuilder implements CriacaoLanchePassos.LancheTerceiroPasso {
        private final Recheio recheio;
        private final Pao pao;
        private final Tamanho tamanho;

        private LancheTerceiroPassoBuilder(Recheio recheio,
                                          Pao pao,
                                          Tamanho tamanho) {
            this.recheio = recheio;
            this.pao = pao;
            this.tamanho = tamanho;
        }

        public CriacaoLanchePassos.LancheQuartoPasso comQueijo(Queijo queijo) {
            return new LancheQuartoPassoBuilder(recheio,
                    pao, tamanho, queijo);
        }
    }


    private static class LancheQuartoPassoBuilder implements CriacaoLanchePassos.LancheQuartoPasso {
        private final Recheio recheio;
        private final Pao pao;
        private final Tamanho tamanho;
        private final Queijo queijo;

        private LancheQuartoPassoBuilder(Recheio recheio,
                                        Pao pao, Tamanho tamanho,
                                        Queijo queijo) {
            this.recheio = recheio;
            this.pao = pao;
            this.tamanho = tamanho;
            this.queijo = queijo;
        }

        public CriacaoLanchePassos.LanchePassoFinal comVegetais(Vegetal... vegetais) {
            return new LanchePassoFinalBuilder(tamanho,
                    recheio, pao,
                    queijo, List.of(vegetais));
        }
    }

    private static class LanchePassoFinalBuilder implements CriacaoLanchePassos.LanchePassoFinal {
        private final Tamanho tamanho;
        private final Recheio recheio;
        private final Pao pao;
        private final Queijo queijo;
        private final List<Vegetal> vegetais;
        private Molho molho;

        private LanchePassoFinalBuilder(Tamanho tamanho,
                                       Recheio recheio, Pao pao,
                                       Queijo queijo,
                                       List<Vegetal> vegetais) {
            this.tamanho = tamanho;
            this.recheio = recheio;
            this.pao = pao;
            this.queijo = queijo;
            this.vegetais = vegetais;
        }

        public LanchePassoFinalBuilder comMolho(Molho molho) {
            this.molho = molho;
            return this;
        }

        public Lanche build() {
            return new Lanche(this);
        }
    }
}



