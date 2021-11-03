package mulesoft;


import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
   
public class Select_ON_Name
{  
   
    public static void main(String args[])throws Exception
    {    
        
        try 
        {  //connection to the database
        	Connection con = null;  
            con = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter actor name");
            String actorsearch=sc.next();
         
           String qry="select * from Movies where actor=?";
            PreparedStatement pstmt=con.prepareStatement(qry);
            pstmt.setString(1,actorsearch);
           
            ResultSet rs = pstmt.executeQuery();
            
           
           
            while(rs.next()) 
            {
              String name = rs.getString(1);
              String actor= rs.getString(2);
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