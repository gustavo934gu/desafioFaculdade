public class FuncionarioProducao extends Funcionario {
    private double precoPorItem;
    private double quantidadeProduzida;

    public FuncionarioProducao(String name, String registration, double precoPorItem, double quantidadeProduzida) {
        super(name, registration);
        this.precoPorItem = precoPorItem;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    public double calculateBonus(){
        return precoPorItem * quantidadeProduzida;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double calcularSalario(){
        return SALARIO_BASE +calculateBonus();
    }

    @Override
    public void exibirDados() {
        exibirDadosBase();
        System.out.println("Produtividade: " + calculateBonus());
        System.out.println("Salário final: " + calcularSalario());
    }
}
