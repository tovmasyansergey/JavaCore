package homework.homework19.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeStorage employeeStorage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun){
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add employee");
            System.out.println("please input 2 for print all employee");
            System.out.println("please input 3 for search employee by employe ID");
            System.out.println("please input 4 for search employee by company name");
            String coommand = scanner.nextLine();
            switch (coommand){
                case "0":{
                    isRun = false;
                    break;
                }
                case "1":{
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input your ID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("please input your salary");
                    String  salary = scanner.nextLine();
                    System.out.println("please input company");
                    String company = scanner.nextLine();
                    System.out.println("please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name,surname,emplyeeID,Double.parseDouble(salary),company,position);
                    employeeStorage.add(employee);
                    System.out.println("employe is add");
                    break;

                }
                case "2":{
                    employeeStorage.print();
                    break;
                }
                case "3":{
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchbyId(keyword);
                    break;
                }
                case "4":{
                    System.out.println("please input keyword of company");
                    String keywordd = scanner.nextLine();
                    employeeStorage.searchbycompany(keywordd);
                }
            }
        }
    }
}
