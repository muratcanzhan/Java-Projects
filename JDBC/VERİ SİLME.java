import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/test";
        final String user = "postgres";
        final String password = "1563";

        String stSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";
        try {
            // Statement ile veri silme.
            Connection connection = DriverManager.getConnection(url, user, password);
           Statement st = connection.createStatement();
           st.executeUpdate(stSql);

           //PreparedStatement ile veri silme.
            PreparedStatement pr = connection.prepareStatement(prSql);
            pr.setInt(1, 3);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
