package teste_pratico;


public class Secretario extends Funcionario{
    
    public Secretario(String nome, String dataContratacao) {
        super(nome, "Secretário", dataContratacao, 7000, 1000);
    }
    
    @Override
     public double getTotalPago() {
        double total = salario + (beneficio + beneficio * 0.20);
        return total;
    }
    @Override
    public double getSalarioNoMes(int mes, int ano) {
        return salario * 0.20;
    }
    
    @Override
    public double getSalarioBonus() {
        return salario * 0.20;
    }


    @Override
    public String toString() {
        return "Secretario = " + nome + " - " + dataContratacao + " - " + salario;
    }
    
}