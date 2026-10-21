import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("Digite um número para selecionar uma opção:");
        System.out.println("[1] Cadastrar Voluntários ");
        System.out.println("[2] Opção 2");
        System.out.println("[3] Opção 3");
        System.out.println("[4] Opção 4");
        System.out.println("[5] Opção 5");

        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Você selecionou a opção 1: Cadastrar Voluntários");
            // Lógica para cadastrar voluntários
        } else if (opcao == 2) {
            System.out.println("Você selecionou a opção 2");
            // Lógica para a opção 2
        } else if (opcao == 3) {
            System.out.println("Você selecionou a opção 3");
            // Lógica para a opção 3
        } else if (opcao == 4) {
            System.out.println("Você selecionou a opção 4");
            // Lógica para a opção 4
        } else if (opcao == 5) {
            System.out.println("Você selecionou a opção 5");
            // Lógica para a opção 5
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }

    }

}
