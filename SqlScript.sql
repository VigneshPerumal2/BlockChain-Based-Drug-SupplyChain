CREATE DATABASE if not exists AVS;
USE AVS;

DROP TABLE IF EXISTS PATIENT;
CREATE TABLE IF NOT EXISTS PATIENT 
         ( 
         Patient_Id INTEGER PRIMARY KEY auto_increment, 
         Patient_Name TEXT   NOT NULL, 
         Patient_Age INTEGER NOT NULL, 
         Patient_Race TEXT   NOT NULL, 
         Patient_Gender TEXT NOT NULL, 
         Patient_Location TEXT  NOT NULL, 
         Ailments TEXT  NOT NULL, 
         Email_Id TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL,
		 Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS DOCTOR;
CREATE TABLE IF NOT EXISTS DOCTOR 
         ( 
         Doctor_Id INTEGER PRIMARY KEY auto_increment, 
         Doctor_Name     TEXT   NOT NULL, 
         Doctor_Age INTEGER NOT NULL, 
         Doctor_Race TEXT   NOT NULL, 
         Doctor_Gender TEXT NOT NULL, 
         Doctor_Location TEXT  NOT NULL, 
         Speciality TEXT  NOT NULL, 
         Email_Id TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL ,
         Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS INGREDIENT_SUPPLIER;
CREATE TABLE IF NOT EXISTS INGREDIENT_SUPPLIER 
         ( 
         Supplier_Id INTEGER PRIMARY KEY auto_increment, 
         Supplier_Name     TEXT   NOT NULL, 
         Supplier_Category TEXT NOT NULL, 
         Supplier_Location TEXT  NOT NULL, 
         Supplier_Date_Of_Establishment TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS MANUFACTURER;
CREATE TABLE IF NOT EXISTS MANUFACTURER 
         ( 
         Manufacturer_Id INTEGER PRIMARY KEY auto_increment, 
         Manufacturer_Name TEXT NOT NULL, 
         Type_Of_Medicine TEXT NOT NULL, 
         Manufacturer_Location TEXT  NOT NULL, 
         Manufacturer_Date_Of_Establishment TEXT  NOT NULL
         ); 
         
         
DROP TABLE IF EXISTS FDA;
CREATE TABLE IF NOT EXISTS FDA 
         ( 
         FDA_Id INTEGER PRIMARY KEY auto_increment, 
         FDA_Board_Name TEXT NOT NULL, 
         FDA_City TEXT NOT NULL, 
         FDA_Country TEXT  NOT NULL 
         ); 


DROP TABLE IF EXISTS DISTRIBUTOR;
CREATE TABLE IF NOT EXISTS DISTRIBUTOR 
         ( 
         Distributor_Id INTEGER PRIMARY KEY auto_increment, 
         Distributor_Name TEXT NOT NULL, 
         Distributor_Location TEXT NOT NULL, 
         Distributor_Date_Of_Establishment DATE NOT NULL,
         Distributor_Mode_Of_Transportation TEXT NOT NULL,
         Distributor_Price INTEGER NOT NULL
         );       
 
 
DROP TABLE IF EXISTS PHARMACY;
CREATE TABLE IF NOT EXISTS PHARMACY 
         ( 
         Pharmacy_Id INTEGER PRIMARY KEY auto_increment, 
         Pharmacy_Name TEXT NOT NULL, 
         Pharmacy_Location TEXT NOT NULL, 
		 Pharmacy_Inventory_Size INTEGER NOT NULL
         );       
      
DROP TABLE IF EXISTS HOSPITAL;
CREATE TABLE IF NOT EXISTS HOSPITAL 
         ( 
         Hospital_Id INTEGER PRIMARY KEY auto_increment, 
         Hospital_Name TEXT NOT NULL, 
         Hospital_Location TEXT NOT NULL, 
		 Hospital_Speciality TEXT NOT NULL
         );       
      

select * from patient;

