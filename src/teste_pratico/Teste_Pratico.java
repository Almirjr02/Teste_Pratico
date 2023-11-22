package teste_pratico;

import java.util.ArrayList;
import java.util.List;


public class Teste_Pratico {
  

       public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Secretario("Jorge Carvalho", "12/2021"));
        funcionarios.add(new Secretario("Maria Souza", "07/2017"));
        funcionarios.add(new Vendedor("Ana Silva", "03/2014"));
        funcionarios.add(new Vendedor("João Mendes", "12/2021"));
        funcionarios.add(new Gerente("Juliana Alves", "03/2014"));
        funcionarios.add(new Gerente("Bento Albino", "12/2021"));

        List<RegistrDeVendas> registros = new ArrayList<>();
        registros.add(new RegistrDeVendas("Ana Silva", "12/2021", 5200.00));
        registros.add(new RegistrDeVendas("João Mendes", "12/2021", 3400.00));
        registros.add(new RegistrDeVendas("Ana Silva", "01/2022", 4000.00));
        registros.add(new RegistrDeVendas("João Mendes", "01/2022", 7700.00));
        registros.add(new RegistrDeVendas("Ana Silva", "02/2022", 4200.00));
        registros.add(new RegistrDeVendas("João Mendes", "02/2022", 5000.00));
        registros.add(new RegistrDeVendas("Ana Silva", "03/2022", 5850.00));
        registros.add(new RegistrDeVendas("João Mendes", "03/2022", 5900.00));
        registros.add(new RegistrDeVendas("Ana Silva", "04/2022", 7000.00));
        registros.add(new RegistrDeVendas("João Mendes", "04/2022", 6500.00));

        List<Funcionario> funcionariosComBeneficios = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getTotalPago() > funcionario.getSalarioBonus()) {
                funcionariosComBeneficios.add(funcionario);
            }
        }

        // Resultado do primeiro método 01
        System.out.println("Total pago Salario e Beneficio: " + FolhaDePagamento.calcularTotalPago(funcionarios, 01, 21));

        // Resultado do segundo método 02
        int mes = 12;
        int ano = 2021;
        double totalSalariosNoMes = FolhaDePagamento.calcularTotalSalariosNoMes(funcionarios, mes, ano);
        System.out.println("Total pago em apenas salários no mês " + mes + "/" + ano + ": " + totalSalariosNoMes);

        // Resultado do terceiro método 03
        double totalBeneficios = FolhaDePagamento.calcularTotalBeneficiosNoMes(funcionariosComBeneficios, 01, 21);
        System.out.println("Total pago em benefícios no mês: " + totalBeneficios);

        // Resultado do quarto método 04
        Funcionario funcionarioComMaiorRecebimento = FolhaDePagamento.obterFuncionarioMaiorRecebimentoNoMes(funcionarios, 12, 2021);
        if (funcionarioComMaiorRecebimento != null) {
            System.out.println("Funcionário com maior recebimento no mês: " + funcionarioComMaiorRecebimento);
        } else {
            System.out.println("Nenhum funcionário encontrado.");
        }

        // Resultado no quarto método 05
        String funcionarioMaiorBeneficio = FolhaDePagamento.obterFuncionarioMaiorBeneficioNoMes(funcionariosComBeneficios, 12, 2021);
        System.out.println("Funcionário com maior benefício no mês: " + funcionarioMaiorBeneficio);

        for (Funcionario funcionarioo : funcionarios) {
            if (funcionarioo instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionarioo;
                double valorVenda = vendedor.getValorVendaNoMes(12, 2021);
                System.out.println("Vendedor: " + vendedor.getNome() + " - Valor de Venda no mês: " + valorVenda);
            }
        }
    }
} 