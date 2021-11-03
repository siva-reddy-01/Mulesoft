package mulesoft;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_Creation{

    public static void main(String args[])throws Exception
    {

        try{
        	//Connection to the Database
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");  
          
           //creation of the statement
           Statement stmt = conn.createStatement();
           
           //creation of the table 
           String qry= "CREATE TABLE IF NOT EXISTS Movies (\n"+ " name text NOT NULL,\n"  + " actor text NOT NULL,\n"   + " actress text NOT NULL,\n"+ " director text NOT NULL,\n"+ " year text \n" + ");"; 
           stmt.execute(qry);
           System.out.println("Table created is Done into the database ");
            
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }   
}