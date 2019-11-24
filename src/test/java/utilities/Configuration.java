package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Configuration {

    public static String getProperties(String key) throws IOException {
        //specify the needed file
        File credsFile = new File("src/test/resources/conf/Configuration.properties");
        //read from a file
        FileReader fileReader = new FileReader(credsFile);
        Properties properties = new Properties();
        properties.load(fileReader);
        String value = properties.getProperty(key);
        return value;
        ///Users/amirsmail/Downloads/CucumberFramework/src/test/resources/uiFeatures/EtsySearchFunctionality.feature
    }








    //file reader
}
