import java.util.Scanner;
public class Menu {
    public void chama_menu(){
        int opcao = 0;
    do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("Digite um número para selecionar uma opção:");
        System.out.println("[1] Cadastrar Voluntários.");
        System.out.println("[2] Listar voluntários.");
        System.out.println("[3] Consultar voluntário");
        System.out.println("[4] Editar voluntário.");
        System.out.println("[5] Excluir voluntário.");
        System.out.println("[6] Sair do sistema.");

        if (scanner.hasNextInt()) {
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println ("test 1");
                    break;
                case 2:
                    System.out.println ("test 2");
                    break;
                case 3:
                    System.out.println ("test 3");
                    break;
                case 4:
                    System.out.println ("test 4");
                    break;
                case 5:
                    System.out.println ("test 5");
                    break;
                case 6:
                    System.out.println ("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite um número válido.");
                    break;
            }

    } else {
        System.out.println("Erro: Ops! Opção inválida. Por favor, digite um número válido.");
        scanner.nextLine();
        opcao = -1;
    }
} while (opcao != 6);

}

} 
// main = new classe que vc quer();