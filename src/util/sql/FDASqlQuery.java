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
    private static final String SQL_INSERT_FDA = "INSERT INTO FDA (FDA_Board_Name, FDA_City, FDA_Country,Email_Id,Phone_no,Password) VALUES (?,?,?,?,?,?)";
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
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String country = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                FDA obj = new FDA();
                obj.setFDA_Id(id);
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
     * Validate FDA Function
     */
   public FDA validateFDA(String Email_Id) {
        String query = "SELECT * FROM FDA WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        FDA obj = null;
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new FDA();
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String country = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                obj.setFDA_Id(id);
                obj.setFDA_Board_Name(name);
                obj.setFDA_City(city);
                obj.setFDA_Country(country);
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
     * @return int Update FDA Function
     */
    public int updateFDA(FDA fda) {
        int result = 0;
        String SQL_UPDATE_FDA = "UPDATE FDA SET FDA_Board_Name = ? ,FDA_City = ? ,FDA_Country = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE FDA_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_FDA)) {

            preparedStatement.setString(1, fda.getFDA_Board_Name());
            preparedStatement.setString(2, fda.getFDA_City());
            preparedStatement.setString(3, fda.getFDA_Country());
            preparedStatement.setString(4, fda.getEmail_Id());
            preparedStatement.setString(5, fda.getPhone_No());
            preparedStatement.setString(6, fda.getPassword());
            preparedStatement.setInt(7, fda.getFDA_Id());

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
     * @return int Delete FDA Function
     */
    public int deleteFDA(FDA fda) {
        int result = 0;
        String SQL_DELETE_FDA = "DELETE FROM FDA WHERE FDA_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_FDA)) {

               preparedStatement.setInt(1, fda.getFDA_Id());
        

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
