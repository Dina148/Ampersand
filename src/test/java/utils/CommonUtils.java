package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class CommonUtils {

    public  static String readProperty(String key){
        String fileName = "src/test/resources/config.properties";
        File propFile=new File(fileName);
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(propFile));
        }catch (IOException ex){
           throw  new RuntimeException("Could not read from properties file: " + fileName);
        }
        return properties.getProperty(key);

    }





}
