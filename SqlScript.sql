
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
select * from patient;

