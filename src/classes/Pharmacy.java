/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Pharmacy {
    
    private String Pharmacy_Name;
    private String Pharmacy_Location;
    private int Pharmacy_Inventory_Size;
    private String Email_Id;
    private String Phone_No;
    private String Password;

    public Pharmacy(String Pharmacy_Name, String Pharmacy_Location, int Pharmacy_Inventory_Size, String Email_Id, String Phone_No, String Password) {
        this.Pharmacy_Name = Pharmacy_Name;
        this.Pharmacy_Location = Pharmacy_Location;
        this.Pharmacy_Inventory_Size = Pharmacy_Inventory_Size;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
    }

    public Pharmacy() {
    }

    public String getPharmacy_Name() {
        return Pharmacy_Name;
    }

    public void setPharmacy_Name(String Pharmacy_Name) {
        this.Pharmacy_Name = Pharmacy_Name;
    }

    public String getPharmacy_Location() {
        return Pharmacy_Location;
    }

    public void setPharmacy_Location(String Pharmacy_Location) {
        this.Pharmacy_Location = Pharmacy_Location;
    }

    public int getPharmacy_Inventory_Size() {
        return Pharmacy_Inventory_Size;
    }

    public void setPharmacy_Inventory_Size(int Pharmacy_Inventory_Size) {
        this.Pharmacy_Inventory_Size = Pharmacy_Inventory_Size;
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

    
    
    
}
