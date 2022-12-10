/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Hospital;
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
public class HospitalSqlQuery {
    
     /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";
    
    /**
     * Hospital Queries
     */
    private static final String SQL_INSERT_HOSPITAL = "INSERT INTO HOSPITAL (Hospital_Name,Hospital_Location,Hospital_Speciality,Email_Id,Phone_no,Password) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_HOSPITAL = "SELECT * FROM HOSPITAL";
    
    /**
     *
     * @return int Create Hospital Function
     */
    public int createHospital(Hospital hospital) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_HOSPITAL)) {

            preparedStatement.setString(1, hospital.getHospital_Name());
            preparedStatement.setString(2, hospital.getHospital_Location());
            preparedStatement.setString(3, hospital.getHospital_Speciality());
            preparedStatement.setString(4, hospital.getEmail_Id());
            preparedStatement.setString(5, hospital.getPhone_No());
            preparedStatement.setString(6, hospital.getPassword());
        
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
     * Select all Hospital function
     */
    public ArrayList<Hospital> readAllHospital() {
        
        ArrayList<Hospital> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_HOSPITAL)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String location = resultSet.getString(2);
                String speciality = resultSet.getString(3);
                String emailID = resultSet.getString(4);
                String phoneNo = resultSet.getString(5);
                String password = resultSet.getString(6);

                Hospital obj = new Hospital();
                obj.setHospital_Name(name);
                obj.setHospital_Location(location);
                obj.setHospital_Speciality(speciality);
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
     * Validate Hospital Function
     */
   public Hospital validateHospital(String Email_Id) {
        String query = "SELECT Password FROM HOSPITAL WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        Hospital obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query);
             
             while(resultSet.next()){
                 
                 obj = new Hospital();
                String name = resultSet.getString(1);
                String location = resultSet.getString(2);
                String speciality = resultSet.getString(3);
                String emailID = resultSet.getString(4);
                String phoneNo = resultSet.getString(5);
                String password = resultSet.getString(6);

                obj.setHospital_Name(name);
                obj.setHospital_Location(location);
                obj.setHospital_Speciality(speciality);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                                 
                System.out.println(obj);
                 
                 
             }
                 
            return obj;
            
           } catch (SQLException e) {
                       e.printStackTrace();
                      return obj;
           }
 } 
   /**
     *
     * @return int Update Hospital Function
     */
    public int updateHospital(Hospital hospital) {
        int result = 0;
        String SQL_UPDATE_HOSPITAL = "UPDATE HOSPITAL SET Hospital_Name = ? ,Hospital_Location = ? ,Hospital_Speciality = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_HOSPITAL)) {

            preparedStatement.setString(1, hospital.getHospital_Name());
            preparedStatement.setString(2, hospital.getHospital_Location());
            preparedStatement.setString(3, hospital.getHospital_Speciality());
            preparedStatement.setString(4, hospital.getEmail_Id());
            preparedStatement.setString(5, hospital.getPhone_No());
            preparedStatement.setString(6, hospital.getPassword());
        
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
     * @return int Delete Hospital Function
     */
    public int deleteHospital(Hospital hospital) {
        int result = 0;
        String SQL_DELETE_HOSPITAL = "DELETE FROM Hospital WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_HOSPITAL)) {

            preparedStatement.setString(1, hospital.getHospital_Name());
            preparedStatement.setString(2, hospital.getHospital_Location());
            preparedStatement.setString(3, hospital.getHospital_Speciality());
            preparedStatement.setString(4, hospital.getEmail_Id());
            preparedStatement.setString(5, hospital.getPhone_No());
            preparedStatement.setString(6, hospital.getPassword());
        
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
