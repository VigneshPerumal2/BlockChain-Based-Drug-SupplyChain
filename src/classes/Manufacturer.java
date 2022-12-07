/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Manufacturer {
    
    private String Manufacturer_Name;
    private String Type_Of_Medicine;
    private String Manufacturer_Location;
    private String Manufacturer_Date_Of_Establishment;
    private String Email_Id;
    private String Phone_No;
    private String Password;

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
    

    public String getManufacturer_Name() {
        return Manufacturer_Name;
    }

    public void setManufacturer_Name(String Manufacturer_Name) {
        this.Manufacturer_Name = Manufacturer_Name;
    }

    public String getType_Of_Medicine() {
        return Type_Of_Medicine;
    }

    public void setType_Of_Medicine(String Type_Of_Medicine) {
        this.Type_Of_Medicine = Type_Of_Medicine;
    }

    public String getManufacturer_Location() {
        return Manufacturer_Location;
    }

    public void setManufacturer_Location(String Manufacturer_Location) {
        this.Manufacturer_Location = Manufacturer_Location;
    }

    public String getManufacturer_Date_Of_Establishment() {
        return Manufacturer_Date_Of_Establishment;
    }

    public void setManufacturer_Date_Of_Establishment(String Manufacturer_Date_Of_Establishment) {
        this.Manufacturer_Date_Of_Establishment = Manufacturer_Date_Of_Establishment;
    }

    @Override
    public String toString() {
        return "ManufacturerProfile{" + "name=" + Manufacturer_Name + ", type_of_medicine=" + Type_Of_Medicine + ", location=" + Manufacturer_Location + ", date_of_establishment=" + Manufacturer_Date_Of_Establishment +", emailID=" + Email_Id + ", phoneNo=" + Phone_No + ", password=" + Password +'}';

    }

    public Manufacturer(String Manufacturer_Name, String Type_Of_Medicine, String Manufacturer_Location, String Manufacturer_Date_Of_Establishment,String Email_Id, String Phone_No, String Password) {
        this.Manufacturer_Name = Manufacturer_Name;
        this.Type_Of_Medicine = Type_Of_Medicine;
        this.Manufacturer_Location = Manufacturer_Location;
        this.Manufacturer_Date_Of_Establishment = Manufacturer_Date_Of_Establishment;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
    }

    public Manufacturer() {
    }
    
    
}
