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
public class Distributor {
    
    private String Distributor_Name;
    private String Distributor_Location;
    private String Distributor_Mode_Of_Transportation;
    private Date Distributor_Date_Of_Establishment;
    private int Distributor_Price;
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

    public String getDistributor_Name() {
        return Distributor_Name;
    }

    public void setDistributor_Name(String Distributor_Name) {
        this.Distributor_Name = Distributor_Name;
    }

    public String getDistributor_Location() {
        return Distributor_Location;
    }

    public void setDistributor_Location(String Distributor_Location) {
        this.Distributor_Location = Distributor_Location;
    }

    public String getDistributor_Mode_Of_Transportation() {
        return Distributor_Mode_Of_Transportation;
    }

    public void setDistributor_Mode_Of_Transportation(String Distributor_Mode_Of_Transportation) {
        this.Distributor_Mode_Of_Transportation = Distributor_Mode_Of_Transportation;
    }

    public Date getDistributor_Date_Of_Establishment() {
        return Distributor_Date_Of_Establishment;
    }

    public void setDistributor_Date_Of_Establishment(Date Distributor_Date_Of_Establishment) {
        this.Distributor_Date_Of_Establishment = Distributor_Date_Of_Establishment;
    }

    public int getDistributor_Price() {
        return Distributor_Price;
    }

    public void setDistributor_Price(int Distributor_Price) {
        this.Distributor_Price = Distributor_Price;
    }

    @Override
    public String toString() {
        return "DistributorProfile{" + "name=" + Distributor_Name + ", mode_of_transportation=" + Distributor_Mode_Of_Transportation + ", date_of_establishment=" + Distributor_Date_Of_Establishment + ", price=" + Distributor_Price + ", location=" + Distributor_Location + ", emailID=" + Email_Id + ", phoneNo=" + Phone_No + ", password=" + Password +'}';
    }

    public Distributor(String Distributor_Name, String Distributor_Location, String Distributor_Mode_Of_Transportation, Date Distributor_Date_Of_Establishment, int Distributor_Price, String Email_Id, String Phone_No, String Password) {
        this.Distributor_Name = Distributor_Name;
        this.Distributor_Location = Distributor_Location;
        this.Distributor_Mode_Of_Transportation = Distributor_Mode_Of_Transportation;
        this.Distributor_Date_Of_Establishment = Distributor_Date_Of_Establishment;
        this.Distributor_Price = Distributor_Price;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
    }

    public Distributor() {
    }

   
}
   
    


