package homework.homework19.employee.storage;

import homework.homework19.employee.model.Company;
import homework.homework19.employee.model.Employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (companies.length == size) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, size);
        companies = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }

    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
    public int getSize(){
        return size;
    }
}