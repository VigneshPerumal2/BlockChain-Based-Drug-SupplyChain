/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Hospital {
    
    private String Hospital_Name;
    private String Hospital_Location;
    private String Hospital_Speciality;
    private String Email_Id;
    private String Phone_No;
    private String Password;
    private int Hospital_Id;

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
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
   
    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }

    public String getHospital_Location() {
        return Hospital_Location;
    }

    public void setHospital_Location(String Hospital_Location) {
        this.Hospital_Location = Hospital_Location;
    }

    public String getHospital_Speciality() {
        return Hospital_Speciality;
    }

    public void setHospital_Speciality(String Hospital_Speciality) {
        this.Hospital_Speciality = Hospital_Speciality;
    }

    @Override
    public String toString() {
        return "Hospital{" + "Hospital_Name=" + Hospital_Name + ", Hospital_Location=" + Hospital_Location + ", Hospital_Speciality=" + Hospital_Speciality + ", Email_Id=" + Email_Id + ", Phone_No=" + Phone_No + ", Password=" + Password + ", Hospital_Id=" + Hospital_Id + '}';
    }

    public Hospital(String Hospital_Name, String Hospital_Location, String Hospital_Speciality, String Email_Id, String Phone_No, String Password, int Hospital_Id) {
        this.Hospital_Name = Hospital_Name;
        this.Hospital_Location = Hospital_Location;
        this.Hospital_Speciality = Hospital_Speciality;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
        this.Hospital_Id = Hospital_Id;
    }

    public Hospital() {
    }
    
}
