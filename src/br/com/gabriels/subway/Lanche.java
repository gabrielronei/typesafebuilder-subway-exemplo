package br.com.gabriels.subway;

import java.util.List;

public class Lanche {
    private final Tamanho tamanho;
    private final Pao pao;
    private final Recheio recheio;
    private final Queijo queijo;
    private final List<Vegetal> vegetais;
    private final Molho molho;

    public Lanche(Tamanho tamanho, Pao pao, Recheio recheio, Queijo queijo, List<Vegetal> vegetais, Molho molho) {
        this.tamanho = tamanho;
        this.pao = pao;
        this.recheio = recheio;
        this.queijo = queijo;
        this.vegetais = vegetais;
        this.molho = molho;
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
}



