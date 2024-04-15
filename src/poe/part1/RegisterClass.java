/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author moodl  
 */
public class RegisterClass {
    
    Scanner kb = new Scanner(System.in);
    
   public String regUName;
   public String regPWord;
   
   
   
 public static void registerUser()  {
   Scanner kb = new Scanner(System.in);
   //VARIABLES          ///
   String surname;
   String UN;
   String name;
   String PassWord;
   boolean CheckPasswordComplexity = false ;
   boolean CheckUserName = false ;
   String registerUN;
   String registerPW;
   
   // USERNAME CHECK  /////
     do {
         System.out.println("USERNAME MUST CONTAIN _ AND BE ATLEAST 5 CHARACTERS IN LENGTH");
         UN = kb.nextLine();
         
         CheckUserName = UN.contains("-") && UN.length() >= 5 ;
         
         if (CheckUserName) {
             System.out.println("INVALID USERNAME- PLEASE TRY AGAIN");
         }
     } while (CheckUserName);
   
   
   // PASSWORD CHECK  ///
   
     do {
         System.out.println("PASSWORD MUST INCLUDE: \n"+
                            "1 CAPITAL LETTER \n"   +
                            "1 NUMBER \n"              +
                            "1 SPECIAL CHARACTER [@$#!] \n" +
                            "AND SHOULD BE A MINIMUM OF 8 CHARACTERS IN LENGTH");
                            
         
         PassWord = kb.nextLine();
         
         Pattern specialPattern = Pattern.compile("[a-z ,A-Z ,0-9 ,!-*]");
         Pattern digitPattern = Pattern.compile("\\d");
         Pattern capsPattern = Pattern.compile("A-Z");
         
         Matcher specialMatcher = specialPattern.matcher(PassWord);
         Matcher digitMatcher = digitPattern.matcher(PassWord);
         Matcher capsMatcher = capsPattern.matcher(PassWord);
         
         
         
         CheckPasswordComplexity = PassWord.length() >=8
                   && specialMatcher.find()
                   && digitMatcher.find()
                   && capsMatcher.find();
         
         
         if (CheckPasswordComplexity) {
             System.out.println("PASSWORD REQUEST WAS NOT MET - PLEASE TRY AGAIN");
         }
     } while (CheckPasswordComplexity);
   
   
     System.out.println("PLEASE ENTER YOUR FULL NAME");
     name = kb.nextLine();
     
     System.out.println("PLEASE ENTER YOUR SURNAME");
     surname = kb.nextLine();
     
     registerUN = UN;
     registerPW = PassWord;
     
     System.out.println("REISTRATION = DONE  ");
   
 }
   
}  
   
   
   
   
   
   
   
   
 
   

