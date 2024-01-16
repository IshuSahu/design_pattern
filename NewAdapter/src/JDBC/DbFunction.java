package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunction {
    public Connection connect_to_db(String dburl, String dbUser, String dbPass) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(dburl,dbUser,dbPass);
            if(conn!=null){
                System.out.println("Connection Established!");
            }
            else{
                System.out.println("Connection failed!");
            }
        }catch(Exception e){
            System.out.println("Exception "+ e);
        }
        return conn;
    }
    public void Create_table(Connection conn, String tableName){
        Statement statement;
        try{
            String query = "create table "+ tableName + " (empid SERIAL, empname varchar(20), empaddress varchar(30), primary key(empid))";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Create........ ");

        }catch (Exception e){
            System.out.println("Exception "+ e);
        }

    }
    public void Insert_table(Connection conn, String tableName, String empName, String empaddress) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s (empName, empAddress) VALUES ('%s', '%s')", tableName, empName, empaddress);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted Successfully.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
    public void Delete_row(Connection conn, String tableName, int DelId) {
        Statement statement;
        try {
            String query = "DELETE FROM " + tableName + " WHERE empid =" + DelId;
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row deleted Successfully.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
    public void get_data(Connection conn, String tableName) {
        Statement statement;
        try {
            String query = String.format("SELECT * FROM %s", tableName);
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            // Iterate over the result set and print the data
            while (rs.next()) {
                int empid = rs.getInt("empid");
                String empname = rs.getString("empname");
                String empaddress = rs.getString("empaddress");

                System.out.println("Employee ID: " + empid +" Name: " + empname +" Address: " + empaddress);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
    public void Drop_table(Connection conn, String tableName) {
        Statement statement;
        try {
            statement = conn.createStatement();
            String query = "DROP TABLE " + tableName;
            statement.executeUpdate(query);
            System.out.println("Table dropped successfully.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}

