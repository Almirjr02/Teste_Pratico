package teste_pratico;


public class Gerente extends Funcionario {
    public Gerente(String nome, String dataContratacao) {
        super(nome, "Gerente", dataContratacao, 20000, 3000);
    }
    @Override
     public double getTotalPago() {
        return salario + beneficio;
    }
    @Override
    public double getSalarioNoMes(int mes, int ano) {
        return  salario;
    }

    @Override
    public String toString() {
        return "Gerente = " + nome + " - " + dataContratacao + "-" + salario;
    }
    
}