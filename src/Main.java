import service.CadastroFuncionarios;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        CadastroFuncionarios sistema = new CadastroFuncionarios();
        while (true){
            System.out.println("""
        
                Sistema cadastro de Funcionarios:
                0 - Sair do Programa
                1 - Cadastrar Funcionário Padrão
                2 - Cadastrar Funcionário Comissionado
                3 - Cadastrar Funcionário Produção
                4 - Gerar Folha de Pagamento
        
        """);
            opcao = sc.nextInt();
            switch(opcao){

                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }

                case 1, 2, 3 -> {
                    sc.nextLine();
                    sistema.cadastrarFuncionario(opcao, sc);
                }

                case 4 -> {
                    sistema.generatePaymentSheet();
                }

                default -> System.out.println("Opção inválida");
            }

            }


        }
    }