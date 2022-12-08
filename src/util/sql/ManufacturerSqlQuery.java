/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Manufacturer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author amulyamurahari
 */
public class ManufacturerSqlQuery {
    
     /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";
    
     /**
     * Manufacturer Queries
     */
    private static final String SQL_INSERT_MANUFACTURER = "INSERT INTO MANUFACTURER (Manufacturer_Name, Manufacturer_Location, Type_Of_Medicine, Manufacturer_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_MANUFACTURER = "SELECT * FROM MANUFACTURER";
    
     /**
     *
     * @return int Create Manufacturer Function
     */
    public int createManufacturer(Manufacturer manufacturer) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MANUFACTURER)) {

            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
            preparedStatement.setString(2, manufacturer.getManufacturer_Location());
            preparedStatement.setString(3, manufacturer.getType_Of_Medicine());
            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
            preparedStatement.setString(5, manufacturer.getEmail_Id());
            preparedStatement.setString(6, manufacturer.getPhone_No());
            preparedStatement.setString(7, manufacturer.getPassword());
            

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
     * Select all manufacturer function
     */
    public ArrayList<Manufacturer> readAllManufacturer() {
        
        ArrayList<Manufacturer> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MANUFACTURER)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String location = resultSet.getString(2);
                String medicine_type = resultSet.getString(3);
                Date doe = resultSet.getDate(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                Manufacturer obj = new Manufacturer();
                obj.setManufacturer_Name(name);
                obj.setManufacturer_Location(location);
                obj.setType_Of_Medicine(medicine_type);
                obj.setManufacturer_Date_Of_Establishment(doe);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
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
     * @return boolean Validate Manufacturer Function
     */
   public boolean validateManufacturer(String Email_Id) {
        String query = "SELECT Password FROM MANUFACTURER WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             if(resultSet!= null) {
                      return true ;
             }else {
                      return false ;
            }
           } catch (SQLException e) {
                       e.printStackTrace();
                      return true ;
           }
 } 
   
   /**
     *
     * @return int Update Manufacturer Function
     */
    public int updateManufacturer(Manufacturer manufacturer) {
        int result = 0;
        String SQL_UPDATE_MANUFACTURER = "UPDATE MANUFACTURER SET Manufacturer_Name = ? ,Manufacturer_Location = ?, Type_Of_Medicine = ? ,Manufacturer_Date_Of_Establishment = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MANUFACTURER)) {

            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
            preparedStatement.setString(2, manufacturer.getManufacturer_Location());
            preparedStatement.setString(3, manufacturer.getType_Of_Medicine());
            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
            preparedStatement.setString(5, manufacturer.getEmail_Id());
            preparedStatement.setString(6, manufacturer.getPhone_No());
            preparedStatement.setString(7, manufacturer.getPassword());

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
