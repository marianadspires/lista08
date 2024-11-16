public class TesteFHeFCLT {

    public static void main(String[] args) {

        FCLT funcionarioCLT = new FCLT("Ana Silva", "123.456.789-00", 3500.00);


        FHorista funcionarioHorista = new FHorista("Carlos Pereira", "987.654.321-00", 75.00, 160);


        System.out.println("Funcionário CLT:");
        System.out.println(funcionarioCLT);
        System.out.println();

        System.out.println("Funcionário Horista:");
        System.out.println(funcionarioHorista);
    }
}

