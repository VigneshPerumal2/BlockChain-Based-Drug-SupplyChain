/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author amulyamurahari
 */
public class Patient {
    
    private String Patient_Name;
    private int Patient_Age;
    private String Patient_Race;
    private String Patient_Gender;
    private String Patient_Location;
    private String Ailments;
    private String Email_Id;
    private String Phone_No;
    private String Password;

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public int getPatient_Age() {
        return Patient_Age;
    }

    public void setPatient_Age(int Patient_Age) {
        this.Patient_Age = Patient_Age;
    }

    public String getPatient_Race() {
        return Patient_Race;
    }

    public void setPatient_Race(String Patient_Race) {
        this.Patient_Race = Patient_Race;
    }

    public String getPatient_Gender() {
        return Patient_Gender;
    }

    public void setPatient_Gender(String Patient_Gender) {
        this.Patient_Gender = Patient_Gender;
    }

    public String getPatient_Location() {
        return Patient_Location;
    }

    public void setPatient_Location(String Patient_Location) {
        this.Patient_Location = Patient_Location;
    }

    public String getAilments() {
        return Ailments;
    }

    public void setAilments(String Ailments) {
        this.Ailments = Ailments;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String Email_Id) {
        this.Email_Id = Email_Id;
    }

    public String getPhone_No() {
        return Phone_No;
    }

    public void setPhone_No(String Phone_No) {
        this.Phone_No = Phone_No;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
     @Override
    public String toString() {
        return "PatientProfile{" + "name=" + Patient_Name + ", age=" + Patient_Age + ", race=" + Patient_Race + ", gender=" + Patient_Gender + ", location=" + Patient_Location + ", ailments=" + Ailments + ", emailID=" + Email_Id + ", phoneNo=" + Phone_No + ", password=" + Password +'}';
    }
    
     public Patient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password) {
        this.Patient_Name = Patient_Name;
        this.Patient_Age = Patient_Age;
        this.Patient_Race = Patient_Race;
        this.Patient_Gender = Patient_Gender;
        this.Patient_Location = Patient_Location;
        this.Ailments = Ailments;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
       
    }

    public Patient() {
    }
    
    
}
