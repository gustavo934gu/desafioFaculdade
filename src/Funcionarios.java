public class Funcionarios {
    private String name;
    private Long numberRegistration;
    private String tipe;

    public Funcionarios(String name, Long numberRegistration, String tipe) {
        this.name = name;
        this.numberRegistration = numberRegistration;
        this.tipe = tipe;
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
}
