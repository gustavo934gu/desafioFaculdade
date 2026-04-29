import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();
        Funcionario f1 = new Funcionario("Gustavo","21381273","Funcionario",2000);
        Funcionario f2 = new Funcionario("Freire","21122273","Funcionario",2000);

        lista.add(f1);
        lista.add(f2);
        for (Funcionario f : lista) {
            System.out.println(f.getName() + " - Salário: " + f.calculateSalary());
        }



    }
}