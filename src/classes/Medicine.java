/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

//import java.util.Date;
import java.sql.Date;

/**
 *
 * @author amulyamurahari
 */
public class Medicine {
    
    private String Medicine_Name;
    private String Medicine_Status;
    private String Medicine_Category;
    private Date Date_Of_Manufacture;
    private int Shell_Life;

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public String getMedicine_Status() {
        return Medicine_Status;
    }

    public void setMedicine_Status(String Medicine_Status) {
        this.Medicine_Status = Medicine_Status;
    }

    public String getMedicine_Category() {
        return Medicine_Category;
    }

    public void setMedicine_Category(String Medicine_Category) {
        this.Medicine_Category = Medicine_Category;
    }

    public Date getDate_Of_Manufacture() {
        return Date_Of_Manufacture;
    }

    public void setDate_Of_Manufacture(Date Date_Of_Manufacture) {
        this.Date_Of_Manufacture = Date_Of_Manufacture;
    }

    public int getShell_Life() {
        return Shell_Life;
    }

    public void setShell_Life(int Shell_Life) {
        this.Shell_Life = Shell_Life;
    }

    @Override
    public String toString() {
        return "DistributorProfile{" + "name=" + Medicine_Name + ", status=" + Medicine_Status + ", category=" + Medicine_Category + ", date_of_manufacture=" + Date_Of_Manufacture + ", shell_life=" + Shell_Life +'}';
    }

    public Medicine(String Medicine_Name, String Medicine_Status, String Medicine_Category, Date Date_Of_Manufacture, int Shell_Life) {
        this.Medicine_Name = Medicine_Name;
        this.Medicine_Status = Medicine_Status;
        this.Medicine_Category = Medicine_Category;
        this.Date_Of_Manufacture = Date_Of_Manufacture;
        this.Shell_Life = Shell_Life;
    }

    public Medicine() {
    }
    
    
    
}
