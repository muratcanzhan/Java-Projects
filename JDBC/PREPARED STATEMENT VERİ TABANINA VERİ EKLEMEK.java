import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/test";
        final String user = "postgres";
        final String password = "1563";

        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement prSt = connection.prepareStatement(prSql);

            prSt.setString(1, "ASD:AS:D");  //(student_name , student_class)
            prSt.setInt(2,8);   // Verileri doðru veri tipinde doðru yere yaz.
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
