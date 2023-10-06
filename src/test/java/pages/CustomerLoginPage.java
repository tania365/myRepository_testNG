package pages;

import base.Base;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import java.util.Stack;

public class CustomerLoginPage extends Base {
    //locators
    public static By textCustomerUserId= By.name("mailuid");
    public static By textCustomerPassword= By.xpath("//input[@name='pwd']");
    public static By btnCustomerogin= By.cssSelector("input[name=login-submit]");

    //Actions
   public static void loginAsCustomer(){
       //..........landing page
       //Click Login Menu
       click(LandingPage.menuLogin);

       //click customer login menu
       click(EmployeeLoginPage.menuCustomerLogin);

       //..........customer login page
       //enter customer user id
       sendKeys(CustomerLoginPage.textCustomerUserId,"david@gmail.com");

       //enter customer  Password
       sendKeys(CustomerLoginPage.textCustomerPassword,"1234");

       //click customer login button
       click(CustomerLoginPage.btnCustomerogin);


   }
}
