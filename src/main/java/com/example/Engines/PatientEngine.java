package com.example.Engines;

import com.example.Beans.PatientInfoBean;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PatientEngine {
    private Queue<PatientInfoBean> patientInformationList = new LinkedList<>();
    private Set<PatientInfoBean> patientInformationCheckList = new HashSet<>();

    public boolean registerPatient(PatientInfoBean patientInfo) throws Exception {
        if(patientInformationCheckList.add(patientInfo)){
            return patientInformationList.add(patientInfo);
        }
        throw new Exception("This patient has already been registered!");
    }

    public PatientInfoBean getNextPatient(){
        PatientInfoBean patient = patientInformationList.poll();
        patientInformationCheckList.remove(patient);
        return patient;
    }

    public void readAllExistingRecords(){
        for(PatientInfoBean patient: patientInformationCheckList){
            System.out.println("Name: "+patient.getName()+" | Surname: "+patient.getSurname()+" | Age: "+patient.getAge()+" | Gender: "+patient.getGender()+" | Department: "+patient.getDepartment()+" | Appointment Day: "+patient.getAppointmentDate());
        }
    }

    public int getTotalNumberOfPatientsRegistered(){
        return patientInformationList.size();
    }
}
