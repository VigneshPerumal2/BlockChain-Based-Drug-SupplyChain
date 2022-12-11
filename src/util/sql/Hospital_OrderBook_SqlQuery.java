/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;


import classes.HospitalOrderBook;
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
public class Hospital_OrderBook_SqlQuery {
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";

    /**
     * Hospital_Order_Book Queries
     */
    private static final String SQL_INSERT_HOSPITAL_ORDER_BOOK = "INSERT INTO HOSPITAL_ORDER_BOOK (Hospital_Order_Book_Id, Medicine_Id, Distributor_Id, Hospital_Id, Status) VALUES (?,?,?,?,?)";
    private static final String SQL_READ_HOSPITAL_ORDER_BOOK = "SELECT * FROM HOSPITAL_ORDER_BOOK";
    
    /**
     *
     * @return int Create Hospital_Order_Book Function
     */
    public int createHospitalOrderBook(HospitalOrderBook hospitalOrderBook) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_HOSPITAL_ORDER_BOOK)) {

            preparedStatement.setInt(1, hospitalOrderBook.getHospital_Order_Book_Id());
            preparedStatement.setInt(2, hospitalOrderBook.getMedicine_Id());
            preparedStatement.setInt(3, hospitalOrderBook.getDistributor_Id());
            preparedStatement.setInt(4, hospitalOrderBook.getHospital_Id());
            preparedStatement.setString(5, hospitalOrderBook.getStatus());

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
     * Select all ingredient supplier function
     */
    public ArrayList<HospitalOrderBook> readAllHospitalOrderBook() {
        
        ArrayList<HospitalOrderBook> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_HOSPITAL_ORDER_BOOK)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int hospital_ob_id = resultSet.getInt(1);
                int medicine_id = resultSet.getInt(2);
                int distributor_id = resultSet.getInt(3);
                int hospital_id = resultSet.getInt(4);
                String status = resultSet.getString(5);
               

                HospitalOrderBook obj = new HospitalOrderBook();
                obj.setHospital_Order_Book_Id(hospital_ob_id);
                obj.setMedicine_Id(medicine_id);
                obj.setDistributor_Id(distributor_id);
                obj.setHospital_Id(hospital_id);
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
     * @return int Update Ingredient_Supplier Function
     */
    public int updateHospitalOrderBook(HospitalOrderBook hospitalOrderBook) {
        int result = 0;
        String SQL_UPDATE_HOSPITAL_ORDER_BOOK = "UPDATE HOSPITAL SET Hospital_Order_Book_Id = ?,Medicine_Id = ?,Distributor_Id = ?, Hospital_Id = ?, Status = ? WHERE Hospital_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_HOSPITAL_ORDER_BOOK)) {

            preparedStatement.setInt(1, hospitalOrderBook.getHospital_Order_Book_Id());
            preparedStatement.setInt(2, hospitalOrderBook.getMedicine_Id());
            preparedStatement.setInt(3, hospitalOrderBook.getDistributor_Id());
            preparedStatement.setInt(4, hospitalOrderBook.getHospital_Id());
            preparedStatement.setString(5, hospitalOrderBook.getStatus());


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
     * @return int Update Ingredient_Supplier Function
     */
    public int deleteHospitalOrderBook(HospitalOrderBook hospitalOrderBook) {
        int result = 0;
        String SQL_UPDATE_HOSPITAL_ORDER_BOOK = "DELETE HOSPITAL WHERE Hospital_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_HOSPITAL_ORDER_BOOK)) {

            preparedStatement.setInt(1, hospitalOrderBook.getHospital_Order_Book_Id());
            preparedStatement.setInt(2, hospitalOrderBook.getMedicine_Id());
            preparedStatement.setInt(3, hospitalOrderBook.getDistributor_Id());
            preparedStatement.setInt(4, hospitalOrderBook.getHospital_Id());
            preparedStatement.setString(5, hospitalOrderBook.getStatus());


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

