package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test (priority = 1,groups = "smoke" )//create new use test@test.com
  public void createUser() {
	  System.out.println("I am in hometest");
	  System.out.println("Before 1st Assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After 1st Assertion");
	  Assert.assertEquals("abc", "abc");
	  System.out.println("After 2nd assert");
  }
  
  @Test (priority = 2, dependsOnMethods = "createUser" ) //Edit user test@test.com
  public void editUser() {
	  System.out.println("Before assertion");
	  softAssert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After assertion");
	  softAssert.assertAll();
  }
  
  @Test (priority = 3, dependsOnMethods = "editUser" ) //DeleteUser test@test.com
  public void deleteUser() {
	  System.out.println("I am in end Test");
	  System.out.println("Before assertion");
	  softAssert.assertTrue(3>2, "Verifying Element");
	  System.out.println("After assertion");
	  softAssert.assertEquals("abc1", "abc1");
	  System.out.println("After Second Assertion");
	  softAssert.assertAll();
  }
}
