package connecionconmysql;
import java.sql.*;
import java.sql.SQLException;
/**
 * @author chumo
 */
public class Connecionconmysql {
    public static void main(String[] args) {
        // TODO code application logic here
         //Class.forName("com.mysql.jdbc.Driver");
//        String srt="jdbc:mysql://localhost:3306/prueba","root","canelin2020";
        try{
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC","root","canelin2020");
        System.out.println("Conectado con MYsql");
        }
        catch(Exception ex){
           System.out.println("Ha ocurrido un error CRACK");
           System.out.print(ex);
        }
    }
    
}
