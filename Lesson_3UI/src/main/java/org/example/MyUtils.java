package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class MyUtils {

    public static File MakeScreenShot(WebDriver driver, String filename){
        File temp=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("./Lesson3_UI/"+filename);
        try {
            FileUtils.copyFile(temp,destination);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
