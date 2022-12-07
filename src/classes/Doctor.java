/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Doctor {
    
    private String Doctor_Name;
    private int Doctor_Age;
    private String Doctor_Race;
    private String Doctor_Gender;
    private String Doctor_Location;
    private String Speciality;
    private String Email_Id;
    private String Phone_No;
    private String Password;

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public int getDoctor_Age() {
        return Doctor_Age;
    }

    public void setDoctor_Age(int Doctor_Age) {
        this.Doctor_Age = Doctor_Age;
    }

    public String getDoctor_Race() {
        return Doctor_Race;
    }

    public void setDoctor_Race(String Doctor_Race) {
        this.Doctor_Race = Doctor_Race;
    }

    public String getDoctor_Gender() {
        return Doctor_Gender;
    }

    public void setDoctor_Gender(String Doctor_Gender) {
        this.Doctor_Gender = Doctor_Gender;
    }

    public String getDoctor_Location() {
        return Doctor_Location;
    }

    public void setDoctor_Location(String Doctor_Location) {
        this.Doctor_Location = Doctor_Location;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
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
        return "DoctorProfile{" + "name=" + Doctor_Name + ", age=" + Doctor_Age + ", race=" + Doctor_Race + ", gender=" + Doctor_Gender + ", location=" + Doctor_Location + ", speciality=" + Speciality + ", emailID=" + Email_Id + ", phoneNo=" + Phone_No + ", password=" + Password +'}';
    }

    public Doctor(String Doctor_Name, int Doctor_Age, String Doctor_Race, String Doctor_Gender, String Doctor_Location, String Speciality, String Email_Id, String Phone_No, String Password) {
        this.Doctor_Name = Doctor_Name;
        this.Doctor_Age = Doctor_Age;
        this.Doctor_Race = Doctor_Race;
        this.Doctor_Gender = Doctor_Gender;
        this.Doctor_Location = Doctor_Location;
        this.Speciality = Speciality;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
    }
    
    public Doctor(){
        
    }
    
}
