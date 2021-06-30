package br.com.gabriels.subway;

import java.util.List;

public class Lanche {
    private final Tamanho tamanho;
    private final Pao pao;
    private final Recheio recheio;
    private final Queijo queijo;
    private final List<Vegetal> vegetais;
    private final Molho molho;

    private Lanche(LancheBuilder lancheBuilder) {
        this.tamanho = lancheBuilder.tamanho;
        this.pao = lancheBuilder.pao;
        this.recheio = lancheBuilder.recheio;
        this.queijo = lancheBuilder.queijo;
        this.vegetais = lancheBuilder.vegetais;
        this.molho = lancheBuilder.molho;
    }

    public static LancheBuilder umLanche() {
        return new LancheBuilder();
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

    public static class LancheBuilder {
        private Tamanho tamanho;
        private Pao pao;
        private Recheio recheio;
        private Queijo queijo;
        private List<Vegetal> vegetais;
        private Molho molho;

        //Nao deixando chamar o construtor de fora desta classe
        private LancheBuilder() {
        }

        public LancheBuilder grande() {
            this.tamanho = Tamanho.GRANDE;
            return this;
        }

        public LancheBuilder normal() {
            this.tamanho = Tamanho.NORMAL;
            return this;
        }

        public LancheBuilder comPao(Pao pao) {
            this.pao = pao;
            return this;
        }

        public LancheBuilder comRecheio(Recheio recheio) {
            this.recheio = recheio;
            return this;
        }

        public LancheBuilder comQueijo(Queijo queijo) {
            this.queijo = queijo;
            return this;
        }

        public LancheBuilder comVegetais(Vegetal... vegetais) {
            this.vegetais = List.of(vegetais);
            return this;
        }

        public LancheBuilder comMolho(Molho molho) {
            this.molho = molho;
            return this;
        }

        public Lanche constroi() {
            return new Lanche(this);
        }
    }
}



