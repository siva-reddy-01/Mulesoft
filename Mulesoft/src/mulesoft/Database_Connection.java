package mulesoft;
import java.sql.Connection;  
import java.util.*;
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Database_Connection 
{  
  
    @SuppressWarnings("resource")
	public static void main(String args[]) 
    {  
   
          
   
        try {  
        	//Scanner class
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Database name which is to be Created ");
          String mulesoftdb = sc.next();
          
            Connection con=null;
            con=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+mulesoftdb+".db");  
            if (con!= null)
            {  
                DatabaseMetaData dbm = con.getMetaData();  
                System.out.println(" Datbase Connected Suceesfully ");
                System.out.println("The driver name is " + dbm.getDriverName());  
                System.out.println("New database has been created.");  
            } 
            else
            {
            	System.out.println("Database Not Connected");
            }
   
        } 
        catch (SQLException e) 
        {  
            System.out.println(e);  
        }  
    }  
  
    
}