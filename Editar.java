import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Editar {
    public void executar(Scanner teclado) {
        System.out.println("\n=== EDITAR VOLUNTÁRIO ===");
        System.out.print("ID do voluntário que deseja editar: ");

        int id;

        try {
            id = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("O ID precisa ser um número inteiro.");
            return;
        }

        System.out.print("Novo nome completo: ");
        String nome = teclado.nextLine();

        System.out.print("Novo CPF: ");
        String cpf = teclado.nextLine();

        System.out.print("Novo município: ");
        String municipio = teclado.nextLine();

        System.out.print("Nova formação ou especialidade: ");
        String formacao = teclado.nextLine();

        System.out.print("Novo telefone: ");
        String telefone = teclado.nextLine();

        System.out.print("Novo e-mail: ");
        String email = teclado.nextLine();

        System.out.print("Nova disponibilidade (dias e turnos): ");
        String disponibilidade = teclado.nextLine();

        String sql = "UPDATE voluntarios SET nome = ?, cpf = ?, municipio = ?, "
                   + "formacao = ?, telefone = ?, email = ?, disponibilidade = ? "
                   + "WHERE id = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, municipio);
            ps.setString(4, formacao);
            ps.setString(5, telefone);
            ps.setString(6, email);
            ps.setString(7, disponibilidade);
            ps.setInt(8, id);

            int linhasAlteradas = ps.executeUpdate();

            if (linhasAlteradas > 0) {
                System.out.println("Voluntário atualizado com sucesso.");
            } else {
                System.out.println("Nenhum voluntário encontrado com esse ID.");
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível editar o voluntário.");
            System.out.println("Verifique se o CPF já pertence a outro cadastro.");
            System.out.println("Detalhe técnico: " + e.getMessage());
        }
    }
}