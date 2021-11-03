package mulesoft;


import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
   
public class Select_Details
{  
   
    public static void main(String args[])throws Exception
    {    
        
        try 
        {  //connection to the databse
        	Connection conn = null;  
            conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            
            //creation of the statement
            Statement stmt = conn.createStatement();
            
            // select the Records from the table 
            ResultSet rs = stmt.executeQuery("select * from Movies");
            System.out.println("Details of the Movies\n");
           
            while(rs.next()) 
            {
              String name = rs.getString(1);
              String actor = rs.getString(2);
              String actress = rs.getString(3);
              String director = rs.getString(4);
              String year = rs.getString(5);
              System.out.println("Movie name :"+name+"\nActor :"+actor+"\nActress: "+actress+"\nDirector :"+director+"\nYear: "+year+"\n");
            }
                
        }
        catch (SQLException e)
        {  
            System.out.println(e);  
        }  
    }
}