package collection.homework;

import collection.homework.util.Department;
import collection.homework.util.Position;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String mobilePhone;
    private String address;
    private LocalDate dateOfBirth;
    private int seniority;
    private double salary;
    private Department department;
    private Position position;

    public Employee() {
    }

    public Employee(String name, String mobilePhone, String address, LocalDate dateOfBirth,
                    int seniority, double salary, Department department, Position position) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.seniority = seniority;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public Employee setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public int getSeniority() {
        return seniority;
    }

    public Employee setSeniority(int seniority) {
        this.seniority = seniority;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Employee setDepartment(Department department) {
        this.department = department;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public Employee setPosition(Position position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", mobilePhone:'" + mobilePhone + '\'' +
                ", address:'" + address + '\'' +
                ", dateOfBirth:" + dateOfBirth +
                ", seniority:" + seniority +
                ", salary:" + salary +
                ", department:" + department +
                ", position:" + position +
                '}' + '\n';
    }
}
