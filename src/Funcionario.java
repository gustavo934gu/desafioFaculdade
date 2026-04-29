public class Funcionario {

    private String name;
    private String registration;
    private String type;
    protected double baseSalary;

    public Funcionario(String name, String registration, String type, double baseSalary) {
        this.name = name;
        this.registration = registration;
        this.type = type;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public String getType() {
        return type;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}