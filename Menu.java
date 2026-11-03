import java.util.Scanner;

public class Menu {
    public void executar(Scanner teclado) {
        String opcao = "";

        while (!opcao.equals("0")) {
            System.out.println("\n=== SISTEMA DE VOLUNTÁRIOS ===");
            System.out.println("1 - Cadastrar voluntário");
            System.out.println("2 - Listar todos os voluntários");
            System.out.println("3 - Consultar voluntário por ID");
            System.out.println("4 - Editar voluntário");
            System.out.println("5 - Excluir voluntário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    Cadastrar cadastrar = new Cadastrar();
                    cadastrar.executar(teclado);
                    break;

                case "2":
                    Consultar consultaLista = new Consultar();
                    consultaLista.listarTodos();
                    break;

                case "3":
                    Consultar consultar = new Consultar();
                    consultar.executar(teclado);
                    break;

                case "4":
                    Editar editar = new Editar();
                    editar.executar(teclado);
                    break;

                case "5":
                    Excluir excluir = new Excluir();
                    excluir.executar(teclado);
                    break;

                case "0":
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}