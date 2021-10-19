package com.example.Beans;

public class PatientInfoBean {
    private String name_;
    private String surname_;
    private int age_;
    private String appointmentDate_;
    private String department_;
    private String gender_;

    public static class Builder{

        private String name_;
        private String surname_;
        private int age_;
        private String appointmentDate_;
        private String department_;
        private String gender_;

        public Builder(){

        }

        public Builder setName(String name) {
            name_ = name;
            return this;
        }

        public Builder setSurname(String surname) {
            surname_ = surname;
            return this;
        }

        public Builder setAge(int age_) {
            age_ = age_;
            return this;
        }

        public Builder setAppointmentDate(String appointmentDate) {
            appointmentDate_ = appointmentDate;
            return this;
        }

        public Builder setDepartment(String department) {
            department_ = department;
            return this;
        }

        public Builder setGender(String gender) {
            gender_ = gender;
            return this;
        }

        public PatientInfoBean build() throws Exception {
            try {
                checkGender();
                PatientInfoBean patientInfoBean = new PatientInfoBean();
                patientInfoBean.name_ = name_;
                patientInfoBean.surname_ = surname_;
                patientInfoBean.age_ = age_;
                patientInfoBean.appointmentDate_ = appointmentDate_;
                patientInfoBean.department_ = department_;
                patientInfoBean.gender_ = gender_;
                return patientInfoBean;
            } catch (Exception e){
                throw new Exception(e.getMessage());
            }
        }

        private boolean checkGender() throws Exception {
            if (gender_.equals("Male") || gender_.equals("Female") || gender_.equals("Other")) {
                return true;
            }

            throw new Exception("Gender should be Male, Female or Other. Nothing else is accepted.");
        }

    }

    public String getName() {
        return name_;
    }

    public String getSurname() {
        return surname_;
    }

    public int getAge() {
        return age_;
    }

    public String getAppointmentDate() {
        return appointmentDate_;
    }

    public String getDepartment() {
        return department_;
    }

    public String getGender() {
        return gender_;
    }

}
