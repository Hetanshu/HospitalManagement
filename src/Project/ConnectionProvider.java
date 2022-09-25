
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Hetanshu
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); //.cj
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","madan mohan17");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
