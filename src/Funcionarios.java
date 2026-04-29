import java.awt.*;

public class Funcionarios {
    private String name;
    private Long numberRegistration;
    private String tipe;
    private List data;
    private double baseSalary;

    public Funcionarios(String name, Long numberRegistration, String tipe) {
        this.name = name;
        this.numberRegistration = numberRegistration;
        this.tipe = tipe;
        this.data = data;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public double calculateSalary(double baseSalary){
        return baseSalary;
    }
}
