package model;

public class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double vendas;

    public FuncionarioComissionado(String nome, String matricula, double percentual, double vendas) {
        super(nome, matricula);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    public double calcularComissao(){
        double comissao = vendas * percentual /100;
        return comissao;
    }
    @Override
    public double calcularSalario(){
        return SALARIO_BASE + calcularComissao();
    }
    @Override
    public void exibirDados(){
        exibirDadosBase();
        System.out.println("Comissão: " + calcularComissao());
        System.out.println("Salário final: " + calcularSalario());
    }
}
