package util;

import java.util.Scanner;

public class ValidarEntrada {
    // Lê uma String que só aceita letras e espaços
    public static String lerNome(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String valor = sc.nextLine().trim();
            if (valor.matches("[a-zA-ZÀ-ú ]+")) {
                return valor;
            }
            System.out.println("❌ Entrada inválida! Digite apenas letras.");
        }
    }

    // Lê um double positivo
    public static double lerDoublePositivo(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                double valor = Double.parseDouble(sc.nextLine().trim());
                if (valor >= 0) return valor;
                System.out.println("❌ O valor não pode ser negativo!");
            } catch (NumberFormatException e) {
                System.out.println("❌ Digite um número válido!");
            }
        }
    }

    // Lê um int dentro de um range
    public static int lerIntRange(Scanner sc, String mensagem, int min, int max) {
        while (true) {
            System.out.println(mensagem);
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                if (valor >= min && valor <= max) return valor;
                System.out.println("❌ Digite um valor entre " + min + " e " + max);
            } catch (NumberFormatException e) {
                System.out.println("❌ Digite um número inteiro válido!");
            }
        }
    }
}