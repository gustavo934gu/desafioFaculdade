public class Funcionario {

    private String name;
    private String registration;
    private double extra = 0.0;
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
    public void exibirDados() {
        System.out.println("Nome: " + name);
        System.out.println("Matrícula: " + registration);
        System.out.println("Salário Fixo: " + BASE_SALARY);
        System.out.println("Extras: "+ extra);
        System.out.println("Salário final: " + calculateSalary());
    }

}