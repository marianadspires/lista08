public class FCLT extends CFuncionario {
    private double salarioMensal;


    public FCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }


    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


    @Override
    public double calculaRendimentos() {
        return salarioMensal;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nSalário Mensal: R$" + salarioMensal +
                "\nRendimentos: R$" + calculaRendimentos();
    }
}

