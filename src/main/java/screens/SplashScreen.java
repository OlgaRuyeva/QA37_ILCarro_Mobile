package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen {
    public SplashScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "")
    AndroidElement versionTextView;
    @FindBy(xpath = "")
    AndroidElement titleTextView;

    public String getCurrentVersion(){
        return versionTextView.getText();
    }
}
