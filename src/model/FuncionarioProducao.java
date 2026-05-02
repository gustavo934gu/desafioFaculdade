package model;

public class FuncionarioProducao extends Funcionario {
    private double precoPorItem;
    private double quantidadeProduzida;

    public FuncionarioProducao(String name, String registration, double precoPorItem, double quantidadeProduzida) {
        super(name, registration);
        this.precoPorItem = precoPorItem;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    public double calcularBonus(){
        return precoPorItem * quantidadeProduzida;
    }

    @Override
    public double calcularSalario(){
        return SALARIO_BASE + calcularBonus();
    }

    @Override
    public void exibirDados() {
        exibirDadosBase();
        System.out.println("Produtividade: " + calcularBonus());
        System.out.println("Salário final: " + calcularSalario());
    }
}
