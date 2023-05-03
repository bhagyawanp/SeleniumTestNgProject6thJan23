package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Rsources.CommonMethods;
import Rsources.Constant;
import Rsources.baseClass;
import pageObjectModel.LoginPageObjects;

public class VerifyLogin extends baseClass{
	

	@Test
	public void invalidLogin() throws IOException {
	
		
		LoginPageObjects  LPO=new LoginPageObjects (driver);
		
		LPO.enterUsername().sendKeys(Constant.username);
		LPO.enterPassword().sendKeys(Constant.password);
		LPO.clickLogin().click();
		
		
  
        String actualText=LPO.errorText().getText();
        String expctedText=Constant.loginExpectedMessage;
    	
  
       CommonMethods.handleAssertions(actualText,expctedText , "error message is not valid");
        
        
       //String privacyActualText=LPO.privacyText().getText();
    		   
       //String privacyExpctedText="Privacy";
       
      // CommonMethods.handleAssertions(privacyActualText,privacyExpctedText , "privayc text is not showing on screen");

		
     
       // CommonMethodns.handlseeAssertion(s.getFirstSelectedOption().getText(), "Option2","dd")
					
	}


	
	
	

}
