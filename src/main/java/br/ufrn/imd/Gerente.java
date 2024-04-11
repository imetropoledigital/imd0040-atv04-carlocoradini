package br.ufrn.imd;

public class Gerente extends Funcionario {

    public Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel) {
        super(chMensal, hh);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        return hh * chMensal + nivel.bonus;
    }

    public enum Nivel {
        JUNIOR(1000), PLENO(2000), SENIOR(3000);

        public double bonus;

        Nivel(double bonus) {
            this.bonus = bonus;
        }

    }
}
