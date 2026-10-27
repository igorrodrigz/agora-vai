import java.util.Scanner;

public class Cadastro {

    private Voluntario[] voluntarios = new Voluntario[100];
    private int quantidade;

    public Cadastro() {
        quantidade = ArquivoCSV.carregar(voluntarios);
        if (quantidade > 0) {
            System.out.println("Cadastros carregados: " + quantidade);
        }
    }

    public void cadastrar(Scanner teclado) {
        if (quantidade >= voluntarios.length) {
            System.out.println("Limite de voluntários atingido.");
            return;
        }

        Voluntario voluntario = new Voluntario(
                proximoId(),
                lerObrigatorio(teclado, "Nome completo: "),
                lerObrigatorio(teclado, "CPF: "),
                lerObrigatorio(teclado, "Município: "),
                lerObrigatorio(teclado, "Área de formação/especialidade: "),
                lerOpcional(teclado, "Telefone (opcional): "),
                lerOpcional(teclado, "E-mail (opcional): "),
                lerOpcional(teclado, "Disponibilidade (opcional): ")
        );

        voluntarios[quantidade++] = voluntario;
        ArquivoCSV.salvar(voluntarios, quantidade);
        System.out.println("Voluntário cadastrado.");
    }

    public void listarTodos() {
        System.out.println("\n--- Voluntários cadastrados ---");
        if (quantidade == 0) {
            System.out.println("Nenhum voluntário cadastrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(voluntarios[i]);
            }
            System.out.println("Total: " + quantidade);
        }
    }

    private int proximoId() {
        return quantidade + 1;
    }
//obriga o usuário a digitar algo na classe Voluntario
    private String lerObrigatorio(Scanner teclado, String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = teclado.nextLine().trim();
        } while (entrada.isEmpty());
        return entrada;
    }
//permite que o usuário ignore a entrada de dados na classe Voluntarioc
    private String lerOpcional(Scanner teclado, String mensagem) {
        System.out.print(mensagem);
        return teclado.nextLine().trim();
    }
}
