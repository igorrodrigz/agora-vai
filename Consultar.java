import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultar {
    public void listarTodos() {
        System.out.println("\n=== LISTA DE VOLUNTÁRIOS CADASTRADOS ===");

        String sql = "SELECT * FROM voluntarios ORDER BY id";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            boolean encontrou = false;

            while (rs.next()) {
                encontrou = true;
                System.out.println("\n------------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("CPF: " + rs.getString("cpf"));
                System.out.println("Município: " + rs.getString("municipio"));
                System.out.println("Formação: " + rs.getString("formacao"));
                System.out.println("Telefone: " + rs.getString("telefone"));
                System.out.println("E-mail: " + rs.getString("email"));
                System.out.println("Disponibilidade: "
                                   + rs.getString("disponibilidade"));
            }

            if (!encontrou) {
                System.out.println("Nenhum voluntário cadastrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar voluntários: " + e.getMessage());
        }
    }

    public void executar(Scanner teclado) {
        System.out.println("\n=== CONSULTAR VOLUNTÁRIO ===");
        System.out.print("ID do voluntário: ");

        int id;

        try {
            id = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("O ID precisa ser um número inteiro.");
            return;
        }

        String sql = "SELECT * FROM voluntarios WHERE id = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("\n--- DADOS DO VOLUNTÁRIO ---");
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Nome: " + rs.getString("nome"));
                    System.out.println("CPF: " + rs.getString("cpf"));
                    System.out.println("Município: " + rs.getString("municipio"));
                    System.out.println("Formação: " + rs.getString("formacao"));
                    System.out.println("Telefone: " + rs.getString("telefone"));
                    System.out.println("E-mail: " + rs.getString("email"));
                    System.out.println("Disponibilidade: "
                                       + rs.getString("disponibilidade"));
                } else {
                    System.out.println("Nenhum voluntário encontrado com esse ID.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar voluntário: " + e.getMessage());
        }
    }
}