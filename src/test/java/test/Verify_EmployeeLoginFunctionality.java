package test;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import pages.LandingPage;



public class Verify_EmployeeLoginFunctionality extends Base {
    @Test

    public void verifyEmployeeLoginFunctionality() {
        //verify customer login functionality

        //navigate to URL
        //startUp();

        // go to url
        navigate("https://it.microtechlimited.com/");
        //..........landing page
        //Click Login Menu
        click(LandingPage.menuLogin);


        //..........employee login page
        //click customer login menu
        click(EmployeeLoginPage.menuEmployeeLogin);


        //enter employee user id
        sendKeys(EmployeeLoginPage.textEmployeeUserId,"testpilot@gmail.com");

        //enter employee Password
        sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");

        //click login button
        click(EmployeeLoginPage.btnEmployeeLogin);

        //..........employee home page
        //verify David's home page

        String welcomeMsg = getText(EmployeeHomePage.labelWelcomeMsg);
        Assert.assertEquals(welcomeMsg,"Welcome Test");


    }
}
