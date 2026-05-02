import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    private List<Funcionario> lista = new ArrayList<>();

    public List<Funcionario> getLista() {
        return lista;
    }

    public void cadastrarFuncionario(int opcao, Scanner sc){
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Matrícula: ");
        String registration = sc.nextLine();
        Funcionario f;
        switch (opcao){
            case 1 ->{f = new Funcionario(name,registration); lista.add(f); }
            case 2 ->{
                System.out.println("Informe valor das vendas: ");
                var sales = sc.nextDouble();
                System.out.println("Informe comissão percentual: ");
                var percentage = sc.nextDouble();
                sc.nextLine();
                f = new FuncionarioComissionado(name,registration,percentage,sales);
                lista.add(f);
            }
            case 3->{
                System.out.println("Informe valor da peça: ");
                var pricePerItem = sc.nextDouble();
                System.out.println("Informe qtde de peças: ");
                var quantityProduced = sc.nextDouble();
                sc.nextLine();
                f = new FuncionarioProducao(name,registration,pricePerItem,quantityProduced);
                lista.add(f);
            }
            default -> {
                System.out.println("Tipo invalido");
            }
        }


    }
    public void generatePaymentSheet(){
        System.out.println("Total de pessoas cadastradas: "+lista.size());
        for(Funcionario funcionario : lista){
            funcionario.exibirDados();
            System.out.println("----------------------");
        }

    }
}
