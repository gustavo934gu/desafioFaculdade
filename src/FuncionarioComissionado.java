public class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double vendas;

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public FuncionarioComissionado(String name, String registration, double percentual, double vendas) {
        super(name, registration);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    public double calculateCommission(){
        double commission = vendas * percentual /100;
        return commission;
    }
    @Override
    public double calcularSalario(){
        return SALARIO_BASE +calculateCommission();
    }
    @Override
    public void exibirDados(){
        exibirDadosBase();
        System.out.println("Comissão: " + calculateCommission());
        System.out.println("Salário final: " + calcularSalario());
    }
}
