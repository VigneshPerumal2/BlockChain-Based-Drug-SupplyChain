/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author amulyamurahari
 */
public class HospitalOrderBook {
    
    private int Hospital_Order_Book_Id;
    private int Medicine_Id;
    private int Distributor_Id;
    private int Hospital_Id;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getHospital_Order_Book_Id() {
        return Hospital_Order_Book_Id;
    }

    public void setHospital_Order_Book_Id(int Hospital_Order_Book_Id) {
        this.Hospital_Order_Book_Id = Hospital_Order_Book_Id;
    }

    public int getMedicine_Id() {
        return Medicine_Id;
    }

    public void setMedicine_Id(int Medicine_Id) {
        this.Medicine_Id = Medicine_Id;
    }

    public int getDistributor_Id() {
        return Distributor_Id;
    }

    public void setDistributor_Id(int Distributor_Id) {
        this.Distributor_Id = Distributor_Id;
    }

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
    }

    @Override
    public String toString() {
        return "HospitalOrderBook{" + "Hospital_Order_Book_Id=" + Hospital_Order_Book_Id + ", Medicine_Id=" + Medicine_Id + ", Distributor_Id=" + Distributor_Id + ", Hospital_Id=" + Hospital_Id + ", Status=" + Status + '}';
    }

    public HospitalOrderBook(int Hospital_Order_Book_Id, int Medicine_Id, int Distributor_Id, int Hospital_Id, String Status) {
        this.Hospital_Order_Book_Id = Hospital_Order_Book_Id;
        this.Medicine_Id = Medicine_Id;
        this.Distributor_Id = Distributor_Id;
        this.Hospital_Id = Hospital_Id;
        this.Status = Status;
    }


    public HospitalOrderBook() {
    }
  
}
