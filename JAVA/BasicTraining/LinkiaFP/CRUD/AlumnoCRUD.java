import java.sql.*;

public class AlumnoCRUD {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/colegio";
    private static final String USER = "AlumnoLinkia";
    private static final String PASS = "passw";

    public static void insertarAlumno(String nombre, int edad, int id_clase, String telefono) throws SQLException {
        String sql = "INSERT INTO Alumno (nombre, edad, id_clase, telefono) VALUES (?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, edad);
            ps.setInt(3, id_clase);
            ps.setString(4, telefono);
            ps.executeUpdate();
            System.out.println("Alumno insertado");
        }
    }

    public static void modificarAlumno(int id, String nombre, int edad, int id_clase, String telefono) throws SQLException {
        String sql = "UPDATE Alumno SET nombre=?, edad=?, id_clase=?, telefono=? WHERE id_alumno=?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, edad);
            ps.setInt(3, id_clase);
            ps.setString(4, telefono);
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("Alumno modificado");
        }
    }

    public static void eliminarAlumno(int id) throws SQLException {
        String sql = "DELETE FROM Alumno WHERE id_alumno=?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Alumno eliminado");
        }
    }

    public static void consultarAlumnos() throws SQLException {
        String sql = "SELECT id_alumno, nombre, edad, id_clase, telefono FROM Alumno";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id_alumno") + " " + rs.getString("nombre") + " " + rs.getInt("edad") + " " + rs.getInt("id_clase") + " " + rs.getString("telefono"));
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        insertarAlumno("Juan", 16, 1, "600123456");
        insertarAlumno("María", 17, 2, "600654321");
        consultarAlumnos();
        modificarAlumno(1, "Juan Carlos", 17, 1, "600987654");
        consultarAlumnos();
        eliminarAlumno(2);
        consultarAlumnos();
    }
}
