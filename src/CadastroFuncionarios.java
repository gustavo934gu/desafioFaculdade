import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {

    public void cadastrarFuncionario(int opcao, Scanner sc){
        System.out.println("Digite o nome do Funcionario: ");
        String name = sc.nextLine();
        System.out.println("Digite a Matricula do Funcionario: ");
        String enrollment = sc.nextLine();
        Funcionario f;
        switch (opcao){
            case 1 ->{f = new Funcionario(name,enrollment); }
        }




    }
}
