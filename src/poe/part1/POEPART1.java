/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part1;

import java.util.Scanner;

/**
 *
 * @author moodl
 */
public class POEPART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     startPage();
    }

    public static void startPage() {
        
    Scanner nr = new Scanner(System.in);
    
    int Answer ;
    
        do {
            System.out.println("***********WELCOME*************");
            
            System.out.println("-------START PAGE TO THE PROMGRAM--------");
            
            System.out.println("ENTER 1 TO REGISTER\n");
            
            System.out.println("ENTER 2 TO LOGIN\n");
            
            System.out.println("ENTER 0 IF YOU WANT TO EXIT THE PROGRAM\n");
            
            Answer = nr.nextInt();
            
            switch(Answer) //ignore the yellow comments - foccus on the red
            {   
                case 1 : RegisterClass.registerUser();break;
                
                case 2 : LoginClass.PerformmingLogin();break;
                
                case 0 : System.exit(0);break;
                
                default: System.out.println("INVALID CHOICE\n " + "PLEASE CHOOSE AGAIN ANOTHER CHOICE");break;
            }      
        } while (Answer !=0);
    
    }
    
}
