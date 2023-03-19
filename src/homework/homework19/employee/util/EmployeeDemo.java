package homework.homework19.employee.util;

import homework.homework19.employee.model.Company;
import homework.homework19.employee.model.Employee;
import homework.homework19.employee.storage.CompanyStorage;
import homework.homework19.employee.storage.EmployeeStorage;
import homework.homework19.employee.util.Commands;
import homework.homework19.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();


    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("company 001", "company example", "gyumri", "123334456");
        companyStorage.add(company);
        //  employeeStorage.add(new Employee("poxos", "poxosyan", "a001", 100, company, "junior",new Date(),DateUtil.stringToDate("08/04/2022")));
        // employeeStorage.add(new Employee("martiros", "poxosyan", "a002", 200, company, "middle",new Date(),DateUtil.stringToDate("08/09/2022")));
        //employeeStorage.add(new Employee("petros", "poxosyan", "a003", 300, company, "seniyor",new Date(),DateUtil.stringToDate("08/02/2022")));
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    System.out.println("please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyStorage.getCompanyById(companyId) != null) {
                        //              employeeStorage.searchEmployeeByCompany(companyById);
                    } else {
                        System.out.println("Company does not exists");

                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    String max = scanner.nextLine();
                    String min = scanner.nextLine();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployee();
                    employeeStorage.printByStatus(true);
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployee();
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                default:
                    System.out.println("wrong command.please try again");
            }
        }
    }


    private static void addCompany() {
        System.out.println("please input id,name,address,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with" + companyId + "allready is added");
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeebyId(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee id ,or employee is active, please try again");
        } else {
            employee.setActive(true);
            System.out.println("Status changed");

        }
    }

    private static void inactivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeebyId(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee id ,or employee is inactive, please try again");
        } else {
            employee.setActive(false);
            System.out.println("Status changed");

        }
    }


    private static void changePositionByEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeebyId(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee id , please try again");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed");
        }
    }

    private static void searchEmployeeBySalaryRange() throws ParseException {
        System.out.println("please input minPrice,maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        try {
            double minPrice = Double.parseDouble(salaryRange[0]);
            double maxPrice = Double.parseDouble(salaryRange[1]);
            if (maxPrice < minPrice) {
                System.out.println("minPrice should be less then maxPrice");
                return;
            }
            employeeStorage.searchBySalaryrange(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("please try again");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please input max and min");
        }

    }
        private static void getEmployeeById () {
            System.out.println("please input employee id");
            String employeeId = scanner.nextLine();
            Employee employee = employeeStorage.getEmployeebyId(employeeId);
            if (employee == null) {
                System.out.println("employee with " + employeeId + "id does not exist");
            } else {
                System.out.println(employee);
            }
        }

        private static void addEmployee () throws ParseException {
            if (companyStorage.getSize() == 0) {
                System.out.println("please add company first");
                return;
            }
            companyStorage.print();
            System.out.println("please choose company id");
            String companyId = scanner.nextLine();
            Company companyById = companyStorage.getCompanyById(companyId);
            if (companyById != null) {
                System.out.println("Please input name,surname,employeeId,salary,company,position,registerOfDay,dateOfBirthday(15/02/2022)");
                String employeeDataStr = scanner.nextLine();
                String[] employeeData = employeeDataStr.split(",");
                String employeeId = employeeData[2];
                Employee employeeById = employeeStorage.getEmployeebyId(employeeId);
                if (employeeById == null) {
                    Employee employee = new Employee(employeeData[0], employeeData[1], employeeId,
                            Double.parseDouble(employeeData[3]), companyById, employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                    employeeStorage.add(employee);
                    //  companyById.set(companyById.get)//??
                    System.out.println("Employee was added");
                } else {
                    System.out.println("Employee with" + employeeById + " id allready exsist");
                }
                System.out.println("wrong company id");
            }
        }
    }

