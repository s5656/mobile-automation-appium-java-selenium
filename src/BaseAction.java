import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseAction {
	
	public enum DIRECTION {
	    DOWN, UP, LEFT, RIGHT;
	}
	
	public static void swipe(AndroidDriver driver, DIRECTION direction, long duration) {
	    Dimension size = driver.manage().window().getSize();

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (direction) {
	        case RIGHT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.90);
	            endX = (int) (size.width * 0.05);
	            new TouchAction(driver)
                .press(new PointOption<>().withCoordinates(startY, endY))
                .moveTo(new PointOption<>().withCoordinates(startY, endY))
                .release()
	                    .perform();
	            break;

	        case LEFT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.05);
	            endX = (int) (size.width * 0.90);
	            new TouchAction(driver)
                .press(new PointOption<>().withCoordinates(startY, endY))
                .moveTo(new PointOption<>().withCoordinates(startY, endY))
	                    .release()
	                    .perform();

	            break;

	        case UP:
	            endY = (int) (size.height * 0.70);
	            startY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
                .press(new PointOption<>().withCoordinates(startY, endY))
	                    .moveTo(new PointOption<>().withCoordinates(startY, endY))
	                    .release()
	                    .perform();
	            break;


	        case DOWN:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
                .press(new PointOption<>().withCoordinates(startY, endY))
                .moveTo(new PointOption<>().withCoordinates(startY, endY))
	                    .release()
	                    .perform();

	            break;

	    }
	}
}
