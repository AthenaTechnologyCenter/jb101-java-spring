package collection.homework;

import collection.homework.util.Department;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Controller {
    public static void main(String[] args) {
        EmployeeImplement controller = new EmployeeImplement();

        // 1. instance employee in company
        List<Employee> employees = controller.mockEmployees();

        // handle employee to each department
        Map<Department, List<Employee>> company = controller.deviceEmployeeToDepartment(employees);

        // 2. show employee by department
        var department = company.get(Department.CSKH);
        System.out.println(department);

        // 3. show employee by age desc
        var companyByAgeDesc = controller.sortEmployeeByDateOfBirthAsc(company);
        System.out.println(companyByAgeDesc);

        // 4. party birthday
        var employeeInParty = controller.filterEmployeeDateOfBirthInWeek(employees, LocalDate.now());
        System.out.println(employeeInParty);

        // 5.salary after promote
        var companyAfterPromote = controller.calculateSalaryAfterPromote(company);
        System.out.println(companyAfterPromote);

        // 6. annual leave
        var annualLeaveEmployee = controller.calculateAnnualLeaveAfterYear(employees);
        System.out.println(annualLeaveEmployee);
    }
}
