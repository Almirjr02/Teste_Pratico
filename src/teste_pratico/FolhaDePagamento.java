package teste_pratico;

import java.util.List;


public class FolhaDePagamento {

    public static double calcularTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
        double totalPago = 0;

        for (Funcionario funcionario : funcionarios) {
            totalPago += funcionario.getTotalPago();
            if (funcionario instanceof Gerente gerente) {
                totalPago += gerente.getSalarioNoMes(mes, ano);
            } else if (funcionario instanceof Secretario secretario) {
                totalPago += secretario.getSalarioNoMes(mes, ano);
            } else if (funcionario instanceof Vendedor vendedor) {
                totalPago += vendedor.getSalarioNoMes(mes, ano);
            }
        }

        return totalPago;
    }
    public static double calcularTotalSalariosNoMes(List<Funcionario> funcionarios, int mes, int ano) {
        double totalSalarios = 0;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalarioNoMes(mes, ano);
        }

        return totalSalarios;
    }
    public static double calcularTotalBeneficiosNoMes(List<Funcionario> funcionarios, int mes, int ano) {
        double totalBeneficios = 0;

        for (Funcionario funcionario : funcionarios) {
            totalBeneficios += funcionario.getSalarioNoMes(mes, ano);
        }

        return totalBeneficios;
    }
    public static Funcionario obterFuncionarioMaiorRecebimentoNoMes(List<Funcionario> funcionarios, int mes, int ano) {
    Funcionario funcionarioComMaiorRecebimento = null;

    for (Funcionario funcionario : funcionarios) {
        double totalRecebido = funcionario.getSalarioNoMes(mes, ano);

        if (funcionarioComMaiorRecebimento == null || totalRecebido > funcionarioComMaiorRecebimento.getSalarioNoMes(mes, ano)) {
            funcionarioComMaiorRecebimento = funcionario;
        }
    }

    return funcionarioComMaiorRecebimento;
}
      public static String obterFuncionarioMaiorBeneficioNoMes(List<Funcionario> funcionarios, int mes, int ano) {
        double maiorBeneficio = 0;
        String nomeFuncionarioMaiorBeneficio = null;

        for (Funcionario funcionario : funcionarios) {
            double beneficioNoMes = funcionario.getSalarioNoMes(mes, ano);

            if (beneficioNoMes > maiorBeneficio) {
                maiorBeneficio = beneficioNoMes;
                nomeFuncionarioMaiorBeneficio = funcionario.getNome();
            }
        }

        return nomeFuncionarioMaiorBeneficio;
    }


}