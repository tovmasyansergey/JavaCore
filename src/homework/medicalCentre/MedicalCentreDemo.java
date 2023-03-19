package homework.medicalCentre;

import homework.medicalCentre.model.Doctor;
import homework.medicalCentre.model.DoctorProfession;
import homework.medicalCentre.model.Patient;
import homework.medicalCentre.storage.PersonStorage;
import homework.medicalCentre.util.DateUtil;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MedicalCentreDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    public static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;

                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientByDoctor();


                    break;
                case PRINT_TODAYS_PATIENT:
                    personStorage.printTodaysPatient();
                    break;
                default:
                    System.out.println("wrong command");
            }
        }


    }

    private static void printAllPatientByDoctor() {
        personStorage.printDoctor();
        System.out.println("please choose doctor id");
        String doctorid = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if (doctorById != null) {
            personStorage.printAllPatientByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorid + "does not exsist");
        }
    }

    private static void addPatient() {
        personStorage.printDoctor();

        System.out.println("please choose doctor id");
        String doctorid = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if (doctorById != null) {
            System.out.println("please input id ,name,surname,phone,registerdatetime(26-02-2023 14:00");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvaliable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered");
                } else {
                    System.out.println("doctor is unavailable in that time,please choose anoother ");
                }
            } catch (ParseException e) {
                System.out.println("Incorect date time format, please try again");
            }


        } else {
            System.out.println("doctor with " + doctorid + "does not exsist");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctor();
        System.out.println("please choose doctor id");
        String doctorid = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if (doctorById != null) {
            System.out.println("please input id,name,surname,phonenumber,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(DoctorProfession.valueOf(doctorData[4]));
            System.out.println("doctor changed");
        } else {
            System.out.println("doctor with " + doctorid + "does not exsist");
        }

    }

    private static void deleteDoctorById() {
        personStorage.printDoctor();
        System.out.println("please choose doctor id");
        String doctorid = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorid);

        } else {
            System.out.println("doctor with " + doctorid + "does not exsist");
        }

    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);

    }

    private static void addDoctor() {
        System.out.println("please input id,name,surname,phonenumber,email,profession");
        DoctorProfession[] values = DoctorProfession.values();
        for (DoctorProfession value : values) {
            System.out.println(value);
        }
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            try {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setPhoneNumber(doctorData[3]);
                doctor.setEmail(doctorData[4]);
                doctor.setProfession(DoctorProfession.valueOf(doctorData[5]));
                personStorage.add(doctor);
                System.out.println("doctor added");
            } catch (IllegalArgumentException E) {
                System.out.println("Wrong profession");
            }
        } else {
            System.out.println("doctor with " + doctorId + "already exsist");
        }


    }
}
