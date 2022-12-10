///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package model.sendmail;
//
///**
// *
// * @author amulyamurahari
// */
//import java.util.*; 
//import javax.mail.internet.*;  
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
//import java.util.Properties;
//import javax.activation.*;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//  
//public class SendMail  
//{  
// public void mailsend(){  
//      String to = "avs.pharmacy.neu@gmail.com";//change accordingly  
//      String from = "avs.pharmacy.neu@gmail.com"; 
//      String host = "smtp.gmail.com";//or IP address  
//  
//     //Get the session object  
//      Properties properties = System.getProperties();  
//      properties.setProperty("mail.smtp.host", host);
//      properties.put("mail.smtp.starttls.enable","true");
//      properties.put("mail.smtp.auth","true");
//      properties.put("mail.smtp.password", "password");
//      properties.setProperty("mail.smtp.port","587");
//      
//      Session session = Session.getDefaultInstance(properties);  
//  
//     //compose the message  
//      try{  
//         MimeMessage message = new MimeMessage(session);  
//         message.setFrom(new InternetAddress(from));  
//         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
//         message.setSubject("Ping");  
//         message.setText("Hello, this is example of sending email  ");  
//  
//         // Send message  
//         Transport.send(message);  
//         System.out.println("message sent successfully....");  
//  
//      }catch (MessagingException mex) {mex.printStackTrace();}  
//   }  
//}  
