import java.util.ArrayList;

public class EmployeeClient {
    public static void main(String[] args) {
        ArrayList<EmployeePOJO> employeeList = EmployeeController.fetchEmployee();
        for (EmployeePOJO empPOJO : employeeList) {
            System.out.println("Employee Id : " + empPOJO.getEmpid());
            System.out.println("Employee Name : " + empPOJO.getEmpname());
            System.out.println("Employee Salary : " + empPOJO.getEmpsalary());
            System.out.println("------------------------------------------------------");
        }
    }
}
