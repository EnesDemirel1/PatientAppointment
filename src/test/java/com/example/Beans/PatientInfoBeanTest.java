package com.example.Beans;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PatientInfoBeanTest {

    @Test(expected = Exception.class)
    public void testPastDate() throws Exception {
        new PatientInfoBean.Builder()
                .setName("John")
                .setSurname("Doe")
                .setAge(30)
                .setDepartment("Urology")
                .setGender("Male")
                //Already past date!
                .setAppointmentDate(new SimpleDateFormat("1970-11-18").format(Calendar.getInstance().getTime()))
                .build();
    }

    @Test(expected = Exception.class)
    public void testUnrealAge() throws Exception {
        new PatientInfoBean.Builder()
                .setName("John")
                .setSurname("Doe")
                //Writing unreal age!
                .setAge(300)
                .setDepartment("Urology")
                .setGender("Male")
                .setAppointmentDate(new SimpleDateFormat("2021-11-18").format(Calendar.getInstance().getTime()))
                .build();
    }

}
