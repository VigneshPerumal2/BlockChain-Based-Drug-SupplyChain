/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;


import classes.PharmacyOrderBook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author amulyamurahari
 */
public class Pharmacy_OrderBook_SqlQuery {
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";

    /**
     * Pharmacy_Order_Book Queries
     */
    private static final String SQL_INSERT_PHARMACY_ORDER_BOOK = "INSERT INTO PHARMACY_ORDER_BOOK (Pharmacy_Order_Book_Id, Medicine_Id, Pharmacy_Id, Status) VALUES (?,?,?,?)";
    private static final String SQL_READ_PHARMACY_ORDER_BOOK = "SELECT * FROM PHARMACY_ORDER_BOOK";
    
    /**
     *
     * @return int Create Pharmacy_Order_Book Function
     */
    public int createPharmacyOrderBook(PharmacyOrderBook pharmacyOrderBook) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PHARMACY_ORDER_BOOK)) {

            preparedStatement.setInt(1, pharmacyOrderBook.getPharmacy_Order_Book_Id());
            preparedStatement.setInt(2, pharmacyOrderBook.getMedicine_Id());
            preparedStatement.setInt(3, pharmacyOrderBook.getPharmacy_Id());
            preparedStatement.setString(4, pharmacyOrderBook.getStatus());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
  
   /**
     *
     * Select all pharmacy function
     */
    public ArrayList<PharmacyOrderBook> readAllPharmacyOrderBook() {
        
        ArrayList<PharmacyOrderBook> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PHARMACY_ORDER_BOOK)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int pharm_ob_id = resultSet.getInt(1);
                int medicine_id = resultSet.getInt(2);
                int pharm_id = resultSet.getInt(3);
                String status = resultSet.getString(4);
               

                PharmacyOrderBook obj = new PharmacyOrderBook();
                obj.setPharmacy_Order_Book_Id(pharm_ob_id);
                obj.setMedicine_Id(medicine_id);
                obj.setPharmacy_Id(pharm_id);
                obj.setStatus(status);
                
                record.add(obj);            
                System.out.println(obj);
            }      

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }
        return record;

    }

     /**
     *
     * @return int Update pharmacy Function
     */
    public int updatePharmacyOrderBook(PharmacyOrderBook pharmacyOrderBook) {
        int result = 0;
        String SQL_UPDATE_PHARMACY_ORDER_BOOK = "UPDATE PHARMACY_ORDER_BOOK SET Medicine_Id = ?,Pharmacy_Id = ?, Status = ? WHERE Pharmacy_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY_ORDER_BOOK)) {

            preparedStatement.setInt(4, pharmacyOrderBook.getPharmacy_Order_Book_Id());
            preparedStatement.setInt(1, pharmacyOrderBook.getMedicine_Id());
            preparedStatement.setInt(2, pharmacyOrderBook.getPharmacy_Id());
            preparedStatement.setString(3, pharmacyOrderBook.getStatus());


            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    /**
     *
     * @return int Update pharmacy Function
     */
    public int deletePharmacyOrderBook(PharmacyOrderBook pharmacyOrderBook) {
        int result = 0;
        String SQL_UPDATE_PHARMACY_ORDER_BOOK = "DELETE PHARMACY_ORDER_BOOK WHERE Pharmacy_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY_ORDER_BOOK)) {

            preparedStatement.setInt(1, pharmacyOrderBook.getPharmacy_Order_Book_Id());


            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
     
    
}

