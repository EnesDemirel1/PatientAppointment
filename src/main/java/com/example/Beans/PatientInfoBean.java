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
            this.name_ = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname_ = surname;
            return this;
        }

        public Builder setAge(int age_) {
            this.age_ = age_;
            return this;
        }

        public Builder setAppointmentDate(String appointmentDate) {
            this.appointmentDate_ = appointmentDate;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department_ = department;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender_ = gender;
            return this;
        }

        public PatientInfoBean build(){
            PatientInfoBean patientInfoBean = new PatientInfoBean();
            patientInfoBean.name_ = this.name_;
            patientInfoBean.surname_ = this.surname_;
            patientInfoBean.age_ = this.age_;
            patientInfoBean.appointmentDate_ = this.appointmentDate_;
            patientInfoBean.department_ = this.department_;
            patientInfoBean.gender_ = this.gender_;
            return patientInfoBean;
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
