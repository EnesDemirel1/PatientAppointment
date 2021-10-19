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
            name_ = capitalizeFirstLetter(name);
            return this;
        }

        public Builder setSurname(String surname) {
            surname_ = capitalizeFirstLetter(surname);
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
            department_ = capitalizeFirstLetter(department);
            return this;
        }

        public Builder setGender(String gender) {
            gender_ = capitalizeFirstLetter(gender);
            return this;
        }

        public PatientInfoBean build(){
            //conflict
            PatientInfoBean patientInfoBean = new PatientInfoBean();
            patientInfoBean.name_ = name_;
            patientInfoBean.surname_ = surname_;
            patientInfoBean.age_ = age_;
            patientInfoBean.appointmentDate_ = appointmentDate_;
            patientInfoBean.department_ = department_;
            patientInfoBean.gender_ = gender_;
            return patientInfoBean;
        }

        private String capitalizeFirstLetter(String value){
            return value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase();
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
