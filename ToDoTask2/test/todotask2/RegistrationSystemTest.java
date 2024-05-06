/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package todotask2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testCheckUserName() {
   
    /* String actual = "kyi_1";
    // String message = "Welcome < user first name >,  <user last name> it is great to see you";
   assertEquals(true,RegistrationSystem.checkUserName(actual));
   */
   String username = "kyle!!!!!!!";
   assertEquals(false,RegistrationSystem.checkUserName(username));
  
 
    }

    @Test
    public void testCheckPasswordComplexity() {
    
    //String expected = "Ch&&sec@ke99!";
    //assertEquals(true,RegistrationSystem.checkPasswordComplexity(expected));
    String ex = "password";
    assertEquals(false,RegistrationSystem.checkPasswordComplexity(ex));
    
    
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testLoginUser() {
    }
    
}
