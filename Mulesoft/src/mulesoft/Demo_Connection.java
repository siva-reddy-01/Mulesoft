package mulesoft;
import java.sql.*;
public class Demo_Connection
{
	
	public static void main(String args[])throws Exception
	{
		try
		{
			//connection to databse
			Connection con=null;
			con=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Mulesoft.db");
			System.out.println("Connection established");
			
			if(con!=null)
			{
				System.out.println("Data base Connected");
			}
			else
			{
				System.out.println("Databse Not Connected");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
