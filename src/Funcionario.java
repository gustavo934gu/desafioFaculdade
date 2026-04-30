public class Funcionario {

    private String name;
    private String registration;
    private String type;
    public static final double BASE_SALARY = 2000;

    public Funcionario(String name, String registration, String type) {
        this.name = name;
        this.registration = registration;
        this.type = type;
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

    public double calculateSalary() {
        return BASE_SALARY;
    }
}