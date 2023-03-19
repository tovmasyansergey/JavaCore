package homework.medicalCentre;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TODAYS_PATIENT = "7";


    static void printCommand() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_DOCTOR + " for add doctor");
        System.out.println("please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search by profession");
        System.out.println("please input " + DELETE_DOCTOR_BY_ID + " for delete doctor by id");
        System.out.println("please input " + CHANGE_DOCTOR_BY_ID + " for change doctor by id");
        System.out.println("please input " + ADD_PATIENT + " for add patient");
        System.out.println("please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for print all patient by doctor");
        System.out.println("please input " + PRINT_TODAYS_PATIENT + " for print todays patient");
    }
}
