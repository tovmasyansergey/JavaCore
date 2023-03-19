package homework.homework19.employee.storage;

import homework.homework19.employee.model.Company;
import homework.homework19.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = value;
    }

    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, size);
        employees = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public Employee getEmployeebyId(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employees[i]);
            }

        }

    }
public void searchBySalaryrange(double minPrice,double maxPrice){
    for (int i = 0; i < size; i++) {
        Employee employee = employees[i];
        if (employee.getSalary() >= minPrice &&employee.getSalary() <= maxPrice ){
            System.out.println(employee);
        }
    }
}
public void printByStatus(boolean isActive){
    for (int i = 0; i < size; i++) {
        if (employees[i].isActive() == isActive){
            System.out.println(employees[i]);
        }
    }
}

}

