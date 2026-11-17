import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cadastrar {
    public void executar(Scanner teclado) {
        System.out.println("\n=== CADASTRAR VOLUNTÁRIO ===");

        System.out.print("Nome completo: ");
        String nome = teclado.nextLine();

        System.out.print("CPF: ");
        String cpf = teclado.nextLine();

        System.out.print("Município: ");
        String municipio = teclado.nextLine();

        System.out.print("Formação ou especialidade: ");
        String formacao = teclado.nextLine();

        System.out.print("Telefone: ");
        String telefone = teclado.nextLine();

        System.out.print("E-mail: ");
        String email = teclado.nextLine();

        System.out.print("Disponibilidade (dias e turnos): ");
        String disponibilidade = teclado.nextLine();

        Voluntario voluntario = new Voluntario(
            0, nome, cpf, municipio, formacao,
            telefone, email, disponibilidade
        );

        String sql = "INSERT INTO voluntarios "
                   + "(nome, cpf, municipio, formacao, telefone, email, disponibilidade) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, voluntario.getNome());
            ps.setString(2, voluntario.getCpf());
            ps.setString(3, voluntario.getMunicipio());
            ps.setString(4, voluntario.getFormacao());
            ps.setString(5, voluntario.getTelefone());
            ps.setString(6, voluntario.getEmail());
            ps.setString(7, voluntario.getDisponibilidade());

            ps.executeUpdate();

            System.out.println("Voluntário cadastrado com sucesso.");

        } catch (SQLException e) {
            System.out.println("Não foi possível cadastrar o voluntário.");
            System.out.println("Verifique a conexão e se o CPF já está cadastrado.");
            System.out.println("Detalhe técnico: " + e.getMessage());
        }
    }
}