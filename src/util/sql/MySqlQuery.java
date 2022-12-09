///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package util.sql;
//
//import classes.Distributor;
//import classes.Doctor;
//import classes.FDA;
//import classes.Hospital;
//import classes.IngredientSupplier;
//import classes.Manufacturer;
//import classes.Medicine;
//import classes.Patient;
//import classes.Pharmacy;
//import java.sql.*;
//import java.util.ArrayList;
//import java.sql.Date;
////import java.util.Date;
//
///**
// *
// * @author Amulya
// */
//public class MySqlQuery {
//
//    
//    /**
//     * DataBase Connection Details
//     */
//    private final String URL = "jdbc:mysql://localhost:3306/AVS";
//    private final String USER = "root";
//    private final String PASSWORD = "!1qaz@2wsx";
//
//    /**
//     * Patient Queries
//     */
//    private static final String SQL_INSERT_PATIENT = "INSERT INTO PATIENT (Patient_Name, Patient_Age, Patient_Race,Patient_Gender,Patient_Location,Ailments,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
//    private static final String SQL_READ_PATIENT = "SELECT * FROM PATIENT";
//                                                                                                 
//    /**
//     * Doctor Queries
//     */
//    private static final String SQL_INSERT_DOCTOR = "INSERT INTO DOCTOR (Doctor_Name, Doctor_Age, Doctor_Race,Doctor_Gender,Doctor_Location,Speciality,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
//    private static final String SQL_READ_DOCTOR = "SELECT * FROM DOCTOR";
//    
//    /**
//     * Ingredient_Supplier Queries
//     */
//    private static final String SQL_INSERT_INGREDIENT_SUPPLIER = "INSERT INTO INGREDIENT_SUPPLIER (Supplier_Name, Supplier_Category, Supplier_Location, Supplier_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
//    private static final String SQL_READ_INGREDIENT_SUPPLIER = "SELECT * FROM INGREDIENT_SUPPLIER";
//    
//    /**
//     * Manufacturer Queries
//     */
//    private static final String SQL_INSERT_MANUFACTURER = "INSERT INTO MANUFACTURER (Manufacturer_Name, Type_Of_Medicine, Manufacturer_Location, Manufacturer_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
//    private static final String SQL_READ_MANUFACTURER = "SELECT * FROM MANUFACTURER";
//    
//    /**
//     * FDA Queries
//     */
//    private static final String SQL_INSERT_FDA = "INSERT INTO FDA (FDA_Board_Name, FDA_City, FDA_Country,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?)";
//    private static final String SQL_READ_FDA= "SELECT * FROM FDA";
//    
//    /**
//     * Distributor Queries
//     */
//    private static final String SQL_INSERT_DISTRIBUTOR = "INSERT INTO DISTRIBUTOR (Distributor_Name, Distributor_Location, Distributor_Date_Of_Establishment, Distributor_Mode_Of_Transportation, Distributor_Price,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?)";
//    private static final String SQL_READ_DISTRIBUTOR = "SELECT * FROM DISTRIBUTOR";
//    
//    /**
//     * Pharmacy Queries
//     */
//    private static final String SQL_INSERT_PHARMACY = "INSERT INTO PHARMACY (Pharmacy_Name, Pharmacy_Location, Pharmacy_Inventory_Size,Email_Id,Phone_No,Password ) VALUES (?,?,?,?,?,?)";
//    private static final String SQL_READ_PHARMACY = "SELECT * FROM PHARMACY";
//    
//    /**
//     * Hospital Queries
//     */
//    private static final String SQL_INSERT_HOSPITAL = "INSERT INTO HOSPITAL (Hospital_Name, Hospital_Location, Hospital_Speciality,Email_Id,Phone_No,Password ) VALUES (?,?,?,?,?,?)";
//    private static final String SQL_READ_HOSPITAL = "SELECT * FROM HOSPITAL";
//    
//    /**
//     * Medicine Queries
//     */
//    private static final String SQL_INSERT_MEDICINE = "INSERT INTO MEDICINE (Medicine_Name, Medicine_Status, Medicine_Category, Date_Of_Manufacture, Shell_Life, Manufacturer_Name ) VALUES (?,?,?,?,?,?)";
//    private static final String SQL_READ_MEDICINE = "SELECT * FROM MEDICINE";
//    
//    
//   
//    /**
//     *
//     * @return int Create Patient Function
//     */
//    public int createPatient(Patient patient) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PATIENT)) {
//
//            preparedStatement.setString(1, patient.getPatient_Name());
//            preparedStatement.setInt(2, patient.getPatient_Age());
//            preparedStatement.setString(3, patient.getPatient_Race());
//            preparedStatement.setString(4, patient.getPatient_Gender());
//            preparedStatement.setString(5, patient.getPatient_Location());
//            preparedStatement.setString(6, patient.getAilments());
//            preparedStatement.setString(7, patient.getEmail_Id());
//            preparedStatement.setString(8, patient.getPhone_No());
//            preparedStatement.setString(9, patient.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Doctor Function
//     */
//    public int createDoctor(Doctor doctor) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DOCTOR)) {
//
//            preparedStatement.setString(1,doctor.getDoctor_Name() );
//            preparedStatement.setInt(2, doctor.getDoctor_Age());
//            preparedStatement.setString(3, doctor.getDoctor_Race());
//            preparedStatement.setString(4, doctor.getDoctor_Gender());
//            preparedStatement.setString(5, doctor.getDoctor_Location());
//            preparedStatement.setString(6, doctor.getSpeciality());
//            preparedStatement.setString(7, doctor.getEmail_Id());
//            preparedStatement.setString(8, doctor.getPhone_No());
//            preparedStatement.setString(9, doctor.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Ingredient_Supplier Function
//     */
//    public int createIngredientSupplier(IngredientSupplier ingredientSupplier) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_INGREDIENT_SUPPLIER)) {
//
//            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
//            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
//            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
//            preparedStatement.setString(4, ingredientSupplier.getEmail_Id());
//            preparedStatement.setString(5, ingredientSupplier.getPhone_No());
//            preparedStatement.setString(6, ingredientSupplier.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Manufacturer Function
//     */
//    public int createManufacturer(Manufacturer manufacturer) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MANUFACTURER)) {
//
//            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
//            preparedStatement.setString(2, manufacturer.getType_Of_Medicine());
//            preparedStatement.setString(3, manufacturer.getManufacturer_Location());
//            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
//            preparedStatement.setString(5, manufacturer.getEmail_Id());
//            preparedStatement.setString(6, manufacturer.getPhone_No());
//            preparedStatement.setString(7, manufacturer.getPassword());
//            
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create FDA Function
//     */
//    public int createFDA(FDA fda) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_FDA)) {
//
//            preparedStatement.setString(1, fda.getFDA_Board_Name());
//            preparedStatement.setString(2, fda.getFDA_City());
//            preparedStatement.setString(3, fda.getFDA_Country());
//            preparedStatement.setString(4, fda.getEmail_Id());
//            preparedStatement.setString(5, fda.getPhone_No());
//            preparedStatement.setString(6, fda.getPassword());
//            
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Distributor Function
//     */
//    public int createDistributor(Distributor distributor) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DISTRIBUTOR)) {
//
//            preparedStatement.setString(1, distributor.getDistributor_Name());
//            preparedStatement.setString(2, distributor.getDistributor_Location());
//            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
//            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
//            preparedStatement.setInt(5, distributor.getDistributor_Price());
//            preparedStatement.setString(6, distributor.getPhone_No());
//            preparedStatement.setString(7, distributor.getPassword());
//            preparedStatement.setString(8, distributor.getPassword());
//            
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Pharmacy Function
//     */
//    public int createPharmacy(Pharmacy pharmacy) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PHARMACY)) {
//
//            preparedStatement.setString(1, pharmacy.getPharmacy_Name());
//            preparedStatement.setString(2, pharmacy.getPharmacy_Location());
//            preparedStatement.setInt(3, pharmacy.getPharmacy_Inventory_Size());
//            preparedStatement.setString(4, pharmacy.getEmail_Id());
//            preparedStatement.setString(5, pharmacy.getPhone_No());
//            preparedStatement.setString(6, pharmacy.getPassword());
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Create Hospital Function
//     */
//    public int createHospital(Hospital hospital) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_HOSPITAL)) {
//
//            preparedStatement.setString(1, hospital.getHospital_Name());
//            preparedStatement.setString(2, hospital.getHospital_Location());
//            preparedStatement.setString(3, hospital.getHospital_Speciality());
//            preparedStatement.setString(4, hospital.getEmail_Id());
//            preparedStatement.setString(5, hospital.getPhone_No());
//            preparedStatement.setString(6, hospital.getPassword());
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }   
//    /**
//     *
//     * @return int Create Medicine Function
//     */
//    public int createMedicine(Medicine medicine) {
//        int result = 0;
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MEDICINE)) {
//
//            preparedStatement.setString(1, medicine.getMedicine_Name());
//            preparedStatement.setString(2, medicine.getMedicine_Status());
//            preparedStatement.setString(3, medicine.getMedicine_Category());
//            preparedStatement.setDate(4, medicine.getDate_Of_Manufacture());
//            preparedStatement.setInt(5, medicine.getShell_Life());
//            preparedStatement.setString(6, medicine.getManufacturer_Name());
//            
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }   
//    
//    /**
//     *
//     * Select all medicine function
//     */
//    public ArrayList<Medicine> readAllMedicine() {
//        
//        ArrayList<Medicine> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MEDICINE)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String status = resultSet.getString(2);
//                String category = resultSet.getString(3);
//                Date dom = resultSet.getDate(4);
//                int shell_life = resultSet.getInt(5);
//                String manufacturer_name = resultSet.getString(6);
//
//                Medicine obj = new Medicine();
//                obj.setMedicine_Name(name);
//                obj.setMedicine_Status(status);
//                obj.setMedicine_Category(category);
//                obj.setDate_Of_Manufacture(dom);
//                obj.setShell_Life(shell_life);
//                obj.setManufacturer_Name(manufacturer_name);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    
//    /**
//     *
//     * Select all patient function
//     */
//    public ArrayList<Patient> readAllPatient() {
//        
//        ArrayList<Patient> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PATIENT)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                int age = resultSet.getInt(2);
//                String race = resultSet.getString(3);
//                String gender = resultSet.getString(4);
//                String location = resultSet.getString(5);
//                String ailments = resultSet.getString(6);
//                String emailID = resultSet.getString(7);
//                String phoneNo = resultSet.getString(8);
//                String password = resultSet.getString(9);
//
//                Patient obj = new Patient();
//                obj.setPatient_Name(name);
//                obj.setPatient_Age(age);
//                obj.setPatient_Race(race);
//                obj.setPatient_Gender(gender);
//                obj.setPatient_Location(location);
//                obj.setAilments(ailments);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    /**
//     *
//     * Select all doctor function
//     */
//    public ArrayList<Doctor> readAllDoctor() {
//        
//        ArrayList<Doctor> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_DOCTOR)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                int age = resultSet.getInt(2);
//                String race = resultSet.getString(3);
//                String gender = resultSet.getString(4);
//                String location = resultSet.getString(5);
//                String speciality = resultSet.getString(6);
//                String emailID = resultSet.getString(7);
//                String phoneNo = resultSet.getString(8);
//                String password = resultSet.getString(9);
//
//                Doctor obj = new Doctor();
//                obj.setDoctor_Name(name);
//                obj.setDoctor_Age(age);
//                obj.setDoctor_Race(race);
//                obj.setDoctor_Gender(gender);
//                obj.setDoctor_Location(location);
//                obj.setSpeciality(speciality);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    /**
//     *
//     * Select all ingredient supplier function
//     */
//    public ArrayList<IngredientSupplier> readAllIngredientSupplier() {
//        
//        ArrayList<IngredientSupplier> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String category = resultSet.getString(2);
//                String location = resultSet.getString(3);
//                String emailID = resultSet.getString(4);
//                String phoneNo = resultSet.getString(5);
//                String password = resultSet.getString(6);
//
//                IngredientSupplier obj = new IngredientSupplier();
//                obj.setSupplier_Name(name);
//                obj.setSupplier_Category(category);
//                obj.setSupplier_Location(location);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    /**
//     *
//     * Select all manufacturer function
//     */
//    public ArrayList<Manufacturer> readAllManufacturer() {
//        
//        ArrayList<Manufacturer> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String medicine_type = resultSet.getString(2);
//                String location = resultSet.getString(3);
//                Date doe = resultSet.getDate(4);
//                String emailID = resultSet.getString(5);
//                String phoneNo = resultSet.getString(6);
//                String password = resultSet.getString(7);
//
//                Manufacturer obj = new Manufacturer();
//                obj.setManufacturer_Name(name);
//                obj.setType_Of_Medicine(medicine_type);
//                obj.setManufacturer_Location(location);
//                obj.setManufacturer_Date_Of_Establishment(doe);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    
//    /**
//     *
//     * Select all distributor function
//     */
//    public ArrayList<Distributor> readAllDistributor() {
//        
//        ArrayList<Distributor> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_DISTRIBUTOR)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String location = resultSet.getString(2);
//                Date doe = resultSet.getDate(3);
//                String transportation = resultSet.getString(4);
//                int price = resultSet.getInt(5);
//                String emailID = resultSet.getString(6);
//                String phoneNo = resultSet.getString(7);
//                String password = resultSet.getString(8);
//
//                Distributor obj = new Distributor();
//                obj.setDistributor_Name(name);
//                obj.setDistributor_Location(location);
//                obj.setDistributor_Date_Of_Establishment(doe);
//                obj.setDistributor_Mode_Of_Transportation(transportation);
//                obj.setDistributor_Price(price);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    /**
//     *
//     * Select all FDA function
//     */
//    public ArrayList<FDA> readAllFDA() {
//        
//        ArrayList<FDA> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String city = resultSet.getString(2);
//                String country = resultSet.getString(3);
//                String emailID = resultSet.getString(4);
//                String phoneNo = resultSet.getString(5);
//                String password = resultSet.getString(6);
//
//                FDA obj = new FDA();
//                obj.setFDA_Board_Name(name);
//                obj.setFDA_City(city);
//                obj.setFDA_Country(country);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    
//    /**
//     *
//     * Select all Pharmacy function
//     */
//    public ArrayList<Pharmacy> readAllPharmacy() {
//        
//        ArrayList<Pharmacy> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String location = resultSet.getString(2);
//                int inventory_size = resultSet.getInt(3);
//                String emailID = resultSet.getString(4);
//                String phoneNo = resultSet.getString(5);
//                String password = resultSet.getString(6);
//
//                Pharmacy obj = new Pharmacy();
//                obj.setPharmacy_Name(name);
//                obj.setPharmacy_Location(location);
//                obj.setPharmacy_Inventory_Size(inventory_size);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    /**
//     *
//     * Select all Hospital function
//     */
//    public ArrayList<Hospital> readAllHospital() {
//        
//        ArrayList<Hospital> record = new ArrayList<>();
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                String name = resultSet.getString(1);
//                String location = resultSet.getString(2);
//                String speciality = resultSet.getString(3);
//                String emailID = resultSet.getString(4);
//                String phoneNo = resultSet.getString(5);
//                String password = resultSet.getString(6);
//
//                Hospital obj = new Hospital();
//                obj.setHospital_Name(name);
//                obj.setHospital_Location(location);
//                obj.setHospital_Speciality(speciality);
//                obj.setEmail_Id(emailID);
//                obj.setPhone_No(phoneNo);
//                obj.setPassword(password);
//                
//                record.add(obj);            
//                System.out.println(obj);
//            }      
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//
//        }
//        return record;
//
//    }
//    
//    
//   /**
//     *
//     * @return boolean Validate Patient Function
//     */
//   public boolean validatePatient(String Email_Id) {
//        String query = "SELECT Password FROM PATIENT WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//   
//    /**
//     *
//     * @return boolean Validate Doctor Function
//     */
//   public boolean validateDoctor(String Email_Id) {
//        String query = "SELECT Password FROM DOCTOR WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//   
//    /**
//     *
//     * @return boolean Validate Ingredient Supplier Function
//     */
//   public boolean validateIngredientSupplier(String Email_Id) {
//        String query = "SELECT Password FROM INGREDIENT_SUPPLIER WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//   
//    /**
//     *
//     * @return boolean Validate Manufacturer Function
//     */
//   public boolean validateManufacturer(String Email_Id) {
//        String query = "SELECT Password FROM MANUFACTURER WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//   
//    /**
//     *
//     * @return boolean Validate FDA Function
//     */
//   public boolean validateFDA(String Email_Id) {
//        String query = "SELECT Password FROM FDA WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//    /**
//     *
//     * @return boolean Validate Distributor Function
//     */
//   public boolean validateDistributor(String Email_Id) {
//        String query = "SELECT Password FROM DISTRIBUTOR WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//    /**
//     *
//     * @return boolean Validate Pharmacy Function
//     */
//   public boolean validatePharmacy(String Email_Id) {
//        String query = "SELECT Password FROM PHARMACY WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//   
//    /**
//     *
//     * @return boolean Validate Hospital Function
//     */
//   public boolean validateHospital(String Email_Id) {
//        String query = "SELECT Password FROM HOSPITAL WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
//        try {
//            Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);
//             Statement stmt = conn.prepareStatement(query);
//             ResultSet resultSet = stmt.executeQuery(query) ;
//             if(resultSet!= null) {
//                      return true ;
//             }else {
//                      return false ;
//            }
//           } catch (SQLException e) {
//                       e.printStackTrace();
//                      return true ;
//           }
// } 
//     /**
//     *
//     * @return int Update Patient Function
//     */
//   public int updatePatient(Patient patient) {
//   int result = 0;
//        String SQL_UPDATE_PATIENT = "UPDATE PATIENT SET Patient_Name = ? ,Patient_Age = ? ,Patient_Race = ?,Patient_Gender = ?,Patient_Location = ?,Ailments = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PATIENT)) {
//
//            preparedStatement.setString(1, patient.getPatient_Name());
//            preparedStatement.setInt(2, patient.getPatient_Age());
//            preparedStatement.setString(3, patient.getPatient_Race());
//            preparedStatement.setString(4, patient.getPatient_Gender());
//            preparedStatement.setString(5, patient.getPatient_Location());
//            preparedStatement.setString(6, patient.getAilments());
//            preparedStatement.setString(7, patient.getEmail_Id());
//            preparedStatement.setString(8, patient.getPhone_No());
//            preparedStatement.setString(9, patient.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update Doctor Function
//     */
//    public int updateDoctor(Doctor doctor) {
//        int result = 0;
//        String SQL_UPDATE_DOCTOR = "UPDATE DOCTOR SET Doctor_Name = ? ,Doctor_Age = ? ,Doctor_Race = ?,Doctor_Gender = ?,Doctor_Location = ?,Speciality = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DOCTOR)) {
//
//            preparedStatement.setString(1,doctor.getDoctor_Name() );
//            preparedStatement.setInt(2, doctor.getDoctor_Age());
//            preparedStatement.setString(3, doctor.getDoctor_Race());
//            preparedStatement.setString(4, doctor.getDoctor_Gender());
//            preparedStatement.setString(5, doctor.getDoctor_Location());
//            preparedStatement.setString(6, doctor.getSpeciality());
//            preparedStatement.setString(7, doctor.getEmail_Id());
//            preparedStatement.setString(8, doctor.getPhone_No());
//            preparedStatement.setString(9, doctor.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update Ingredient_Supplier Function
//     */
//    public int updateIngredientSupplier(IngredientSupplier ingredientSupplier) {
//        int result = 0;
//        String SQL_UPDATE_INGREDIENT_SUPPLIER = "UPDATE INGREDIENT_SUPPLIER SET Supplier_Name = ? ,Supplier_Category = ? ,Supplier_Location = ?,Supplier_Date_Of_Establishment = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_INGREDIENT_SUPPLIER)) {
//
//            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
//            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
//            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
//            preparedStatement.setString(4, ingredientSupplier.getSupplier_Date_Of_Establishment());
//            preparedStatement.setString(5, ingredientSupplier.getEmail_Id());
//            preparedStatement.setString(6, ingredientSupplier.getPhone_No());
//            preparedStatement.setString(7, ingredientSupplier.getPassword());
//
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update Manufacturer Function
//     */
//    public int updateManufacturer(Manufacturer manufacturer) {
//        int result = 0;
//        String SQL_UPDATE_MANUFACTURER = "UPDATE MANUFACTURER SET Manufacturer_Name = ? ,Type_Of_Medicine = ? ,Manufacturer_Location = ?,Manufacturer_Date_Of_Establishment = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MANUFACTURER)) {
//
//            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
//            preparedStatement.setString(2, manufacturer.getType_Of_Medicine());
//            preparedStatement.setString(3, manufacturer.getManufacturer_Location());
//            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
//            preparedStatement.setString(5, manufacturer.getEmail_Id());
//            preparedStatement.setString(6, manufacturer.getPhone_No());
//            preparedStatement.setString(7, manufacturer.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update FDA Function
//     */
//    public int updateFDA(FDA fda) {
//        int result = 0;
//        String SQL_UPDATE_FDA = "UPDATE FDA SET FDA_Board_Name = ? ,FDA_City = ? ,FDA_Country = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_FDA)) {
//
//            preparedStatement.setString(1, fda.getFDA_Board_Name());
//            preparedStatement.setString(2, fda.getFDA_City());
//            preparedStatement.setString(3, fda.getFDA_Country());
//            preparedStatement.setString(4, fda.getEmail_Id());
//            preparedStatement.setString(5, fda.getPhone_No());
//            preparedStatement.setString(6, fda.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update Distributor Function
//     */
//    public int updateDistributor(Distributor distributor) {
//        int result = 0;
//        String SQL_UPDATE_DISTRIBUTOR = "UPDATE FDA SET Distributor_Name = ? ,Distributor_Location = ? ,Distributor_Date_Of_Establishment = ? ,Distributor_Mode_Of_Transportation = ?, Distributor_Price = ?, Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DISTRIBUTOR)) {
//
//            preparedStatement.setString(1, distributor.getDistributor_Name());
//            preparedStatement.setString(2, distributor.getDistributor_Location());
//            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
//            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
//            preparedStatement.setInt(5, distributor.getDistributor_Price());
//            preparedStatement.setString(6, distributor.getPhone_No());
//            preparedStatement.setString(7, distributor.getPassword());
//            preparedStatement.setString(8, distributor.getPassword());
//
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//    /**
//     *
//     * @return int Update Pharmacy Function
//     */
//    public int updatePharmacy(Pharmacy pharmacy) {
//        int result = 0;
//        String SQL_UPDATE_PHARMACY = "UPDATE FDA SET Pharmacy_Name = ? ,Pharmacy_Location = ? ,Pharmacy_Inventory_Size = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PHARMACY)) {
//
//            preparedStatement.setString(1, pharmacy.getPharmacy_Name());
//            preparedStatement.setString(2, pharmacy.getPharmacy_Location());
//            preparedStatement.setInt(3, pharmacy.getPharmacy_Inventory_Size());
//            preparedStatement.setString(4, pharmacy.getEmail_Id());
//            preparedStatement.setString(5, pharmacy.getPhone_No());
//            preparedStatement.setString(6, pharmacy.getPassword());
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }    
//    /**
//     *
//     * @return int Update Hospital Function
//     */
//    public int updateHospital(Hospital hospital) {
//        int result = 0;
//        String SQL_UPDATE_HOSPITAL = "UPDATE FDA SET Hospital_Name = ? ,Hospital_Location = ? ,Hospital_Speciality = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_HOSPITAL)) {
//
//            preparedStatement.setString(1, hospital.getHospital_Name());
//            preparedStatement.setString(2, hospital.getHospital_Location());
//            preparedStatement.setString(3, hospital.getHospital_Speciality());
//            preparedStatement.setString(4, hospital.getEmail_Id());
//            preparedStatement.setString(5, hospital.getPhone_No());
//            preparedStatement.setString(6, hospital.getPassword());
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    }
//  /**
//     *
//     * @return int Update Medicine Function
//     */
//    public int updateMedicine(Medicine medicine) {
//        int result = 0;
//        String SQL_UPDATE_MEDICINE = "UPDATE MEDICINE SET Medicine_Name = ? ,Medicine_Status = ? ,Medicine_Category = ? , Date_Of_Manufacture = ?,Shell_Life = ?, Manufacturer_Name = ? WHERE Medicine_Name = ? ";
//        try ( Connection conn = DriverManager.getConnection(
//                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MEDICINE)) {
//
//            preparedStatement.setString(1, medicine.getMedicine_Name());
//            preparedStatement.setString(2, medicine.getMedicine_Status());
//            preparedStatement.setString(3, medicine.getMedicine_Category());
//            preparedStatement.setDate(4, medicine.getDate_Of_Manufacture());
//            preparedStatement.setInt(5, medicine.getShell_Life());
//            preparedStatement.setString(6, medicine.getManufacturer_Name());
//        
//            System.out.println("Prepared Statement ->" + preparedStatement);
//
//            int row = preparedStatement.executeUpdate();
//            result = row;
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//        }
//        return result;
//    } 
//    
//    
//}
//
//    
// 
