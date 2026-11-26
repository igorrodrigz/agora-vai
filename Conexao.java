import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Conexao {

    public static Connection conectar() throws SQLException {

        Properties config = new Properties();

        try (FileInputStream arquivo = new FileInputStream("config.properties")) {

            config.load(arquivo);
        
        } catch (IOException e) {
            throw new SQLException("Erro ao carregar configurações", e);
        }

        String url = config.getProperty("db.url");
        String usuario = config.getProperty("db.user");
        String senha = config.getProperty("db.password");

        return DriverManager.getConnection(url, usuario, senha);

    }
}