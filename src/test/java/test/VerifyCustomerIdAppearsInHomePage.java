package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;

public class VerifyCustomerIdAppearsInHomePage extends base.Base {
        @Test(priority = 2)
    public void verifyCustomerIdAppearsInHomePage() {

            //navigate to URL
            //I am in Landing Manu
            navigate("https://it.microtechlimited.com/");
            //login as Customer
            //i click on login manu
            CustomerLoginPage.loginAsCustomer();
            //..........customer home page
            //verify Test's home page
            String customerMsg = getText(By.xpath("//h2[contains(text(),'Customer')]"));
           // System.out.println("actual Msg: " + customerMsg);
            Assert.assertEquals(customerMsg, "Customer Id: 4");
        }

             @Test (priority =1)
            public void verifyMySecondTest(){

                //navigate to URL
                navigate("https://it.microtechlimited.com/");
                //login as Customer
                CustomerLoginPage.loginAsCustomer();
                //..........customer home page
                //verify Test's home page
                String customerMsg = getText(By.xpath("//h2[contains(text(),'Customer')]"));
               // System.out.println("actual Msg: "+customerMsg);
                Assert.assertEquals(customerMsg,"Customer Id: 4");

    }

}
