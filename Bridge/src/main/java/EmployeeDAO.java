import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {
    public static ArrayList<EmployeePOJO> fetchEmployee(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bridge","postgres","postgres");
            String query = "Select * from employee";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<EmployeePOJO> employeeList = new ArrayList<>();
            while (resultSet.next()){
                int empid = resultSet.getInt(1);
                String empname = resultSet.getString(2);
                double empsalary = resultSet.getDouble(3);
                EmployeePOJO employeePOJO = new EmployeePOJO(empid, empname, empsalary);
                employeeList.add(employeePOJO);
            }
            return employeeList;
        }catch (Exception e){
            System.out.println("Error : " + e);
        }
        return null;
    }
}
