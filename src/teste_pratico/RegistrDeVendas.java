package teste_pratico;


public class RegistrDeVendas {
    protected String vendedor;
    protected String mesAno;
    protected double valorVenda;

    public RegistrDeVendas(String vendedor, String mesAno, double valorVenda) {
        this.vendedor = vendedor;
        this.mesAno = mesAno;
        this.valorVenda = valorVenda;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}