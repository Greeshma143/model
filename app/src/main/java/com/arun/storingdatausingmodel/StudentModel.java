package com.arun.storingdatausingmodel;

public class StudentModel {
    public String name;
    public String roll;
    public String Admno;
    public String college;

    public StudentModel() {

    }

    public StudentModel(String name, String roll, String admno, String college) {
        this.name = name;
        this.roll = roll;
        Admno = admno;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getAdmno() {
        return Admno;
    }

    public void setAdmno(String admno) {
        Admno = admno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
