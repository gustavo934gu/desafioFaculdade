import service.CadastroFuncionarios;
import util.ValidarEntrada;

import java.util.Scanner;

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

            opcao = ValidarEntrada.lerIntRange(sc,"Escolha uma opcão: ", 0,4);

            switch(opcao){

                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }
                case 1, 2, 3 -> {
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