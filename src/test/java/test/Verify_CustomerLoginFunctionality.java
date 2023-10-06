package test;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class Verify_CustomerLoginFunctionality extends Base {
    @Test
    public void verifyCustomerLoginFunationality()  throws InterruptedException {
        //verify customer login functionality

        //navigate to URL
       // startUp();

        // go to url
        //I am in landing page
        navigate("https://it.microtechlimited.com/");

        //..........landing page
        //I click on  Login Menu
        click(LandingPage.menuLogin);

        //...........employee login  Page
        //I click on  customer login menu
        click(EmployeeLoginPage.menuCustomerLogin);

        //..........customer login page
        //enter customer user id
       sendKeys(CustomerLoginPage.textCustomerUserId,"david@gmail.com");
       Thread.sleep(500);

        //enter customer  Password
        sendKeys(CustomerLoginPage.textCustomerPassword,"1234");
        Thread.sleep(500);

        //click customer login button
       click(CustomerLoginPage.btnCustomerogin);
        Thread.sleep(500);

        //..........customer home page
        //verify test's home page
        String welcomeMsg = getText(CustomerHomePage.labelWelcomeMsg);
        Assert.assertEquals(welcomeMsg,"Welcome David");


//        if(welcomeMsg.contains("David"))
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");

    }

}
