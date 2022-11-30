//package model.main;
//import java.lang.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.concurrent.ExecutionException;
//
//
//public class App {
//    public static void main(String[] args) throws ExecutionException, InterruptedException, Exception{
//        
//
//        String firstName = "Vignesh";
//        String lastName = "Vignesh";
//        String emailId = "Vignesh";
//        String userName = "Vignesh";
//        String mobileNumber = "Vignesh";                                    
//        int len = mobileNumber.length();
//        String password = "Vignesh";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://127.0.0.1:3306/swing_demo", "root", "!1qaz@2wsx")) {
//
//            if (conn != null) {
//                System.out.println("Connected to the database!");
//            } else {
//                System.out.println("Failed to make connection!");
//            }
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
