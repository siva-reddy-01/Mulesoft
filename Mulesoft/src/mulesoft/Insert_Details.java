package mulesoft;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.util.*;
   
public class Insert_Details 
{  
   
    @SuppressWarnings("resource")
	public static void main(String args[])throws Exception
    {  
        
        String qry = "jdbc:sqlite:C://sqlite/Mulesoft.db";  
        Connection conn = null;  
        try 
        {  
        	//Connection to the database
            conn = DriverManager.getConnection(qry);
          
            //creation of the prepared statement
            PreparedStatement pstmt = conn.prepareStatement("insert into Movies values(?,?,?,?,?)");
            Scanner sc = new Scanner(System.in);
          
            System.out.println("Enter the Details of the Movie");
            System.out.println("Enter Movie name");
            String name = sc.next();
            System.out.println("Enter the Actor Name");
            String actor = sc.next();
            System.out.println("Enter the Actress Name");
            String actress = sc.next();
            System.out.println("Enter the Movie Director Name");
            String director = sc.next();
            System.out.println("Enter year of the Realse");
            String year_of_release = sc.next();
            
            pstmt.setString(1, name);
            pstmt.setString(2, actor);
            pstmt.setString(3, actress);
            pstmt.setString(4, director);
            pstmt.setString(5, year_of_release);
            
            pstmt.executeUpdate();
            
            System.out.println("Inserted Details Sucessfuly.. into the table ");
        }
        catch (SQLException e) 
        {  
            System.out.println(e);  
        }  
    }
}