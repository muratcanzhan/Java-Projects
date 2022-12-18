import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/test";
        final String user = "postgres";
        final String password = "1563";

        String stSql = "UPDATE student SET student_name = 'MURAT CAN' , student_class = 8 WHERE id = 1";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
            st.executeUpdate(stSql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
