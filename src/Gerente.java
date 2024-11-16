public class Gerente extends Funcionario {

        private String departamento;

        // aqui o Gerente erda os atributos do funcionario
        public Gerente(String nome, String cpf, double salario, String departamento) {
            super(nome, cpf, salario);
            this.departamento = departamento;
        }


        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        @Override
        public double getSalario() {
            return super.getSalario() * 1.20; //
        }


        public void infoGerente() {
            super. infoFuncionario();
            System.out.println("Departamento: " + departamento);
            System.out.println("Salário com acréscimo: " + getSalario());
        }
    }

