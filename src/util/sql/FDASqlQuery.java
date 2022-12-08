/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.FDA;
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
public class FDASqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";
    
    /**
     * FDA Queries
     */
    private static final String SQL_INSERT_FDA = "INSERT INTO FDA (FDA_Board_Name, FDA_City, FDA_Country,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_FDA= "SELECT * FROM FDA";
    
    /**
     *
     * @return int Create FDA Function
     */
    public int createFDA(FDA fda) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_FDA)) {

            preparedStatement.setString(1, fda.getFDA_Board_Name());
            preparedStatement.setString(2, fda.getFDA_City());
            preparedStatement.setString(3, fda.getFDA_Country());
            preparedStatement.setString(4, fda.getEmail_Id());
            preparedStatement.setString(5, fda.getPhone_No());
            preparedStatement.setString(6, fda.getPassword());
            

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
     * Select all FDA function
     */
    public ArrayList<FDA> readAllFDA() {
        
        ArrayList<FDA> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_FDA)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String city = resultSet.getString(2);
                String country = resultSet.getString(3);
                String emailID = resultSet.getString(4);
                String phoneNo = resultSet.getString(5);
                String password = resultSet.getString(6);

                FDA obj = new FDA();
                obj.setFDA_Board_Name(name);
                obj.setFDA_City(city);
                obj.setFDA_Country(country);
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
     * @return boolean Validate FDA Function
     */
   public boolean validateFDA(String Email_Id) {
        String query = "SELECT Password FROM FDA WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return int Update FDA Function
     */
    public int updateFDA(FDA fda) {
        int result = 0;
        String SQL_UPDATE_FDA = "UPDATE FDA SET FDA_Board_Name = ? ,FDA_City = ? ,FDA_Country = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_FDA)) {

            preparedStatement.setString(1, fda.getFDA_Board_Name());
            preparedStatement.setString(2, fda.getFDA_City());
            preparedStatement.setString(3, fda.getFDA_Country());
            preparedStatement.setString(4, fda.getEmail_Id());
            preparedStatement.setString(5, fda.getPhone_No());
            preparedStatement.setString(6, fda.getPassword());

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
