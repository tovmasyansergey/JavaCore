package homework.homework19.employee.util;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String ADD_COMPANY = "2";
    String PRINT_EMPLOYEES = "3";
    String SEARCH_EMPLOYEE_BY_ID = "4";
    String SEARCH_EMPLOYEE_BY_COMPANY_ID = "5";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "6";
    String CHANGE_EMPLOYEE_POSITION = "7";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "8";
    String INACTIVATE_EMPLOYEE_BY_ID = "9";
    String ACTIVATE_EMPLOYEE_BY_ID = "10";
    String PRINT_ALL_COMPANIES = "11";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_EMPLOYEE + " for add employee");
        System.out.println("please input " + ADD_COMPANY + "for add company");
        System.out.println("please input " + PRINT_EMPLOYEES + " for print employees");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_ID + " for search employee by id");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_COMPANY_ID + " for search employee by company name");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by range");
        System.out.println("please input " + CHANGE_EMPLOYEE_POSITION + " for change position");
        System.out.println("please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for print only active employee");
        System.out.println("please input " + INACTIVATE_EMPLOYEE_BY_ID + " for inactive employee by id");
        System.out.println("please input " + ACTIVATE_EMPLOYEE_BY_ID + " for activate employee by id");
        System.out.println("please input " + PRINT_ALL_COMPANIES + "for print all companies");
    }
}
