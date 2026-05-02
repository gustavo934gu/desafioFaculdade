public class FuncionarioComissionado extends Funcionario {
    private double percentage;
    private double sales;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public FuncionarioComissionado(String name, String registration,double percentage, double sales) {
        super(name, registration);
        this.sales = sales;
        this.percentage = percentage;
    }

    public double calculateCommission(){
        double commission = sales*percentage/100;
        return commission;
    }
    @Override
    public double calculateSalary(){
        return BASE_SALARY+calculateCommission();
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getName());
        System.out.println("Matrícula: " + getRegistration());
        System.out.println("Salário Fixo: " + BASE_SALARY);
        System.out.println("Comissão: " + calculateCommission());
        System.out.println("Salário final: " + calculateSalary());
    }
}
