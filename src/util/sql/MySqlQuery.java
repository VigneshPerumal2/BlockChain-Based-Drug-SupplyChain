/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


//package com.mkyong.jdbc.preparestatement.row;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Amulya
 */

public class MySqlQuery {
    
     private ArrayList<Patient> record;
    
     private final String URL = "jdbc:mysql://localhost:3306/AVS";
     private final String USER="root";
     private final String PASSWORD="!1qaz@2wsx";

//  PATIENT TABLE QUERIES
    private static final String SQL_INSERT_PATIENT = "INSERT INTO PATIENT (Patient_Name, Patient_Age, Patient_Race,Patient_Gender,Patient_Location,Ailments,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_PATIENT = "SELECT * FROM PATIENT";
    
//    THIS FUNCTIONS CREATES NEW PATIENT
    public int registerPatient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password) {
        int result=0;
        try (Connection conn = DriverManager.getConnection(
                URL,USER,PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PATIENT)) {

            preparedStatement.setString(1,Patient_Name);
            preparedStatement.setInt(2, Patient_Age);
            preparedStatement.setString(3, Patient_Race);
            preparedStatement.setString(4, Patient_Gender);
            preparedStatement.setString(5, Patient_Location);
            preparedStatement.setString(6, Ailments);
            preparedStatement.setString(7, Email_Id);
            preparedStatement.setString(8, Phone_No);
            preparedStatement.setString(9, Password);
            

            int row = preparedStatement.executeUpdate();
            result=row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    
    
// THIS FUNCTION READS THE PATIENT
    public void readPatient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password){
        int result =0;
        try (Connection conn = DriverManager.getConnection(
                URL,USER,PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PATIENT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(Patient_Name);
                int age = resultSet.getInt(Patient_Age);
                String race = resultSet.getString(Patient_Race);
                String gender = resultSet.getString(Patient_Gender);
                String location = resultSet.getString(Patient_Location);
                String ailments = resultSet.getString(Ailments);
                String emailID = resultSet.getString(Email_Id);
                String phoneNo = resultSet.getString(Phone_No);
                String password = resultSet.getString(Password);
                
                
                Patient obj = new Patient();
//                obj.setId(name);
//                obj.setName(age);
//                obj.setRace(race);
//                obj.setGender(gender);
//                obj.setLocation(location);
//                obj.setAilments(ailments);
//                obj.setEmailID(emailID);
//                obj.setPhoneNo(phoneNo);
//                obj.setPassword(password);
//                
                
                System.out.println(obj);
            }
            
            int row = preparedStatement.executeUpdate();
            result=row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            
        }
    
    }
    

}


    
