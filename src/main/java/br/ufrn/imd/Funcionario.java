package br.ufrn.imd;

public class Funcionario {

    public double hh;

    public int chMensal;

    public Funcionario(int chMensal, double hh) {
        this.chMensal = chMensal;
        this.hh = hh;
    }

    public double calcularSalario() {
        return hh * chMensal;
    }
}
