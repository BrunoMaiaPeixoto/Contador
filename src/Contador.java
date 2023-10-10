import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int parametroUm;
        int parametroDois;

        while (true) {
            try {
                parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo numero");
                parametroDois = terminal.nextInt();

                if (parametroUm > parametroDois) {
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
                } else {
                    break; // Saia do loop quando os parâmetros forem válidos
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite números inteiros.");
                terminal.nextLine(); // Limpe o buffer de entrada
            }
        }

        contar(parametroUm, parametroDois);
    }

    static void contar(int parametroUm, int parametroDois) {
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
