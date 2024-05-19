/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package todotask2;

import PROG5121_POE_ST10451309.RegistrationSystem;
import PROG5121_POE_ST10451309.LoginSystem;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static PROG5121_POE_ST10451309.LoginSystem.passwords;
import static PROG5121_POE_ST10451309.LoginSystem.usernames;
/**
 *
 * @author lab_services_student
 */
public class RegistrationSystemTest {
   
    public RegistrationSystemTest() {
    }

    @Test
    public void testRegistrationPage() {
    }

    @Test
    public void testCheckUserName_AssertEquals1() {
  
   String username = "kyl_1";
   assertEquals(true,RegistrationSystem.checkUserName(username));
   System.out.println("Welcome < user first name >,  <user last name> it is great to see you");
  
    }
    
    @Test
    public void testCheckUserName_AsesertEquals2() {
   
   String username = "kyle!!!!!!!";
   assertEquals(false,RegistrationSystem.checkUserName(username));
   System.out.println("Username is not correctly formatted please ensure that your surname contains an undersore and is no more than 5 charcters in length");
    
    }
    
     @Test
    public void testCheckUserName_AssertTrue() {
  
        String username = "kyl_1";
  
   assertTrue(RegistrationSystem.checkUserName(username));
 
  
    }
     @Test
    public void testCheckUserName_AssertFalse() {
  
        String username = "kyle!!!!!";
  
   assertFalse(RegistrationSystem.checkUserName(username));
 
  
    }
   
    @Test
    public void testCheckPasswordComplexity_AssertEquals1() {
    
    String expected = "Ch&&sec@ke99";
    assertEquals(true,RegistrationSystem.checkPasswordComplexity(expected));
     System.out.println("Password successfully captured");
    }
    
    @Test
    public void testCheckPasswordComplexity_AssertEquals2() {
        
    String expected = "password";
    assertEquals(false,RegistrationSystem.checkPasswordComplexity(expected));
    System.out.println("Password is not correctly formatted, please ensure that the pssword contains at least 8 character, a capital letter, a number and a special character");
    
    }
    @Test
     public void testCheckPasswordComplexity_AssertTrue() {
    
    String expected = "Ch&&sec@ke99";
    assertTrue(RegistrationSystem.checkPasswordComplexity(expected));
    
    }
    
    
    @Test
    public void testCheckPasswordComplexity_AssertFalse() {
        
    String expected = "password";
    assertFalse(RegistrationSystem.checkPasswordComplexity(expected));
   
    
    }
   
    
    @Test
    public void testRegisterUser() {
   
    
  
    
    }

    @Test
    public void testLoginUser_True() {
    
    RegistrationSystem.inputUsername = "kyl_1";
    RegistrationSystem.inputPassword = "Ch&&sec@ke99";
    LoginSystem.usernames ="kyl_1";
    LoginSystem.passwords = "Ch&&sec@ke99";
    assertTrue(RegistrationSystem.loginUser(usernames,passwords));
    
    
    
    }
     @Test
    public void testLoginUser2_False() {
    
    RegistrationSystem.inputUsername =  "kyl_1";
    RegistrationSystem.inputPassword ="Ch&&sec@ke99";
    LoginSystem.usernames = "ky1_1";
    LoginSystem.passwords = "Ch&&sec@ke99";
    assertFalse(RegistrationSystem.loginUser(usernames,passwords));
    
}
}