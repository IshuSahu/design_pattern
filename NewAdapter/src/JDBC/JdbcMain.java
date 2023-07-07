package JDBC;

import java.sql.Connection;

public class JdbcMain {
    public static void main(String[] args) {
        DbFunction dbf = new DbFunction();
        String dbUrl = "jdbc:postgresql://localhost:5432/Adapter";
        String dbUser ="postgres";
        String dbpass ="1234";

        Connection connection =dbf.connect_to_db(dbUrl,dbUser, dbpass);
            dbf.Create_table(connection, "employee" );
//        dbf.Insert_table(connection,"employee", "Ishu", "Delhi");
//        dbf.Insert_table(connection,"employee", "Pravin", "mumbai");
//        dbf.Insert_table(connection,"employee", "satyam", "pune");
//        dbf.Insert_table(connection,"employee", "Yash", "wardha");
//        dbf.Insert_table(connection,"employee", "Priyanka", "banglore");
//
//        dbf.Delete_row(connection ,  "employee", 1);
//          dbf.Drop_table(connection ,  "employee");
    }
}
