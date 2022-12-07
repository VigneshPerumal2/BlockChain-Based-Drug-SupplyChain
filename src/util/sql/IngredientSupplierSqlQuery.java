/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.IngredientSupplier;
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
public class IngredientSupplierSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";

    /**
     * Ingredient_Supplier Queries
     */
    private static final String SQL_INSERT_INGREDIENT_SUPPLIER = "INSERT INTO INGREDIENT_SUPPLIER (Supplier_Name, Supplier_Category, Supplier_Location, Supplier_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_INGREDIENT_SUPPLIER = "SELECT * FROM INGREDIENT_SUPPLIER";
    
    /**
     *
     * @return int Create Ingredient_Supplier Function
     */
    public int createIngredientSupplier(IngredientSupplier ingredientSupplier) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
            preparedStatement.setString(4, ingredientSupplier.getEmail_Id());
            preparedStatement.setString(5, ingredientSupplier.getPhone_No());
            preparedStatement.setString(6, ingredientSupplier.getPassword());

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
    public ArrayList<IngredientSupplier> readAllIngredientSupplier() {
        
        ArrayList<IngredientSupplier> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                String category = resultSet.getString(2);
                String location = resultSet.getString(3);
                String emailID = resultSet.getString(4);
                String phoneNo = resultSet.getString(5);
                String password = resultSet.getString(6);

                IngredientSupplier obj = new IngredientSupplier();
                obj.setSupplier_Name(name);
                obj.setSupplier_Category(category);
                obj.setSupplier_Location(location);
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
     * @return boolean Validate Ingredient Supplier Function
     */
   public boolean validateIngredientSupplier(String Email_Id) {
        String query = "SELECT Password FROM INGREDIENT_SUPPLIER WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return int Update Ingredient_Supplier Function
     */
    public int updateIngredientSupplier(IngredientSupplier ingredientSupplier) {
        int result = 0;
        String SQL_UPDATE_INGREDIENT_SUPPLIER = "UPDATE INGREDIENT_SUPPLIER SET Supplier_Name = ? ,Supplier_Category = ? ,Supplier_Location = ?,Supplier_Date_Of_Establishment = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
            preparedStatement.setString(4, ingredientSupplier.getSupplier_Date_Of_Establishment());
            preparedStatement.setString(5, ingredientSupplier.getEmail_Id());
            preparedStatement.setString(6, ingredientSupplier.getPhone_No());
            preparedStatement.setString(7, ingredientSupplier.getPassword());


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
