import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import constant.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppInstaller extends BaseAction {
	public static AndroidDriver driver;
	
 public static void main(String[] args) throws MalformedURLException {
  
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	
	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Program Files\\app\\com.freeletics.lite_23.17.0-23170007_minAPI26(nodpi)_apkmirror.com.apk");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver(url, desiredCapabilities);
	
	ActionScreen actionScreen = new ActionScreen();
	
	
	driver.findElement(By.id(actionScreen.getContinueButton())).click();
	driver.findElement(By.id(actionScreen.getContinueButton())).click();

	driver.findElement(By.id(actionScreen.getGetStartedBtn())).click();
	
	driver.findElement(By.xpath(actionScreen.getAcceptButton())).click();
	driver.findElement(By.xpath(actionScreen.getSelectMale())).click();
	
	driver.findElement(By.tagName(actionScreen.getNextButton())).click();
	
	driver.findElement(By.xpath(actionScreen.getSelectTheGoals())).click();
	
	driver.findElement(By.tagName(actionScreen.getNextButton())).click();

	WebElement horizontalScroll = (driver.findElement(By.xpath(actionScreen.getSlider())));
	
	((BaseAction) horizontalScroll).swipe(driver,DIRECTION.RIGHT, 0);
			
	driver.findElement(By.tagName(actionScreen.getNextButton())).click();
	
	List<WebElement> workoutType = driver.findElements(By.xpath(actionScreen.getWhatYouLikeToTrain()));
	for (WebElement webElement : workoutType) {
		webElement.click();
	}

	driver.findElement(By.xpath(actionScreen.getDateOfBirth())).click();
	driver.findElement(By.xpath(actionScreen.getWeight())).click();
	driver.findElement(By.xpath(actionScreen.getWeightText())).sendKeys(Constants.weight);
	driver.findElement(By.xpath(actionScreen.getHight())).click();
	driver.findElement(By.xpath(actionScreen.getHightText())).sendKeys(Constants.height);
	
	driver.findElement(By.tagName(actionScreen.getNextButton())).click();
	
	driver.findElement(By.id(actionScreen.getContinueWithEmail())).click();
	

	driver.findElement(By.id(actionScreen.getFirstName())).click();
	driver.findElement(By.id(actionScreen.getFirstName())).sendKeys(Constants.firstName);
	
	driver.findElement(By.id(actionScreen.getLastName())).click();
	driver.findElement(By.id(actionScreen.getLastName())).sendKeys(Constants.lastName);
	
	driver.findElement(By.id(actionScreen.getEmailAddress())).click();
	driver.findElement(By.id(actionScreen.getEmailAddress())).sendKeys(Constants.gmail);
	
	driver.findElement(By.id(actionScreen.getPassword())).click();
	driver.findElement(By.id(actionScreen.getPassword())).sendKeys(Constants.password);
	
	driver.findElement(By.id(actionScreen.getRegisterWithEmail())).click();

	}

}
