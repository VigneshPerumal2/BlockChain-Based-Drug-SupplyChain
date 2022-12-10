/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class FDA {
    
    private String FDA_Board_Name;
    private String FDA_City;
    private String FDA_Country;
    private String Email_Id;
    private String Phone_No;
    private String Password;
    private int FDA_Id;

    public int getFDA_Id() {
        return FDA_Id;
    }

    public void setFDA_Id(int FDA_Id) {
        this.FDA_Id = FDA_Id;
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

    @Override
    public String toString() {
        return "FDA{" + "FDA_Board_Name=" + FDA_Board_Name + ", FDA_City=" + FDA_City + ", FDA_Country=" + FDA_Country + ", Email_Id=" + Email_Id + ", Phone_No=" + Phone_No + ", Password=" + Password + ", FDA_Id=" + FDA_Id + '}';
    }

    public FDA(String FDA_Board_Name, String FDA_City, String FDA_Country, String Email_Id, String Phone_No, String Password, int FDA_Id) {
        this.FDA_Board_Name = FDA_Board_Name;
        this.FDA_City = FDA_City;
        this.FDA_Country = FDA_Country;
        this.Email_Id = Email_Id;
        this.Phone_No = Phone_No;
        this.Password = Password;
        this.FDA_Id = FDA_Id;
    }

    public FDA() {
    }    
    
    
}
