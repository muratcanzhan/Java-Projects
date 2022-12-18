import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/test";
        final String user = "postgres";
        final String password = "1563";

        String sql = "SELECT * FROM employee";
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('MRT',5)" ;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
            System.out.println(st.executeUpdate(insertSql));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}