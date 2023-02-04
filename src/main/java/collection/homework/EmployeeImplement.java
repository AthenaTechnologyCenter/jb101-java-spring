package collection.homework;

import collection.homework.util.Department;
import collection.homework.util.Position;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImplement implements IEmployee {

    @Override
    public List<Employee> mockEmployees() {
        return new ArrayList<>() {
            {
                add(new Employee("OanhPTL", "09876543221", "Hưng Yên", LocalDate.parse("1995-12-08"), 4, 2000, Department.PRODUCT, Position.DEV));
                add(new Employee("AnhDTN", "0234567", "Thai Binh", LocalDate.parse("1997-10-08"), 3, 1500, Department.SALE, Position.SALE));
                add(new Employee("ThangHT", "123384848", "Ha Noi", LocalDate.parse("1995-12-09"), 4, 2000, Department.PRODUCT, Position.DEV));
            }
        };

    }

    @Override
    public Map<Department, List<Employee>> deviceEmployeeToDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> company = new HashMap<>();
        employees.forEach(employee -> {
            if (company.containsKey(employee.getDepartment())) {
                List<Employee> empDepartment = new ArrayList<>(company.get(employee.getDepartment()));
                empDepartment.add(employee);
                company.put(employee.getDepartment(), empDepartment);
            } else {
                company.put(employee.getDepartment(), List.of(employee));
            }
        });
        return company;
    }

    @Override
    public List<Employee> printEmployees(Map<Department, List<Employee>> company, Department department) {
        return company.get(department);
    }

    @Override
    public Map<Department, List<Employee>> sortEmployeeByDateOfBirthAsc(Map<Department, List<Employee>> company) {
        var sortedCompany = new HashMap<Department, List<Employee>>();
        company.forEach(((department, employees) -> {
            sortedCompany.put(department,
                    employees.stream()
                            .sorted(Comparator.comparing(Employee::getDateOfBirth)
                                    .reversed()).collect(Collectors.toList()));
        }));
        return sortedCompany;
    }

    @Override
    public List<Employee> filterEmployeeDateOfBirthInWeek(List<Employee> employees, LocalDate moment) {
        LocalDate startWeek = LocalDate.of(moment.getYear(), moment.getMonth(), 6 - 2 - 1);
        LocalDate endWeek = LocalDate.of(moment.getYear(), moment.getMonth(), 6 + 7 - 2 + 1);
        List<Employee> employeesInBirthDayParty = new ArrayList<>();
        employees.forEach(employee -> {
            var dateOfBirth = employee.getDateOfBirth();
            var employeeDateOfBirthCurrentYear = LocalDate.of(moment.getYear(), dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
            if (employeeDateOfBirthCurrentYear.isAfter(startWeek) && employeeDateOfBirthCurrentYear.isBefore(endWeek)) {
                employeesInBirthDayParty.add(employee);
            }
        });
        return employeesInBirthDayParty;
    }

    @Override
    public Map<Department, List<Employee>> calculateSalaryAfterPromote(Map<Department, List<Employee>> company) {
        var employeeAfterPromote = new HashMap<Department, List<Employee>>();
        company.forEach(((key, value) -> {
            int size = value.size(); // 2
            employeeAfterPromote.put(
                    key,
                    value.stream().peek(employee -> {
                                if (employee != null) {
                                    employee.setSalary(employee.getSalary() * (1 + (double) 10 / size));
                                }

                            })
                            .collect(Collectors.toList()));
        }));
        return employeeAfterPromote;
    }


    @Override
    public List<AnnualLeaveEmployee> calculateAnnualLeaveAfterYear(List<Employee> employees) {
        var annualLeaveEmployees = employees.stream()
                .map(employee ->
                        new AnnualLeaveEmployee(employee.getName(), calculateAnnualLeave(employee.getSeniority()))).collect(Collectors.toList());
        return annualLeaveEmployees;
    }

    private int calculateAnnualLeave(int seniority) {
        if (seniority < 2) return 12;
        if (seniority < 4) return 13;
        if (seniority < 6) return 15;
        if (seniority < 10) return 18;
        return 23;
    }

}
