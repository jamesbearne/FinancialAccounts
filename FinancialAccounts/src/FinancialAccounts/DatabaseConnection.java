package FinancialAccounts;
//code uses UCanAccess pure Java JDBC driver - http://ucanaccess.sourceforge.net/site.html

import java.sql.*;
    
public class DatabaseConnection {
    
    public static void main(String[] args) {
        
        int primaryKey = 2;
			
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Jbearne/Documents/02personal/CashFlow.accdb");
            System.out.println("Connection Succesful!");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT Date FROM Cash_Flow WHERE PrimaryKey = " + primaryKey);
            while (rs.next()) {
                System.out.println(rs.getString(1));
                }
            }
        catch (Exception e) {
            System.err.println("Got an exception! The ERROR is: ");
            System.err.println(e.getMessage());
            }
        }
}