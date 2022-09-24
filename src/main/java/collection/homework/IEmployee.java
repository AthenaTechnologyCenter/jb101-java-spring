package collection.homework;

import collection.homework.util.Department;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface IEmployee {
    List<Employee> mockEmployees();

    Map<Department, List<Employee>> deviceEmployeeToDepartment(List<Employee> employees);

    List<Employee> printEmployees(Map<Department, List<Employee>> company, Department department);

    Map<Department, List<Employee>> sortEmployeeByDateOfBirthAsc(Map<Department, List<Employee>> company);

    List<Employee> filterEmployeeDateOfBirthInWeek(List<Employee> employees, LocalDate moment);

    Map<Department, List<Employee>> calculateSalaryAfterPromote(Map<Department, List<Employee>> company);

    List<AnnualLeaveEmployee> calculateAnnualLeaveAfterYear(List<Employee> employees);


}
