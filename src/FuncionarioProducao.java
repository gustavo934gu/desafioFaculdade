public class FuncionarioProducao extends Funcionario {
    private double pricePerItem;
    private double quantityProduced;

    public FuncionarioProducao(String name, String registration, String type, double baseSalary,double pricePerItem, double quantityProduced) {
        super(name, registration, type, baseSalary);
        this.pricePerItem = pricePerItem;
        this.quantityProduced = quantityProduced;
    }
    public double calculateBonus(){
        return pricePerItem * quantityProduced;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(double quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    @Override
    public double calculateSalary(){
        return baseSalary+calculateBonus();
    }
}
