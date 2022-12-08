/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Pharmacy;
import java.sql.Connection;
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
public class PharmacySqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";
    
    /**
     * Pharmacy Queries
     */
    private static final String SQL_INSERT_PHARMACY = "INSERT INTO PHARMACY (Pharmacy_Name, Pharmacy_Location, Pharmacy_Inventory_Size,Email_Id,Phone_No,Password ) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_PHARMACY = "SELECT * FROM PHARMACY";
    
    /**
     *
     * @return int Create Pharmacy Function
     */
    public int createPharmacy(Pharmacy pharmacy) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PHARMACY)) {

            preparedStatement.setString(1, pharmacy.getPharmacy_Name());
            preparedStatement.setString(2, pharmacy.getPharmacy_Location());
            preparedStatement.setInt(3, pharmacy.getPharmacy_Inventory_Size());
            preparedStatement.setString(4, pharmacy.getEmail_Id());
            preparedStatement.setString(5, pharmacy.getPhone_No());
            preparedStatement.setString(6, pharmacy.getPassword());
        
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
     * Select all Pharmacy function
     */
    public ArrayList<Pharmacy> readAllPharmacy() {
        
        ArrayList<Pharmacy> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PHARMACY)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String location = resultSet.getString(2);
                int inventory_size = resultSet.getInt(3);
                String emailID = resultSet.getString(4);
                String phoneNo = resultSet.getString(5);
                String password = resultSet.getString(6);

                Pharmacy obj = new Pharmacy();
                obj.setPharmacy_Name(name);
                obj.setPharmacy_Location(location);
                obj.setPharmacy_Inventory_Size(inventory_size);
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
     * @return boolean Validate Pharmacy Function
     */
   public boolean validatePharmacy(String Email_Id) {
        String query = "SELECT Password FROM PHARMACY WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return int Update Pharmacy Function
     */
    public int updatePharmacy(Pharmacy pharmacy) {
        int result = 0;
        String SQL_UPDATE_PHARMACY = "UPDATE FDA SET Pharmacy_Name = ? ,Pharmacy_Location = ? ,Pharmacy_Inventory_Size = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY)) {

            preparedStatement.setString(1, pharmacy.getPharmacy_Name());
            preparedStatement.setString(2, pharmacy.getPharmacy_Location());
            preparedStatement.setInt(3, pharmacy.getPharmacy_Inventory_Size());
            preparedStatement.setString(4, pharmacy.getEmail_Id());
            preparedStatement.setString(5, pharmacy.getPhone_No());
            preparedStatement.setString(6, pharmacy.getPassword());
        
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
