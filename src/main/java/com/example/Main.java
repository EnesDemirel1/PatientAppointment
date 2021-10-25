package com.example;

import com.example.Beans.PatientInfoBean;
import com.example.Engines.PatientEngine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static PatientEngine patientEngine = new PatientEngine();
    static boolean exit = false;

    public static void main(String[] args){
        while(!exit){
            printContext();
            Scanner scanner = new Scanner(System.in);
            int inputValue = scanner.nextInt();
            takeAction(inputValue);
        }
    }

    private static void printContext(){
        System.out.println("Select what you want to do:");
        System.out.println("Press 1 for list all patients");
        System.out.println("Press 2 for get number or registered patients");
        System.out.println("Press 3 for getting next patient");
        System.out.println("Press 4 to register new patient");
        System.out.println("Press 0 to exit");
    }

    private static void takeAction(int inputValue){
        switch (inputValue){
            case 1:
                patientEngine.readAllExistingRecords();
                break;
            case 2:
                System.out.println("--------------------");
                System.out.println(patientEngine.getTotalNumberOfPatientsRegistered());
                System.out.println("--------------------");
                break;
            case 3:
                System.out.println("--------------------");
                System.out.println(patientEngine.getNextPatient().getName());
                System.out.println("--------------------");
                break;
            case 4:
                registerNewPatient();
                break;
            case 0:
                exit = !exit;
            default:
                System.out.println("--------------------");
                System.out.println(patientEngine.getNextPatient());
                System.out.println("--------------------");
                break;
        }
    }

    private static void registerNewPatient(){
        Scanner patientScanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = patientScanner.nextLine();
        System.out.println("Surname: ");
        String surname = patientScanner.nextLine();
        System.out.println("Age: ");
        String age = patientScanner.nextLine();
        System.out.println("Department: ");
        String department = patientScanner.nextLine();
        System.out.println("Gender: ");
        String gender = patientScanner.nextLine();
        System.out.println("Date: (YYYY-MM-DD Format)");
        String date = patientScanner.nextLine();

        try {
            patientEngine.registerPatient(
                    new PatientInfoBean.Builder()
                            .setName(name)
                            .setSurname(surname)
                            .setAge(Integer.parseInt(age))
                            .setDepartment(department)
                            .setGender(gender)
                            .setAppointmentDate(new SimpleDateFormat(date).format(Calendar.getInstance().getTime()))
                            .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
