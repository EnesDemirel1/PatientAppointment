package com.example;

import com.example.Beans.PatientInfoBean;
import com.example.Engines.PatientEngine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        // Starting the Patient Engine
        PatientEngine patientEngine = new PatientEngine();

        //Adding some Patients
        try {
            patientEngine.registerPatient(
                    new PatientInfoBean.Builder()
                            .setName("John")
                            .setSurname("Doe")
                            .setAge(30)
                            .setDepartment("Urology")
                            .setGender("Male")
                            .setAppointmentDate(new SimpleDateFormat("2021-11-18").format(Calendar.getInstance().getTime()))
                            .build());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            patientEngine.registerPatient(
                    new PatientInfoBean.Builder()
                            .setName("Foo")
                            .setSurname("Bar")
                            .setAge(50)
                            .setDepartment("Cardiology")
                            .setGender("Male")
                            .setAppointmentDate(new SimpleDateFormat("2021-12-05").format(Calendar.getInstance().getTime()))
                            .build());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Total NUmber of Patients Registered: "+patientEngine.getTotalNumberOfPatientsRegistered());
        patientEngine.readAllExistingRecords();

        System.out.println(" ");
        PatientInfoBean nextpatient = patientEngine.getNextPatient();
        System.out.println("Getting Next Patient: "+nextpatient.getName()+" "+nextpatient.getSurname());
        System.out.println(" ");

        System.out.println("Total NUmber of Patients Registered: "+patientEngine.getTotalNumberOfPatientsRegistered());
        patientEngine.readAllExistingRecords();
    }

}
