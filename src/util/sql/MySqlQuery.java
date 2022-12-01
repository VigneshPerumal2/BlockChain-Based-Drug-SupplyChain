/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vigy
 */
public class MySqlQuery {
//     try {
//                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "root");
//
//                    String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
//                        password + "','" + emailId + "','" + mobileNumber + "')";
//
//                    Statement sta = connection.createStatement();
//                    int x = sta.executeUpdate(query);
//                    if (x == 0) {
//                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
//                    } else {
//                        JOptionPane.showMessageDialog(btnNewButton,
//                            "Welcome, " + msg + "Your account is sucessfully created");
//                    }
//                    connection.close();
//                } catch (Exception exception) {
//                    exception.printStackTrace();
//                }

    public int registerPatient() {
//           String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, String Email_Id, String Phone_No
        String Patient_Name = "Amulya";
        int Patient_Age = 23;
        String Patient_Race = "Asian";
        String Patient_Gender = "Female";
        String Patient_Location = "India";
        String Ailments = "Cold";
        String Email_Id = "amulya@gmail.com";
        String Phone_No = "9035904347";

        Connection con = null;
        int result = 0;
        try {
            System.out.println("Started Querying...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AVS", "root", "!1qaz@2wsx");
            System.out.println("Connected to Database...");
            String query = "INSERT INTO PATIENT values(101,'" + Patient_Name + "'," + Patient_Age + ",'" + Patient_Race + "','"
                    + Patient_Gender + "','" + Patient_Location + "','" + Ailments + "','" + Email_Id + "','" + Phone_No + "');";

            Statement sta = con.createStatement();
            int x = sta.executeUpdate(query);
            System.out.println("Ended Querying..." + x);
            result = x;
            con.close();
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return result;
    }
}
