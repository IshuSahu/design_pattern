import java.util.ArrayList;

public class EmployeeService {
    public static ArrayList<EmployeePOJO> fetchEmployee(){
        ArrayList<EmployeePOJO> employeeList = EmployeeDAO.fetchEmployee();
        return employeeList;
    }
}
