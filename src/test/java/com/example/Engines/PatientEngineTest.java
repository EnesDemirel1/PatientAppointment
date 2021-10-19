package com.example.Engines;

import com.example.Beans.PatientInfoBean;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientEngineTest{

    private static PatientEngine patientEngine;
    private static PatientInfoBean patient1;
    private static PatientInfoBean patient2;

    @BeforeClass
    public static void createEngine(){
        patientEngine = new PatientEngine();
        try {
            patient1 = new PatientInfoBean.Builder()
                    .setName("John")
                    .setSurname("Doe")
                    .setAge(30)
                    .setDepartment("Urology")
                    .setGender("Male")
                    .setAppointmentDate(new SimpleDateFormat("2021-11-18").format(Calendar.getInstance().getTime()))
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
                    patient2 = new PatientInfoBean.Builder()
                            .setName("Foo")
                            .setSurname("Bar")
                            .setAge(50)
                            .setDepartment("Cardiology")
                            .setGender("Female")
                            .setAppointmentDate(new SimpleDateFormat("2021-12-05").format(Calendar.getInstance().getTime()))
                            .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testARegisterEngine(){
        try {
            Assert.assertTrue(patientEngine.registerPatient(patient1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBGetTotalNumberOfPatientsRegistered(){
        Assert.assertEquals(1, patientEngine.getTotalNumberOfPatientsRegistered());
    }

    @Test
    public void testCGetNextPatient(){
        Assert.assertEquals(patientEngine.getNextPatient(), patient1);
    }

}
