package service;

import model.Funcionario;
import model.FuncionarioComissionado;
import model.FuncionarioProducao;
import util.ValidarEntrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    private List<Funcionario> lista = new ArrayList<>();

    public void cadastrarFuncionario(int opcao, Scanner sc){
        String nome = ValidarEntrada.lerNome(sc,"Nome: ");
        String matricula = lerMatricula(sc);
        Funcionario f;
        switch (opcao){
            case 1 ->{f = new Funcionario(nome,matricula); }
            case 2 ->{
                var vendas = ValidarEntrada.lerDoublePositivo(sc,"Informe valor das vendas: ");
                var percentual = ValidarEntrada.lerDoublePositivo(sc,"Informe comissão percentual: ");
                f = new FuncionarioComissionado(nome,matricula,percentual,vendas);
            }
            case 3->{
                var precoPorItem = ValidarEntrada.lerDoublePositivo(sc,"Informe valor da peça: ");
                var quantidadeProduzida = ValidarEntrada.lerDoublePositivo(sc,"Informe qtde de peças: ");
                f = new FuncionarioProducao(nome,matricula,precoPorItem,quantidadeProduzida);
            }
            default -> {
                System.out.println("Tipo invalido");
                return;
            }
        }
        lista.add(f);
        System.out.println("Funcionario cadastrado com sucesso!!");


    }
    private boolean matriculaJaExiste(String matricula){
        for(Funcionario f : lista){
            if(f.getMatricula().equalsIgnoreCase(matricula)){
                return true;
            }
        }
        return false;
    }
    private String lerMatricula(Scanner sc){
        while(true){
            System.out.println("Matrícula: ");
            String matricula = sc.nextLine().trim();

            if (!matricula.matches("[a-zA-Z0-9\\-]+")) {
                System.out.println("Matrícula inválida! Use apenas letras");
            }
            if (matriculaJaExiste(matricula)) {
                System.out.println("Matrícula já cadastrada! Digite outra.");
                continue;
            }
            return matricula;
        }
    }

    public void generatePaymentSheet(){
        if(lista.isEmpty()){
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("Total de pessoas cadastradas: "+lista.size());
        for(Funcionario funcionario : lista){
            funcionario.exibirDados();
            System.out.println("----------------------");
        }

    }
}
