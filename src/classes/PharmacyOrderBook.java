/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class PharmacyOrderBook {
    
    private int Pharmacy_Order_Book_Id;
    private int Medicine_Id;
    private int Pharmacy_Id;
    private String Status;

    public int getPharmacy_Order_Book_Id() {
        return Pharmacy_Order_Book_Id;
    }

    public void setPharmacy_Order_Book_Id(int Pharmacy_Order_Book_Id) {
        this.Pharmacy_Order_Book_Id = Pharmacy_Order_Book_Id;
    }

    public int getMedicine_Id() {
        return Medicine_Id;
    }

    public void setMedicine_Id(int Medicine_Id) {
        this.Medicine_Id = Medicine_Id;
    }

    public int getPharmacy_Id() {
        return Pharmacy_Id;
    }

    public void setPharmacy_Id(int Pharmacy_Id) {
        this.Pharmacy_Id = Pharmacy_Id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "PharmacyOrderBook{" + "Pharmacy_Order_Book_Id=" + Pharmacy_Order_Book_Id + ", Medicine_Id=" + Medicine_Id + ", Pharmacy_Id=" + Pharmacy_Id + ", Status=" + Status + '}';
    }

    public PharmacyOrderBook(int Pharmacy_Order_Book_Id, int Medicine_Id, int Pharmacy_Id, String Status) {
        this.Pharmacy_Order_Book_Id = Pharmacy_Order_Book_Id;
        this.Medicine_Id = Medicine_Id;
        this.Pharmacy_Id = Pharmacy_Id;
        this.Status = Status;
    }


    public PharmacyOrderBook() {
    }
    
    
}
