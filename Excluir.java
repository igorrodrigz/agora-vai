import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Excluir {
    public void executar(Scanner teclado) {
        System.out.println("\n=== EXCLUIR VOLUNTÁRIO ===");
        System.out.print("ID do voluntário que deseja excluir: ");

        int id;

        try {
            id = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("O ID precisa ser um número inteiro.");
            return;
        }

        System.out.print("Confirma a exclusão? (S/N): ");
        String confirmacao = teclado.nextLine();

        if (!confirmacao.equalsIgnoreCase("S")) {
            System.out.println("Exclusão cancelada.");
            return;
        }

        String sql = "DELETE FROM voluntarios WHERE id = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int linhasExcluidas = ps.executeUpdate();

            if (linhasExcluidas > 0) {
                System.out.println("Voluntário excluído com sucesso.");
            } else {
                System.out.println("Nenhum voluntário encontrado com esse ID.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao excluir voluntário: " + e.getMessage());
        }
    }
}