DROP DATABASE IF EXISTS AVS;
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
         Phone_No TEXT  NOT NULL ,
         Email_Id TEXT  NOT NULL, 
         Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS INGREDIENT_SUPPLIER;
CREATE TABLE IF NOT EXISTS INGREDIENT_SUPPLIER 
         ( 
         Supplier_Id INTEGER PRIMARY KEY auto_increment, 
         Supplier_Name     TEXT   NOT NULL, 
         Supplier_Category TEXT NOT NULL, 
         Supplier_Location TEXT  NOT NULL, 
         Supplier_Date_Of_Establishment TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL,
         Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS MANUFACTURER;
CREATE TABLE IF NOT EXISTS MANUFACTURER 
         ( 
         Manufacturer_Id INTEGER PRIMARY KEY auto_increment, 
         Manufacturer_Name TEXT NOT NULL, 
         Type_Of_Medicine TEXT NOT NULL, 
         Manufacturer_Location TEXT  NOT NULL, 
         Manufacturer_Date_Of_Establishment TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
		Phone_No TEXT  NOT NULL,
         Password TEXT  NOT NULL
         ); 
         
         
DROP TABLE IF EXISTS FDA;
CREATE TABLE IF NOT EXISTS FDA 
         ( 
         FDA_Id INTEGER PRIMARY KEY auto_increment, 
         FDA_Board_Name TEXT NOT NULL, 
         FDA_City TEXT NOT NULL, 
         FDA_Country TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         ); 


DROP TABLE IF EXISTS DISTRIBUTOR;
CREATE TABLE IF NOT EXISTS DISTRIBUTOR 
         ( 
         Distributor_Id INTEGER PRIMARY KEY auto_increment, 
         Distributor_Name TEXT NOT NULL, 
         Distributor_Location TEXT NOT NULL, 
         Distributor_Date_Of_Establishment DATE NOT NULL,
         Distributor_Mode_Of_Transportation TEXT NOT NULL,
         Distributor_Price INTEGER NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
 
 
DROP TABLE IF EXISTS PHARMACY;
CREATE TABLE IF NOT EXISTS PHARMACY 
         ( 
         Pharmacy_Id INTEGER PRIMARY KEY auto_increment, 
         Pharmacy_Name TEXT NOT NULL, 
         Pharmacy_Location TEXT NOT NULL, 
		 Pharmacy_Inventory_Size INTEGER NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
      
DROP TABLE IF EXISTS HOSPITAL;
CREATE TABLE IF NOT EXISTS HOSPITAL 
         ( 
         Hospital_Id INTEGER PRIMARY KEY auto_increment, 
         Hospital_Name TEXT NOT NULL, 
         Hospital_Location TEXT NOT NULL, 
		 Hospital_Speciality TEXT NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
 
DROP TABLE IF EXISTS MEDICINE;
CREATE TABLE IF NOT EXISTS MEDICINE 
         ( 
         Medicine_Id INTEGER PRIMARY KEY auto_increment, 
         Medicine_Name TEXT NOT NULL, 
         Medicine_Status TEXT NOT NULL, 
		 Medicine_Category TEXT NOT NULL,
         Date_Of_Manufacture DATE NOT NULL,	
         Medicine_Shell_Life INTEGER NOT NULL,
         Manufacturer_Name TEXT NOT NULL,
         Ingredients TEXT NOT NULL
         );    


DROP TABLE IF EXISTS PHARMACY_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS PHARMACY_ORDER_BOOK 
         ( 
         Pharmacy_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
		 Medicine_Id INTEGER NOT NULL,
         Pharmacy_Id INTEGER NOT NULL,
         Status TEXT NOT NULL,
         FOREIGN KEY(Medicine_Id) REFERENCES MEDICINE(Medicine_Id),
         
         FOREIGN KEY(Pharmacy_Id) REFERENCES PHARMACY(Pharmacy_Id)
         );

DROP TABLE IF EXISTS HOSPITAL_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS HOSPITAL_ORDER_BOOK 
         ( 
         Hospital_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
		 Medicine_Id INTEGER NOT NULL,
         Hospital_Id INTEGER NOT NULL,
         Status TEXT NOT NULL,
         FOREIGN KEY(Medicine_Id) REFERENCES MEDICINE(Medicine_Id),
         
         FOREIGN KEY(Hospital_Id) REFERENCES HOSPITAL(Hospital_Id)
         );
         
DROP TABLE IF EXISTS ADMIN;
CREATE TABLE IF NOT EXISTS ADMIN 
         ( 
         Admin_Role INTEGER PRIMARY KEY auto_increment, 
         Admin_Id INTEGER NOT NULL,
         Admin_Password INTEGER NOT NULL
         );       
         
use  AVS;
select * from patient;
select * from manufacturer;
select * from INGREDIENT_SUPPLIER;
select * from medicine;
select * from Pharmacy;

