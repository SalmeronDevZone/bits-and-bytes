import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/colegio";
        String user = "AlumnoLinkia";
        String password = "passw";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión correcta a MySQL");
        } catch (SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
    }
}
