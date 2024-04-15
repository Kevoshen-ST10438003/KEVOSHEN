/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package poe.part1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author moodl
 */
public class LoginClassNGTest {
    
    public LoginClassNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of PerformLogin method, of class LoginClass.
     */
    @Test
    public void testPerformLogin() {
        System.out.println("PerformLogin");
        LoginClass instance = null;
        instance.PerformmingLogin();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //public  void testUsernameFormattedCorrectly(){
      //  userAuthorisation auth = new userAuthorisation;
      //  assertTrue (auth.isUsernameFormatted("kyl_1"));
       //// assertEquals("username incorrectly formatted. Ensure that your username is no more than 5 characters in length and contains an underscore ",auth.getSystemResponse());
            
    }
    
    // public void TestUsernameFormattedIncorrectly();
    // public void testPasswordCorrectly();
    // public void testPasswprdicorrectlyFormatted(0;
    // void testloginUsername
    //public void testLoginPassword
   // this is all the ones you are missing and you need to code a userAuthorisation so that the nit test can run the code and test whether your code is correct
  //  currently you have a unit test but it isnt teating anything to do with your code - run the test file to see what i mean
