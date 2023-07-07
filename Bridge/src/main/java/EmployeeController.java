import java.util.ArrayList;

public class EmployeeController {
    public static ArrayList<EmployeePOJO>fetchEmployee(){
        ArrayList<EmployeePOJO> employeeList = EmployeeService.fetchEmployee();
        return employeeList;
    }
}
