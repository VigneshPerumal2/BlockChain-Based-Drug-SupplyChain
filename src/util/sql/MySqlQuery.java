/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Patient;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Amulya
 */
public class MySqlQuery {

    
    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";

    /**
     * Patient Queries
     */
    private static final String SQL_INSERT_PATIENT = "INSERT INTO PATIENT (Patient_Name, Patient_Age, Patient_Race,Patient_Gender,Patient_Location,Ailments,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_PATIENT = "SELECT * FROM PATIENT";
                                                                                                 
    /**
     * Doctor Queries
     */
    private static final String SQL_INSERT_DOCTOR = "INSERT INTO DOCTOR (Doctor_Name, Doctor_Age, Doctor_Race,Doctor_Gender,Doctor_Location,Speciality,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_DOCTOR = "SELECT * FROM DOCTOR";
    
    /**
     * Ingredient_Supplier Queries
     */
    private static final String SQL_INSERT_INGREDIENT_SUPPLIER = "INSERT INTO INGREDIENT_SUPPLIER (Supplier_Name, Supplier_Category, Supplier_Location, Supplier_Date_Of_Establishment) VALUES (?,?,?,?)";
    private static final String SQL_READ_INGREDIENT_SUPPLIER = "SELECT * FROM INGREDIENT_SUPPLIER";
    
    /**
     * Manufacturer Queries
     */
    private static final String SQL_INSERT_MANUFACTURER = "INSERT INTO MANUFACTURER (Manufacturer_Name, Type_Of_Medicine, Manufacturer_Location, Manufacturer_Date_Of_Establishment) VALUES (?,?,?,?)";
    private static final String SQL_READ_MANUFACTURER = "SELECT * FROM MANUFACTURER";
    
    /**
     * FDA Queries
     */
    private static final String SQL_INSERT_FDA = "INSERT INTO FDA (FDA_Board_Name, FDA_City, FDA_Country) VALUES (?,?,?)";
    private static final String SQL_READ_FDA= "SELECT * FROM FDA";
    
    /**
     * Distributor Queries
     */
    private static final String SQL_INSERT_DISTRIBUTOR = "INSERT INTO DISTRIBUTOR (Distributor_Name, Distributor_Location, Distributor_Date_Of_Establishment, Distributor_Mode_Of_Transportation, Distributor_Price) VALUES (?,?,?,?,?)";
    private static final String SQL_READ_DISTRIBUTOR = "SELECT * FROM DISTRIBUTOR";
    
    /**
     * Pharmacy Queries
     */
    private static final String SQL_INSERT_PHARMACY = "INSERT INTO PHARMACY (Pharmacy_Name, Pharmacy_Location, Pharmacy_Inventory_Size ) VALUES (?,?,?)";
    private static final String SQL_READ_PHARMACY = "SELECT * FROM PHARMACY";
    
    /**
     * Hospital Queries
     */
    private static final String SQL_INSERT_HOSPITAL = "INSERT INTO HOSPITAL (Hospital_Name, Hospital_Location, Hospital_Speciality ) VALUES (?,?,?)";
    private static final String SQL_READ_HOSPITAL = "SELECT * FROM HOSPITAL";
    
