import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class conexao {
    public static void main(String[] args)throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1","root","123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pessoa");
            while(rs.next()){
                String string = "";
                string += rs.getInt(1) + " - " + rs.getString(2);
                System.out.println(string);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}