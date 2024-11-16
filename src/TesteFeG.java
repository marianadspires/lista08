public class TesteFeG {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("João Silva", "123.456.789-00", 3000.00);
        Funcionario func2 = new Funcionario("Maria Santos", "987.654.321-00", 3500.00);

        Gerente gerente = new Gerente("Carlos Almeida", "111.222.333-44", 5000.00, "TI");

        System.out.println("Funcionário 1:");
        func1.infoFuncionario();
        System.out.println();

        System.out.println("Funcionário 2:");
        func2.infoFuncionario();
        System.out.println();

        System.out.println("Gerente:");
        gerente.infoFuncionario();
    }
}


