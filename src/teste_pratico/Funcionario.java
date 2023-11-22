package teste_pratico;

class Funcionario {
    protected String nome;
    protected String cargo;
    protected String dataContratacao;
    protected double salario;
    protected double beneficio;

    public Funcionario(String nome, String cargo, String dataContratacao, double salario, double beneficio) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
     public double getTotalPago() {
        return salario + beneficio;
    }
     public double getSalarioNoMes(int mes, int ano) {
        return salario;
    }
     public double getSalarioBonus() {
        return salario;
    }
     
}