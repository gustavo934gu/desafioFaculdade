public class Funcionario {

    private String name;
    private String registration;
    public static final double BASE_SALARY = 2000;

    public Funcionario(String name, String registration) {
        this.name = name;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public double calculateSalary() {
        return BASE_SALARY;
    }
}