    /**
     *
     * @return int Create Patient Function
     */
    public int createPatient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PATIENT)) {

            preparedStatement.setString(1, Patient_Name);
            preparedStatement.setInt(2, Patient_Age);
            preparedStatement.setString(3, Patient_Race);
            preparedStatement.setString(4, Patient_Gender);
            preparedStatement.setString(5, Patient_Location);
            preparedStatement.setString(6, Ailments);
            preparedStatement.setString(7, Email_Id);
            preparedStatement.setString(8, Phone_No);
            preparedStatement.setString(9, Password);

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
     * @return int Create Doctor Function
     */
    public int createDoctor(String Doctor_Name, int  Doctor_Age, String  Doctor_Race, String Doctor_Gender, String  Doctor_Location, String Speciality , String Email_Id, String Phone_No, String Password) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DOCTOR)) {

            preparedStatement.setString(1, Doctor_Name);
            preparedStatement.setInt(2, Doctor_Age);
            preparedStatement.setString(3, Doctor_Race);
            preparedStatement.setString(4, Doctor_Gender);
            preparedStatement.setString(5, Doctor_Location);
            preparedStatement.setString(6, Speciality);
            preparedStatement.setString(7, Email_Id);
            preparedStatement.setString(8, Phone_No);
            preparedStatement.setString(9, Password);

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
     * @return int Create Ingredient_Supplier Function
     */
    public int createIngredientSupplier(String Supplier_Name, String  Supplier_Category, String Supplier_Location, String  Supplier_Date_Of_Establishment) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, Supplier_Name);
            preparedStatement.setString(2, Supplier_Category);
            preparedStatement.setString(3, Supplier_Location);
            preparedStatement.setString(4, Supplier_Date_Of_Establishment);

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
     * @return int Create Manufacturer Function
     */
    public int createManufacturer(String Manufacturer_Name, String  Type_Of_Medicine, String Manufacturer_Location, String  Manufacturer_Date_Of_Establishment) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MANUFACTURER)) {

            preparedStatement.setString(1, Manufacturer_Name);
            preparedStatement.setString(2, Type_Of_Medicine);
            preparedStatement.setString(3, Manufacturer_Location);
            preparedStatement.setString(4, Manufacturer_Date_Of_Establishment);

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
     * @return int Create FDA Function
     */
    public int createFDA(String FDA_Board_Name, String  FDA_City, String FDA_Country) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_FDA)) {

            preparedStatement.setString(1, FDA_Board_Name);
            preparedStatement.setString(2, FDA_City);
            preparedStatement.setString(3, FDA_Country);

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
     * @return int Create Distributor Function
     */
    public int createDistributor(String Distributor_Name, String  Distributor_Location, Date Distributor_Date_Of_Establishment, String Distributor_Mode_Of_Transportation, int Distributor_Price) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DISTRIBUTOR)) {

            preparedStatement.setString(1, Distributor_Name);
            preparedStatement.setString(2, Distributor_Location);
            preparedStatement.setDate(3, Distributor_Date_Of_Establishment);
            preparedStatement.setString(4, Distributor_Mode_Of_Transportation);
            preparedStatement.setInt(5, Distributor_Price);

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
     * @return int Create Pharmacy Function
     */
    public int createPharmacy(String Pharmacy_Name, String  Pharmacy_Location, String Pharmacy_Inventory_Size ) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PHARMACY)) {

            preparedStatement.setString(1, Pharmacy_Name);
            preparedStatement.setString(2, Pharmacy_Location);
            preparedStatement.setString(3, Pharmacy_Inventory_Size);
        
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
     * @return int Create Hospital Function
     */
    public int createHospital(String Hospital_Name, String  Hospital_Location, String Hospital_Speciality ) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_HOSPITAL)) {

            preparedStatement.setString(1, Hospital_Name);
            preparedStatement.setString(2, Hospital_Location);
            preparedStatement.setString(3, Hospital_Speciality);
        
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
     * Select all patient function
     */
    public void readPatient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password) {
        int result = 0;
       // ArrayList<Patient> record;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PATIENT)) {

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
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }

    }
    
   /**
     *
     * @return boolean Validate Patient Function
     */
   public boolean validatePatient(String Email_Id) {
        String query = "SELECT Password FROM PATIENT WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return boolean Validate Doctor Function
     */
   public boolean validateDoctor(String Email_Id) {
        String query = "SELECT Password FROM DOCTOR WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return boolean Validate Hospital Function
     */
   public boolean validateHospital(String Email_Id) {
        String query = "SELECT Password FROM HOSPITAL WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
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
     * @return int Update Patient Function
     */
    public int updatePatient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No, String Password) {
        int result = 0;
        String SQL_UPDATE_PATIENT = "UPDATE PATIENT SET Patient_Name" +"\""+Patient_Name+"\""+"Patient_Age" +"\""+Patient_Age+"\""+"Patient_Race" +"\""+Patient_Race+"\""+"Patient_Gender" +"\""+Patient_Gender+"\""+"Patient_Location" +"\""+Patient_Location+"\""+"Ailments" +"\""+Ailments+"\""+"Email_Id" +"\""+Email_Id+"\""+"Phone_No" +"\""+Phone_No+"\""+"Password" +"\""+Password+"\""+" WHERE Email_Id =" +"\""+Email_Id+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PATIENT)) {

            preparedStatement.setString(1, Patient_Name);
            preparedStatement.setInt(2, Patient_Age);
            preparedStatement.setString(3, Patient_Race);
            preparedStatement.setString(4, Patient_Gender);
            preparedStatement.setString(5, Patient_Location);
            preparedStatement.setString(6, Ailments);
            preparedStatement.setString(7, Email_Id);
            preparedStatement.setString(8, Phone_No);
            preparedStatement.setString(9, Password);

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
     * @return int Update Doctor Function
     */
    public int updateDoctor(String Doctor_Name, int  Doctor_Age, String  Doctor_Race, String Doctor_Gender, String  Doctor_Location, String Speciality , String Email_Id, String Phone_No, String Password) {
        int result = 0;
        String SQL_UPDATE_DOCTOR = "UPDATE DOCTOR SET Doctor_Name" +"\""+Doctor_Name+"\""+"Doctor_Age" +"\""+Doctor_Age+"\""+"Doctor_Race" +"\""+Doctor_Race+"\""+"Doctor_Gender" +"\""+Doctor_Gender+"\""+"Doctor_Location" +"\""+Doctor_Location+"\""+"Speciality" +"\""+Speciality+"\""+"Email_Id" +"\""+Email_Id+"\""+"Phone_No" +"\""+Phone_No+"\""+"Password" +"\""+Password+"\""+" WHERE Email_Id =" +"\""+Email_Id+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DOCTOR)) {

            preparedStatement.setString(1, Doctor_Name);
            preparedStatement.setInt(2, Doctor_Age);
            preparedStatement.setString(3, Doctor_Race);
            preparedStatement.setString(4, Doctor_Gender);
            preparedStatement.setString(5, Doctor_Location);
            preparedStatement.setString(6, Speciality);
            preparedStatement.setString(7, Email_Id);
            preparedStatement.setString(8, Phone_No);
            preparedStatement.setString(9, Password);

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
    public int updateIngredientSupplier(String Supplier_Name, String  Supplier_Category, String Supplier_Location, String  Supplier_Date_Of_Establishment) {
        int result = 0;
        String SQL_UPDATE_INGREDIENT_SUPPLIER = "UPDATE INGREDIENT_SUPPLIER SET Supplier_Name" +"\""+Supplier_Name+"\""+"Supplier_Category" +"\""+Supplier_Category+"\""+"Supplier_Location" +"\""+Supplier_Location+"\""+"Supplier_Date_Of_Establishment" +"\""+Supplier_Date_Of_Establishment+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, Supplier_Name);
            preparedStatement.setString(2, Supplier_Category);
            preparedStatement.setString(3, Supplier_Location);
            preparedStatement.setString(4, Supplier_Date_Of_Establishment);

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
     * @return int Update Manufacturer Function
     */
    public int updateManufacturer(String Manufacturer_Name, String  Type_Of_Medicine, String Manufacturer_Location, String  Manufacturer_Date_Of_Establishment) {
        int result = 0;
        String SQL_UPDATE_MANUFACTURER = "UPDATE MANUFACTURER SET Manufacturer_Name" +"\""+Manufacturer_Name+"\""+"Type_Of_Medicine" +"\""+Type_Of_Medicine+"\""+"Manufacturer_Location" +"\""+Manufacturer_Location+"\""+"Manufacturer_Date_Of_Establishment" +"\""+Manufacturer_Date_Of_Establishment+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MANUFACTURER)) {

            preparedStatement.setString(1, Manufacturer_Name);
            preparedStatement.setString(2, Type_Of_Medicine);
            preparedStatement.setString(3, Manufacturer_Location);
            preparedStatement.setString(4, Manufacturer_Date_Of_Establishment);

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
     * @return int Update FDA Function
     */
    public int updateFDA(String FDA_Board_Name, String  FDA_City, String FDA_Country) {
        int result = 0;
        String SQL_UPDATE_FDA = "UPDATE FDA SET FDA_Board_Name" +"\""+FDA_Board_Name+"\""+"FDA_City" +"\""+FDA_City+"\""+"FDA_Country" +"\""+FDA_Country+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_FDA)) {

            preparedStatement.setString(1, FDA_Board_Name);
            preparedStatement.setString(2, FDA_City);
            preparedStatement.setString(3, FDA_Country);

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
     * @return int Update Distributor Function
     */
    public int updateDistributor(String Distributor_Name, String  Distributor_Location, Date Distributor_Date_Of_Establishment, String Distributor_Mode_Of_Transportation, int Distributor_Price) {
        int result = 0;
        String SQL_UPDATE_DISTRIBUTOR = "UPDATE DISTRIBUTOR SET Distributor_Name" +"\""+Distributor_Name+"\""+"Distributor_Location" +"\""+Distributor_Location+"\""+"Distributor_Date_Of_Establishment" +"\""+Distributor_Date_Of_Establishment+"\""+"Distributor_Mode_Of_Transportation" +"\""+Distributor_Mode_Of_Transportation+"\""+"Distributor_Price" +"\""+Distributor_Price+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DISTRIBUTOR)) {

            preparedStatement.setString(1, Distributor_Name);
            preparedStatement.setString(2, Distributor_Location);
            preparedStatement.setDate(3, Distributor_Date_Of_Establishment);
            preparedStatement.setString(4, Distributor_Mode_Of_Transportation);
            preparedStatement.setInt(5, Distributor_Price);

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
     * @return int Update Pharmacy Function
     */
    public int updatePharmacy(String Pharmacy_Name, String  Pharmacy_Location, String Pharmacy_Inventory_Size ) {
        int result = 0;
        String SQL_UPDATE_PHARMACY = "UPDATE PHARMACY SET Pharmacy_Name" +"\""+Pharmacy_Name+"\""+"Pharmacy_Location" +"\""+Pharmacy_Location+"\""+"Pharmacy_Inventory_Size" +"\""+Pharmacy_Inventory_Size+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY)) {

            preparedStatement.setString(1, Pharmacy_Name);
            preparedStatement.setString(2, Pharmacy_Location);
            preparedStatement.setString(3, Pharmacy_Inventory_Size);
        
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
     * @return int Update Hospital Function
     */
    public int updateHospital(String Hospital_Name, String  Hospital_Location, String Hospital_Speciality ) {
        int result = 0;
        String SQL_UPDATE_HOSPITAL = "UPDATE HOSPITAL SET Hospital_Name" +"\""+Hospital_Name+"\""+"Hospital_Location" +"\""+Hospital_Location+"\""+"Hospital_Speciality" +"\""+Hospital_Speciality+"\""+";";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_HOSPITAL)) {

            preparedStatement.setString(1, Hospital_Name);
            preparedStatement.setString(2, Hospital_Location);
            preparedStatement.setString(3, Hospital_Speciality);
        
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

    
 
