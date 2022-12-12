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
    private static final String SQL_INSERT_PHARMACY = "INSERT INTO PHARMACY (Pharmacy_Name, Pharmacy_Location, Pharmacy_Inventory_Size,Email_Id,Phone_no,Password ) VALUES (?,?,?,?,?,?)";
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
                
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                int inventory_size = resultSet.getInt(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                Pharmacy obj = new Pharmacy();
                
                obj.setPharmacy_Id(id);
                obj.setPharmacy_Name(name);
                obj.setPharmacy_Location(location);
                obj.setPharmacy_Inventory_Size(inventory_size);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
                System.out.println(obj);
                
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
     * Validate Pharmacy Function
     */
   public Pharmacy validatePharmacy(String Email_Id) {
        String query = "SELECT * FROM PHARMACY WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        Pharmacy obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new Pharmacy();
                 
                int id = resultSet.getInt(1); 
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                int inventory_size = resultSet.getInt(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);
               
                obj.setPharmacy_Id(id);
                obj.setPharmacy_Name(name);
                obj.setPharmacy_Location(location);
                obj.setPharmacy_Inventory_Size(inventory_size);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
                System.out.println(obj);
                 
             }
             return obj;
             
           } catch (SQLException e) {
                       e.printStackTrace();
                      return obj ;
           }
 } 
   
   /**
     *
     * @return int Update Pharmacy Function
     */
    public int updatePharmacy(Pharmacy pharmacy) {
        int result = 0;
        String SQL_UPDATE_PHARMACY = "UPDATE PHARMACY SET Pharmacy_Name = ? ,Pharmacy_Location = ? ,Pharmacy_Inventory_Size = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Pharmacy_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY)) {

            preparedStatement.setString(1, pharmacy.getPharmacy_Name());
            preparedStatement.setString(2, pharmacy.getPharmacy_Location());
            preparedStatement.setInt(3, pharmacy.getPharmacy_Inventory_Size());
            preparedStatement.setString(4, pharmacy.getEmail_Id());
            preparedStatement.setString(5, pharmacy.getPhone_No());
            preparedStatement.setString(6, pharmacy.getPassword());
            preparedStatement.setInt(7, pharmacy.getPharmacy_Id());
        
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
     * @return int Delete Pharmacy Function
     */
    public int deletePharmacy(Pharmacy pharmacy) {
        int result = 0;
        String SQL_DELETE_PHARMACY = "DELETE FROM Pharmacy WHERE Pharmacy_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_PHARMACY)) {

            preparedStatement.setInt(1, pharmacy.getPharmacy_Id());
        
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
