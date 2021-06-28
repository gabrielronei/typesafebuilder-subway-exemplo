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

    public static LancheBuilder umLanche(Recheio recheio, Pao pao) {
        return new LancheBuilder(recheio, pao);
    }

    public static class LancheBuilder {
        private final Recheio recheio;
        private final Pao pao;

        public LancheBuilder(Recheio recheio, Pao pao) {
            this.recheio = recheio;
            this.pao = pao;
        }

        public LancheTerceiroPassoBuilder grande() {
            return new LancheTerceiroPassoBuilder(recheio, pao,
                    Tamanho.GRANDE);
        }

        public LancheTerceiroPassoBuilder normal() {
            return new LancheTerceiroPassoBuilder(recheio, pao,
                    Tamanho.NORMAL);
        }
    }

    static class LancheTerceiroPassoBuilder {
        private final Recheio recheio;
        private final Pao pao;
        private final Tamanho tamanho;

        public LancheTerceiroPassoBuilder(Recheio recheio,
                                          Pao pao,
                                          Tamanho tamanho) {
            this.recheio = recheio;
            this.pao = pao;
            this.tamanho = tamanho;
        }

        public LancheQuartoPassoBuilder comQueijo(Queijo queijo) {
            return new LancheQuartoPassoBuilder(recheio,
                    pao, tamanho, queijo);
        }
    }


    static class LancheQuartoPassoBuilder {
        private final Recheio recheio;
        private final Pao pao;
        private final Tamanho tamanho;
        private final Queijo queijo;

        public LancheQuartoPassoBuilder(Recheio recheio,
                                        Pao pao, Tamanho tamanho,
                                        Queijo queijo) {
            this.recheio = recheio;
            this.pao = pao;
            this.tamanho = tamanho;
            this.queijo = queijo;
        }

        public LanchePassoFinalBuilder comVegetais(Vegetal... vegetais) {
            return new LanchePassoFinalBuilder(tamanho,
                    recheio, pao,
                    queijo, List.of(vegetais));
        }
    }

    static class LanchePassoFinalBuilder {
        private final Tamanho tamanho;
        private final Recheio recheio;
        private final Pao pao;
        private final Queijo queijo;
        private final List<Vegetal> vegetais;
        private Molho molho;

        public LanchePassoFinalBuilder(Tamanho tamanho,
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



