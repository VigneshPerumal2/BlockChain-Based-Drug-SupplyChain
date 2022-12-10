/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class FDA extends Credentials {
    
    private String FDA_Board_Name;
    private String FDA_City;
    private String FDA_Country;
    private int FDA_Id;

    public String getFDA_Board_Name() {
        return FDA_Board_Name;
    }

    public void setFDA_Board_Name(String FDA_Board_Name) {
        this.FDA_Board_Name = FDA_Board_Name;
    }

    public String getFDA_City() {
        return FDA_City;
    }

    public void setFDA_City(String FDA_City) {
        this.FDA_City = FDA_City;
    }

    public String getFDA_Country() {
        return FDA_Country;
    }

    public void setFDA_Country(String FDA_Country) {
        this.FDA_Country = FDA_Country;
    }

    public int getFDA_Id() {
        return FDA_Id;
    }

    public void setFDA_Id(int FDA_Id) {
        this.FDA_Id = FDA_Id;
    }

    @Override
    public String toString() {
        return "FDA{" + "FDA_Board_Name=" + FDA_Board_Name + ", FDA_City=" + FDA_City + ", FDA_Country=" + FDA_Country + ", FDA_Id=" + FDA_Id + '}';
    }

    public FDA(String FDA_Board_Name, String FDA_City, String FDA_Country, int FDA_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.FDA_Board_Name = FDA_Board_Name;
        this.FDA_City = FDA_City;
        this.FDA_Country = FDA_Country;
        this.FDA_Id = FDA_Id;
    }

    public FDA() {
    }

    
}
