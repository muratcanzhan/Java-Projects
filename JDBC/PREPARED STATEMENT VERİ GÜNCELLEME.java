import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/test";
        final String user = "postgres";
        final String password = "1563";
        
        String prSql = "UPDATE student SET student_name = ? WHERE id = ?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement pr = connection.prepareStatement(prSql);
           pr.setString(1,"ASD:AS:D");
           pr.setInt(2,1);
           pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
