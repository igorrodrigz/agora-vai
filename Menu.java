import java.util.Scanner;
public class Menu {
    public void chama_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("Digite um número para selecionar uma opção:");
        System.out.println("[1] Cadastrar Voluntários.");
        System.out.println("[2] Listar voluntários.");
        System.out.println("[3] Consultar voluntário");
        System.out.println("[4] Editar voluntário.");
        System.out.println("[5] Excluir voluntário.");
        System.out.println("[6] Sair do sistema.");

        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Você selecionou a opção 1: Cadastrar Voluntários");
            // Lógica para cadastrar voluntários
        } else if (opcao == 2) {
            System.out.println("Você selecionou a opção 2: Listar voluntários");
            // Lógica para a opção 2
        } else if (opcao == 3) {
            System.out.println("Você selecionou a opção 3: Consultar voluntário");
            // Lógica para a opção 3
        } else if (opcao == 4) {
            System.out.println("Você selecionou a opção 4: Editar voluntário");
            // Lógica para a opção 4
        } else if (opcao == 5) {
            System.out.println("Você selecionou a opção 5: Excluir voluntário");
            // Lógica para a opção 5
        } else if (opcao == 6) {
            System.out.println("Você selecionou a opção 6: Sair do sistema");
            System.exit(0);
            // Lógica para a opção 6
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }

         scanner.close();
    }

}
// main = new classe que vc quer();