/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part1;

import java.util.Scanner;

/**
 *
 * @author moodl
 */
public class LoginClass {


     
 private static String regUName;   //
 private static String regPWord;    //
 
    public LoginClass (String registeredUName,String registeredPWord){
 }
 
 public static void PerformmingLogin() {
    
    Scanner kb = new Scanner(System.in);
    
  String regUName = null;   //
  String regPWord = null; 
   
     System.out.println("****LOGIN****");
     
     System.out.println("PLEASE ENTER YOUR REGISTERED USERNAME");  //
     String UsernameCheck = kb.nextLine();
     
     System.out.println("PLEASE ENTER YOUR REGISTERED PASSWORD");
     String PasswordCheck = kb.nextLine();
     
 
     //COMPARISON    ////
     
     if (UsernameCheck.equals (regUName) && PasswordCheck.equals (regPWord)) {
         System.out.println("YOUR LOGIN WAS SUCCESSFUL \n" );
         System.out.println("WELCOME TO TASK ONE");  //
     }else{
     
         System.out.println("INVALID LOGIN DETAILS"
                             + "YOU MAY TRY AGAIN!");   ///
          }
       }
} 
    
    
    
    
    
    
  

