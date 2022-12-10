/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Hospital extends Credentials {
    
    private String Hospital_Name;
    private String Hospital_Location;
    private String Hospital_Speciality;
    private int Hospital_Id;

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

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
    }

    @Override
    public String toString() {
        return "Hospital{" + "Hospital_Name=" + Hospital_Name + ", Hospital_Location=" + Hospital_Location + ", Hospital_Speciality=" + Hospital_Speciality + ", Hospital_Id=" + Hospital_Id + '}';
    }

    public Hospital(String Hospital_Name, String Hospital_Location, String Hospital_Speciality, int Hospital_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Hospital_Name = Hospital_Name;
        this.Hospital_Location = Hospital_Location;
        this.Hospital_Speciality = Hospital_Speciality;
        this.Hospital_Id = Hospital_Id;
    }

    public Hospital() {
    }

    
}
