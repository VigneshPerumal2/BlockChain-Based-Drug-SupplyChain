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
         Supplier_Date_Of_Establishment TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
		 Phone_No TEXT  NOT NULL ,
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
         Phone_No TEXT  NOT NULL ,
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
         Phone_No TEXT  NOT NULL ,
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
         Phone_No TEXT  NOT NULL ,
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
         Phone_No TEXT  NOT NULL ,
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
         Phone_No TEXT  NOT NULL ,
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
         Manufacturer_Name TEXT NOT NULL
         );    
         
         
DROP TABLE IF EXISTS PRESCRIPTION;
CREATE TABLE IF NOT EXISTS PRESCRIPTION 
         ( 
         Prescription_Id INTEGER PRIMARY KEY auto_increment, 
         Patient_Id INTEGER NOT NULL, 
         Doctor_Id INTEGER NOT NULL, 
		 Prescription TEXT NOT NULL,
         Date_Of_Prescription DATE NOT NULL,
         FOREIGN KEY(Patient_Id) REFERENCES PATIENT(Patient_Id),
         FOREIGN KEY(Doctor_Id) REFERENCES DOCTOR(Doctor_Id)
         );   

DROP TABLE IF EXISTS PACKAGE;
CREATE TABLE IF NOT EXISTS PACKAGE 
         ( 
         Package_Id INTEGER PRIMARY KEY auto_increment, 
         Package_Date DATE NOT NULL, 
         Package_SKU INTEGER NOT NULL, 
		 Package_Quantity INTEGER NOT NULL,
         Type_Of_Package TEXT NOT NULL,
         Type_Of_Storage TEXT NOT NULL,
         Pickup_Location TEXT NOT NULL,
         Destination_Location TEXT NOT NULL,
         Package_Sender TEXT NOT NULL,
         Package_Receiver TEXT NOT NULL
         );   

DROP TABLE IF EXISTS SMART_TOKENS;
CREATE TABLE IF NOT EXISTS SMART_TOKENS 
         ( 
         Smart_Token_Id INTEGER PRIMARY KEY auto_increment,
         Smart_Token_Date DATE NOT NULL,
         Smart_Token_Time TIME NOT NULL,
         Medicine_Id INTEGER NOT NULL,
         FOREIGN KEY(Medicine_Id) REFERENCES MEDICINE(Medicine_Id)
         );  

DROP TABLE IF EXISTS PACKAGING;
CREATE TABLE IF NOT EXISTS PACKAGING 
         ( 
         Packaging_Id INTEGER PRIMARY KEY auto_increment,
         Packaging_Name TEXT NOT NULL,
         Type_Of_Packaging TEXT NOT NULL,
         Packaging_Location TEXT NOT NULL
         );
         
DROP TABLE IF EXISTS INGREDIENT_SUPPLIER_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS INGREDIENT_SUPPLIER_ORDER_BOOK 
         ( 
         Supplier_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Ingredient_Name TEXT NOT NULL,
         Supplier_OB_Quantity INTEGER NOT NULL,
         Supplier_OB_Price INTEGER NOT NULL,
         Supplier_OB_Status TEXT NOT NULL,
         Manufacturer_Id TEXT NOT NULL,
         FOREIGN KEY(Manufacturer_Id) REFERENCES MANUFACTURER(Manufacturer_Id)
         );

DROP TABLE IF EXISTS FDA_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS FDA_ORDER_BOOK 
         ( 
         FDA_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
		 Medicine_Id INTEGER NOT NULL,
         Manufacturer_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         FDA_Id INTEGER NOT NULL,
         FOREIGN KEY(Medicine_Id) REFERENCES MEDICINE(Medicine_Id),
         FOREIGN KEY(FDA_Id) REFERENCES FDA(FDA_Id),
         FOREIGN KEY(Manufacturer_Id) REFERENCES MANUFACTURER(Manufacturer_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id)
         );

DROP TABLE IF EXISTS MANUFACTURER_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS MANUFACTURER_ORDER_BOOK 
         ( 
         Manufacturer_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Manufacturer_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         Supplier_Id INTEGER NOT NULL,
         FOREIGN KEY(Supplier_Id) REFERENCES INGREDIENT_SUPPLIER(Supplier_Id),
         FOREIGN KEY(Manufacturer_Id) REFERENCES MANUFACTURER(Manufacturer_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id)
         );

DROP TABLE IF EXISTS DISTRIBUTOR_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS DISTRIBUTOR_ORDER_BOOK 
         ( 
         Distributor_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Distributor_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         Packaging_Id INTEGER NOT NULL,
         Receiver_Token INTEGER NOT NULL,
         FOREIGN KEY(Distributor_Id) REFERENCES DISTRIBUTOR(Distributor_Id),
         FOREIGN KEY(Packaging_Id) REFERENCES PACKAGING(Packaging_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id),
         FOREIGN KEY(Receiver_Token) REFERENCES TRANSACTION(Receiver_Token)
         );

DROP TABLE IF EXISTS PHARMACY_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS PHARMACY_ORDER_BOOK 
         ( 
         Pharmacy_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Distributor_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         Pharmacy_Id INTEGER NOT NULL,
         Receiver_Token INTEGER NOT NULL,
         FOREIGN KEY(Distributor_Id) REFERENCES DISTRIBUTOR(Distributor_Id),
         FOREIGN KEY(Pharmacy_Id) REFERENCES PHARMACY(Pharmacy_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id),
         FOREIGN KEY(Receiver_Token) REFERENCES TRANSACTION(Receiver_Token)
         );

DROP TABLE IF EXISTS PACKAGER_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS PACKAGER_ORDER_BOOK 
         ( 
         Packager_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Packaging_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         Manufacturer_Id INTEGER NOT NULL,
         FOREIGN KEY(Packaging_Id) REFERENCES PACKAGING(Packaging_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id),
         FOREIGN KEY(Manufacturer_Id) REFERENCES MANUFACTURER(Manufacturer_Id)
         );

DROP TABLE IF EXISTS HOSPITAL_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS HOSPITAL_ORDER_BOOK 
         ( 
         Hospital_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
         Distributor_Id INTEGER NOT NULL,
         Package_Id INTEGER NOT NULL,
         Hospital_Id INTEGER NOT NULL,
         FOREIGN KEY(Distributor_Id) REFERENCES DISTRIBUTOR(Distributor_Id),
         FOREIGN KEY(Package_Id) REFERENCES PACKAGE(Package_Id),
         FOREIGN KEY(Hospital_Id) REFERENCES HOSPITAL(Hospital_Id)
         );

