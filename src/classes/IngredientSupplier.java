/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Date;

/**
 *
 * @author amulyamurahari
 */
public class IngredientSupplier {
    
    private String Supplier_Name;
    private String Supplier_Category;
    private String Supplier_Location;
    private Date Supplier_Date_Of_Establishment;
    private String Email_Id;
    private String Phone_No;
    private String Password;
    private int Supplier_Id;

    public int getSupplier_Id() {
        return Supplier_Id;
    }

    public void setSupplier_Id(int Supplier_Id) {
        this.Supplier_Id = Supplier_Id;
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
    
   
    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    public String getSupplier_Category() {
        return Supplier_Category;
    }

    public void setSupplier_Category(String Supplier_Category) {
        this.Supplier_Category = Supplier_Category;
    }

    public String getSupplier_Location() {
        return Supplier_Location;
    }

    public void setSupplier_Location(String Supplier_Location) {
        this.Supplier_Location = Supplier_Location;
    }

    public Date getSupplier_Date_Of_Establishment() {
        return Supplier_Date_Of_Establishment;
    }

    public void setSupplier_Date_Of_Establishment(Date Supplier_Date_Of_Establishment) {
        this.Supplier_Date_Of_Establishment = Supplier_Date_Of_Establishment;
    }

    @Override
    public String toString() {
        return "IngredientSupplier{" + "Supplier_Name=" + Supplier_Name + ", Supplier_Category=" + Supplier_Category + ", Supplier_Location=" + Supplier_Location + ", Supplier_Date_Of_Establishment=" + Supplier_Date_Of_Establishment + ", Email_Id=" + Email_Id + ", Phone_No=" + Phone_No + ", Password=" + Password + ", Supplier_Id=" + Supplier_Id + '}';
    }

    public IngredientSupplier(String Supplier_Name, String Supplier_Category, String Supplier_Location, Date Supplier_Date_Of_Establishment, String Email_Id, String Phone_No, String Password, int Supplier_Id) {
        this.Supplier_Name = Supplier_Name;
        this.Supplier_Category = Supplier_Category;
        this.Supplier_Location = Supplier_Location;
        this.Supplier_Date_Of_Establishment = Supplier_Date_Of_Establishment;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
        this.Supplier_Id = Supplier_Id;
    }
    
    public IngredientSupplier() {
    }

    
}
