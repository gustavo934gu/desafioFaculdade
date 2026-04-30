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

    public FuncionarioComissionado(String name, String registration, String type, double baseSalary, double percentage, double sales) {
        super(name, registration, type, baseSalary);
        this.sales = sales;
        this.percentage = percentage;
    }

    public double calculateCommission(){
        double commission = sales*percentage/100;
        return commission;
    }
    @Override
    public double calculateSalary(){
        return baseSalary+calculateCommission();
    }
}
