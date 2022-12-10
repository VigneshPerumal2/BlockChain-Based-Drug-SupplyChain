/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class Pharmacy extends Credentials {
    
    private String Pharmacy_Name;
    private String Pharmacy_Location;
    private int Pharmacy_Inventory_Size;
    private int Pharmacy_Id;

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

    public int getPharmacy_Id() {
        return Pharmacy_Id;
    }

    public void setPharmacy_Id(int Pharmacy_Id) {
        this.Pharmacy_Id = Pharmacy_Id;
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "Pharmacy_Name=" + Pharmacy_Name + ", Pharmacy_Location=" + Pharmacy_Location + ", Pharmacy_Inventory_Size=" + Pharmacy_Inventory_Size + ", Pharmacy_Id=" + Pharmacy_Id + '}';
    }

    public Pharmacy(String Pharmacy_Name, String Pharmacy_Location, int Pharmacy_Inventory_Size, int Pharmacy_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Pharmacy_Name = Pharmacy_Name;
        this.Pharmacy_Location = Pharmacy_Location;
        this.Pharmacy_Inventory_Size = Pharmacy_Inventory_Size;
        this.Pharmacy_Id = Pharmacy_Id;
    }

    public Pharmacy() {
    }
    
}
