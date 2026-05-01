import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        CadastroFuncionarios sistema = new CadastroFuncionarios();
        while (true){
            System.out.println("""
        
                Sistema cadastro de Funcionarios:
                1 - Cadastrar
                2 - Listar
                3 - Sair
        
        """);
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                    System.out.println("""
                        Escolha o tipo:
                        1 - Padrão
                        2 - Comissionado
                        3 - Produção
                    """);
                    int type = sc.nextInt();
                    sc.nextLine();
                    sistema.cadastrarFuncionario(type,sc);
                    return;
                }

            }


        }
    }
}