package teste_pratico;

import java.util.List;


public class Vendedor extends Funcionario {
    protected List<RegistrDeVendas> registrosDeVendas;
    

    public Vendedor(String nome, String dataContratacao) {
        super(nome, "Vendedor", dataContratacao, 12000, 1800);
        this.registrosDeVendas = registrosDeVendas;
    }
    @Override
    public double getTotalPago() {
        double total = salario + (beneficio + beneficio * 0.30);
        return total;
    }
    @Override
    public double getSalarioNoMes(int mes, int ano) {
        return salario * 0.30;
    }
    @Override
    public double getSalarioBonus() {
        return salario * 0.30;
    }
    public double getValorVendaNoMes(int mes, int ano) {
        for (RegistrDeVendas registro : registrosDeVendas) {
            if (registro.getMesAno().equals(mes + "/" + ano) && registro.getVendedor().equals(nome)) {
                return registro.getValorVenda();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Vendedor = " + nome + " - " + dataContratacao + " - " + salario;
    }
    
}