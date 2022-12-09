/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Distributor;
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
public class DistributorSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";
    
     /**
     * Distributor Queries
     */
    private static final String SQL_INSERT_DISTRIBUTOR = "INSERT INTO DISTRIBUTOR (Distributor_Name, Distributor_Location, Distributor_Date_Of_Establishment, Distributor_Mode_Of_Transportation, Distributor_Price,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_DISTRIBUTOR = "SELECT * FROM DISTRIBUTOR";
    
    
    /**
     *
     * @return int Create Distributor Function
     */
    public int createDistributor(Distributor distributor) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DISTRIBUTOR)) {

            preparedStatement.setString(1, distributor.getDistributor_Name());
            preparedStatement.setString(2, distributor.getDistributor_Location());
            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
            preparedStatement.setInt(5, distributor.getDistributor_Price());
            preparedStatement.setString(6, distributor.getEmail_Id());
            preparedStatement.setString(7, distributor.getPhone_No());
            preparedStatement.setString(8, distributor.getPassword());
            

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
     * Select all distributor function
     */
    public ArrayList<Distributor> readAllDistributor() {
        
        ArrayList<Distributor> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_DISTRIBUTOR)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String location = resultSet.getString(2);
                Date doe = resultSet.getDate(3);
                String transportation = resultSet.getString(4);
                int price = resultSet.getInt(5);
                String emailID = resultSet.getString(6);
                String phoneNo = resultSet.getString(7);
                String password = resultSet.getString(8);

                Distributor obj = new Distributor();
                obj.setDistributor_Name(name);
                obj.setDistributor_Location(location);
                obj.setDistributor_Date_Of_Establishment(doe);
                obj.setDistributor_Mode_Of_Transportation(transportation);
                obj.setDistributor_Price(price);
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
     * @return boolean Validate Distributor Function
     */
   public boolean validateDistributor(String Email_Id) {
        String query = "SELECT Password FROM DISTRIBUTOR WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return int Update Distributor Function
     */
    public int updateDistributor(Distributor distributor) {
        int result = 0;
        String SQL_UPDATE_DISTRIBUTOR = "UPDATE FDA SET Distributor_Name = ? ,Distributor_Location = ? ,Distributor_Date_Of_Establishment = ? ,Distributor_Mode_Of_Transportation = ?, Distributor_Price = ?, Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DISTRIBUTOR)) {

            preparedStatement.setString(1, distributor.getDistributor_Name());
            preparedStatement.setString(2, distributor.getDistributor_Location());
            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
            preparedStatement.setInt(5, distributor.getDistributor_Price());
            preparedStatement.setString(6, distributor.getEmail_Id());
            preparedStatement.setString(7, distributor.getPhone_No());
            preparedStatement.setString(8, distributor.getPassword());

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
