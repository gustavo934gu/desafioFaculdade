package service;

import model.Funcionario;
import model.FuncionarioComissionado;
import model.FuncionarioProducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    private List<Funcionario> lista = new ArrayList<>();

    public void cadastrarFuncionario(int opcao, Scanner sc){
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        if (!nome.matches("[a-zA-Z ]+")) {
            System.out.println("Nome inválido! Digite apenas letras.");
            return;
        }
        System.out.println("Matrícula: ");
        String matricula = sc.nextLine();
        Funcionario f;
        switch (opcao){
            case 1 ->{f = new Funcionario(nome,matricula); lista.add(f); }
            case 2 ->{
                System.out.println("Informe valor das vendas: ");
                var vendas = sc.nextDouble();
                if(vendas < 0){
                    System.out.println("Valor inválido!");
                    return;
                }
                System.out.println("Informe comissão percentual: ");
                var percentual = sc.nextDouble();
                sc.nextLine();
                f = new FuncionarioComissionado(nome,matricula,percentual,vendas);
                lista.add(f);
            }
            case 3->{
                System.out.println("Informe valor da peça: ");
                var precoPorItem = sc.nextDouble();
                System.out.println("Informe qtde de peças: ");
                var quantidadeProduzida = sc.nextDouble();
                sc.nextLine();
                f = new FuncionarioProducao(nome,matricula,precoPorItem,quantidadeProduzida);
                lista.add(f);
            }
            default -> {
                System.out.println("Tipo invalido");
            }
        }
        System.out.println("model.Funcionario cadastrado com sucesso!!");


    }
    public void generatePaymentSheet(){
        System.out.println("Total de pessoas cadastradas: "+lista.size());
        for(Funcionario funcionario : lista){
            funcionario.exibirDados();
            System.out.println("----------------------");
        }

    }
}
