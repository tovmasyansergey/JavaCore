package homework.homework19.employee.model;

import homework.homework19.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeId;
    private double salary;
    private Company company;
    private String position;
    private boolean active = true;
   // private int count;
    private Date registerDate;
    private Date dateOfBirthday;


    public Employee(String name, String surname, String employeeId, double salary, Company company, String position /*int count */, Date registerDate,Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
     //   this.count = count;
        this.registerDate = registerDate;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeId() {
        return employeeId;
    }

    public void setEmplyeeId(String emplyeeID) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getPosition() {
        return position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeId, salary, company, position, active);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active/*count == employee.count)*/ && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeId, employee.employeeId) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirthday, employee.dateOfBirthday);
    }
}
