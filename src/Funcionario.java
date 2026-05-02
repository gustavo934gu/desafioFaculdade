public class Funcionario {

    private String nome;
    private String matricula;
    private double extra = 0.0;
    public static final double SALARIO_BASE = 2000;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double calcularSalario() {
        return SALARIO_BASE;
    }
    public void exibirDadosBase() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Fixo: " + SALARIO_BASE);
    }
    public void exibirDados() {
        exibirDadosBase();
        System.out.println("Extras: "+ extra);
        System.out.println("Salário final: " + calcularSalario());
    }
}